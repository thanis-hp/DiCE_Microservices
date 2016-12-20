# microservice-middleware

####Hardware requirements




####Software requirments


##### Project setup
* Install JDK 1.6 (Or if you can't find 6, install 7 and change the Java compiler version to 6 in Eclipse or IntelliJ).
* Install Apache Maven 3.0 or above
* Install Eclipse Juno or above
* Install m2e plugin for Eclipse
* Install Oracle XE 11g version (We also have a client provided database but that needs us to be on the VPN which has its own issues)
* Install a SQL client so we can connect to Oracle and write queries
* Install Git client (Atlassian SourceTree if you prefer a GUI interface)
* Git clone project from this repo: https://github.com/digitize-my-telco/microservice-middleware.git
* Import project into Eclipse using the Import Exisiting Maven Projects Wizard.
	* Edit your project facet by going to Project Properties
	*   Change your Java Facet to 1.6 (if it's not 1.6)
	*   Add a new Facet 'Dynamic Web Module' with version 3.0
	* If you want to do hot deployment of code to Jboss right from Eclipse, do the following
		*   On the right side, add a runtime for the project by clicking on Runtimes tab and then 'New'.
		*   Download additional server adapters from the link above (if you don't see Jboss runtime there)
		*   You may have to restart Eclipse for the changes to take effect. 
		*   Once installed, open the same Runtime option and if you don't see the JBoss runtime, install the JBoss runtime. 
		*   Choose Jboss 6.1 runtime once it's installed.
* In the project, right click on pom.xml and check if you have Maven as a option in the drop down. And that we are able to add dependenices to the project.
* Connect to the admin console of your Jboss 6.1 runtime and configure a datasource with the JNDI name java:jboss/portal
		
		AFTER IMPORTING MAVEN PROJECT IN ECLIPSE, NEVER RIGHT CLICK ON PROJECT AND DO A UPDATE PROJECT. It will mess up your life and nobody will help you if you do.
* When you run Maven, Jaxb will generate classes but you might have to explicitly add the generated-sources/jaxb folder to the list of source folders in your project's build path in eclipse.

##### Running the project
Assumptions:

* You have the Jboss 6.1 server running from ${JBOSS_HOME}
* You also have a ${USER_HOME}/.m2/settings.xml file

Environments:

* dev -- this is the local developer laptop (all things local)
* sit -- this is the environment which the PO and testers use to test the application
* uat -- this is the environment which the users will use to test the application
* pre-prod -- this will be used for infra/security/regression testing
* prod -- you know this.

We have different config files for each of these environments. The next section talks about how to get the application to run in local JBoss. 

#####One time setup

* Open ${USER_HOME}/.m2/settings.xml (if it doesn't exist, create it)
* Add the following lines to it

			<activeProfiles>
			    <activeProfile>inject-jboss-home</activeProfile>
			  </activeProfiles>
			<profiles>
		    <profile>
			      <id>inject-jboss-home</id>
			      <properties>
			        <jboss-home>${YOUR_JBOSS_INSTALLATION_DIRECTORY}</jboss-home>
		    	  </properties>
		    </profile>
		    </profiles>

* Make sure the set `${YOUR_JBOSS_INSTALLATION_DIRECTORY}` to your JBoss 6.1.0.Final installation location. 
* To start JBoss, go to ${JBOSS_HOME}/bin and do `./run.sh`
>
		By default, JBoss starts up in 8080 and if you you something else running on 8080, you might want to do "./run.sh -Djboss.service.binding.set=ports-01". This will start JBoss at 8180. 
* Navigate to your JBoss admin at [http://localhost:8080/admin-console/index.seam]() or 8180, but I'm going to keep using 8080, change it as you need it.
* Use `admin/admin` as username/password
* If you are on JBoss 6.1.x, you might have to copy ojdbc6.jar to the `/Users/prabharangopalan/software/jboss-6.1.0.Final/server/default/deploy/` folder.
* If you are on JBos 6.2.x, go to the admin console, and deploy the ojdbc6.jar through the UI and enable the jar after deployment. Without which, you won't be able to create/use the datasource to the Oracle database.
* Go to Resources/Datasources/Local Tx Datasources link on the left nav pane and 'Add a new resource' and choose 'Oracle Local Tx Template'
* Give the name as `local/portalDS`
* Username will be 'system' (default user available in Oracle database that we installed)
* Password will be 'Manager' by default. If you have changed it, use the new one. 
* Driver class will be `oracle.jdbc.driver.OracleDriver`
* Connection URL will be `jdbc:oracle:thin:@localhost:1521:XE`

		If you are on Windows, this will hold good. 
		If you are on Mac, you will be most likely running it in a VM. Establish a port forwarding (if you are using VirtualBox or similar for other VMs) to connect to the DB running inside the VM and use localhost:1521 (so that configuration will be same across boxes).

If you face an error from the codebase while connecting to Oracle DB of invalid username/password, you can put the following lines after `connection-url` in `$JBOSS_HOME/server/default/deploy/local_portalDS-ds.xml`

```
<user-name>system</user-name>
<password>Manager</password>
```
* Log file location is `/var/log/microservices` - Make sure you have this directory and also that the user who is running JBoss has write permissions on this directory.


######From command line
**Each time to run the application**

* Make sure JBoss is running. 		
* To run, execute `mvn clean package -Dmaven.test.skip=true -Dprofile-id=dev`


		The maven.test.skip=true is needed for the next couple of days since test cases are broken now. Once that is fixed, we 'should' remove that for the dev profile.

* This profile does the following:
	* Cleans up the target directory
	* Generates source code from the schema files provided (xmlbeans plugin)
	* Skips the tests (since we ask it to)
	* Packages the application as a WAR file
	* Copies the WAR file to the JBoss deployment directory. 
	* If all is well and Jboss is running, the app should be deployed and will be available at [http://localhost:8080/microservices/discover/postcodes?postCode=512011]() or 8180, depending on your JBoss port. 
	
* Maven will download all the dependencies the first time you run the application. 
* For other profiles (sit|uat|pre-prod|prod), it is highly recommended that we **ALWAYS** skip the tests since we'll be connecting to client environment and we don't want our tests to 'accidentally' run against their database. 
		
		[Praba] I'll work on making sure this doesn't happen even by 'accident' by tweaking the profile settings but that's for later. Not a P1. 
		DO NOT RUN TESTS WITH OTHER PROFILES ANYWHERE. ALWAYS USE -Dprofile-id=dev!!!


###### Code coverage setup
This project uses the Cobertura to measure code coverage. To run the coverage analysis, you must do `mvn cobertura:cobertura` This will run the tests and will generate the report inside the `target` directory. 

Cobertura configuration is in the `pom.xml`


######From within Eclipse
Check the below screenshot:
![Run mvn in Eclipse](https://cloud.githubusercontent.com/assets/644353/8744767/70c3a4f4-2c97-11e5-8669-eb135a90528e.png)

	Note how we 'skiptests' and also pass the profile-id as argument to the mvn commands.

####Import DB
Before the Oracle DB import is done, make sure create a tablespace by running the following query: 

`create tablespace PORTAL_CUSTOM_TABLES DATAFILE 'portal.dat' size 10M AUTOEXTEND ON;`

Refer to `https://oracle-base.com/articles/misc/sql-developer-31-data-pump-wizards` for importing DB from .dump file.

####SIT/UAT/PRE-PROD/PROD JBoss 6.2.x deployment instructions
1. ojdbc jar needs to be 'deployed' before creating a datasource and before deploying our applicait
2. rowset.jar needs to be 'deployed' before we deploy and use our application. Spring delegates to the RowSet implementation which was part of the 6.1 deployment model but 6.2 and above don't work. So, we need to add this and redeploy the application (if the app was deployed already)
3. Log file location is `/var/log/microservices/` - make sure the user running JBoss has write permissions to this directory.

##### Build server setup
Make sure you are in the secure VPN to access the below boxes.
IP: 10.54.5.192 
root/p@ssw0rd

###### Install Jenkins
	wget -O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat/jenkins.repo
	rpm --import https://jenkins-ci.org/redhat/jenkins-ci.org.key

Install an older version of Jenkins which is compatible with Java 6

	yum install jenkins-1.611-1.1
	

set jenkins to be started on system startup.

	chkconfig jenkins on
	service jenkins start
	
######Jenkins slack integration
* Open Slack, Select 'Configure Integrations' from the pull down menu near the team name.
* Select Jenkins and create a token
* Team name `telcodigitization`
* Integration token `yDwb87i2ZtlGBr3ErtsZAjiA`
* Go to Jenkins and add Slack plugin and configure global Slack config
* Configure Slack integration per build.

###### Env details
Setup:

Jenkins/Jboss - build server
FE: 10.54.5.192

JBoss - webserver SIT/UAT
ip: 10.54.5.191
url: http://10.54.5.191:9990

username admin
password jboss1029#


SSH for the above 2 boxes 
ID: root
Password: p@ssw0rd

Login to 191 or 192 above and then you can SSH to 
Ip : 10.54.4.159
Port : 1521
Username : system
Password : Manager1
SID: IJOINDEV

In Mac, if you want to connect to the DB, create a tunnel
`ssh -L 8888:10.54.43.104:1521 root@10.54.5.191`
<To_Be_Updated>

##### SIT/UAT Env details
###### UAT1

EAI Sync
10.14.28.219  7001

EAI Async
10.14.28.219 8001

PORTAL
10.14.2.80  7001


###### SIT 2
Sync
10.14.86.36  si2eaiapp02-vip  7280

Async
10.14.86.35  si2eaiapp01-vip   7281

PORTAL
10.14.29.244  7280
10.14.29.118  7280

###### Deployments

Most of the deployments are automated. Read how to deploy both middleware and UI at 

`https://github.com/digitize-my-telco/microservice-middleware/wiki/Deployments`
