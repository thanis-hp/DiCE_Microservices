   DROP TABLE NOVA_COMMS_STG IF EXISTS;
   CREATE TABLE NOVA_COMMS_STG
   (  MESSAGE_ID VARCHAR(50),
   PTL_EXT_ID VARCHAR(50),
   SUBJECT VARCHAR(200),
   BODY VARCHAR(2000),
   RECIPIENTS VARCHAR(500),
   SENDER VARCHAR(100),
   STATUS VARCHAR(100),
   CREATED_TIME TIMESTAMP,
   NOTIFICATION_TYPE VARCHAR(50),
   PRIORITY VARCHAR(50)
   );
 
   DROP SEQUENCE nova_comms_unique_id_seq IF EXISTS;
   CREATE SEQUENCE nova_comms_unique_id_seq START WITH 1 INCREMENT BY 1;
   