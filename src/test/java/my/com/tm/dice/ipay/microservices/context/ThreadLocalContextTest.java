package my.com.tm.dice.ipay.microservices.context;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:microservices-servlet-test.xml")
public class ThreadLocalContextTest extends TestCase {

    @Test
    public void testGetClientIp() throws InterruptedException {
        ThreadLocalContext ctx = new ThreadLocalContext(); // dummy to keep coverage happy.
        IpSetter setterOne = new IpSetter("10.54.5.191", false);
        setterOne.start();

        IpSetter setterTwo = new IpSetter("10.54.5.192", false);
        setterTwo.start();
    }

    @Test
    public void testGetClientIpRemovedInstance() throws InterruptedException {

        IpSetter setterOne = new IpSetter("10.54.5.192", true);
        setterOne.start();

    }

    private class IpSetter extends Thread {
        private String ip;
        boolean shouldClear = false;

        IpSetter(String ip, boolean shouldClear) {
            this.shouldClear = shouldClear;
            this.ip = ip;
        }

        @Override
        public void run() {
            ThreadLocalContext.setClientIP(ip);
            // just to be sure the we are accessing the IP from one level down in the thread and not in the same method
            assertEquals(ip, new IpConsumer().getIp());
            if (shouldClear) {
                ThreadLocalContext.removeInstance();
                assertNull(new IpConsumer().getIp());
            }
        }
    }

    private class IpConsumer {
        public String getIp() {
            return ThreadLocalContext.getClientIP();
        }
    }

}
