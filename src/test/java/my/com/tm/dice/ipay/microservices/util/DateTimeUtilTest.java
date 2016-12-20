package my.com.tm.dice.ipay.microservices.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;
import my.com.tm.dice.ipay.microservices.exception.InvalidDateTimeInputException;
import my.com.tm.dice.ipay.microservices.exception.InvalidDateTimeInputException;

import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:microservices-servlet-test.xml")
public class DateTimeUtilTest extends TestCase {

    private static final String UNSUPPORTED_FORMAT = "YYYY_MM_DD";
    private static final String FORMAT_MM_DD_YYYY_HH_MM_SS = "MM/dd/yyyy hh:mm:ss";
    private static final String FORMAT_DD_MM_YYYY_HH_MM_SS = "dd/MM/yyyy hh:mm:ss";
    private static final String FORMAT_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    private static final String FORMAT_DD_MM_YYYY = "dd/MM/yyyy";
    private static final String FORMAT_MM_DD_YYYY = "MM/dd/yyyy";

    @Test
    public void testGetFormattedPreviousDate() {
        String formattedPrevDate = DateTimeUtil.getFormattedPreviousDate(FORMAT_DD_MM_YYYY);

        DateTime yesterday = new DateTime().minusDays(1);
        String formattedYesterday = new SimpleDateFormat(FORMAT_DD_MM_YYYY).format(yesterday.toDate());
        assertEquals(formattedYesterday, formattedPrevDate);

    }

    @Test
    public void testGetFormattedCurrentTime() {
        String formattedNow = DateTimeUtil.getFormattedCurrentTime(FORMAT_DD_MM_YYYY_HH_MM_SS);
        String[] splitOnSpace = formattedNow.split(" ");
        assertEquals(2, splitOnSpace.length);
        assertEquals(3, splitOnSpace[0].split("/").length);
        assertEquals(3, splitOnSpace[1].split(":").length);
    }

    @Test
    public void testgetFormattedNow() {
        String formattedNow = DateTimeUtil.getFormattedNow();
        String[] splitOnSpace = formattedNow.split(" ");
        assertEquals(2, splitOnSpace.length);
        assertEquals(3, splitOnSpace[0].split("/").length);
        assertEquals(3, splitOnSpace[1].split(":").length);
    }

    @Test
    public void testFormat() throws InvalidDateTimeInputException {
        String formattedDate = DateTimeUtil.format(new Date(), FORMAT_DD_MM_YYYY);
        assertNotNull(formattedDate);
        assertEquals(3, formattedDate.split("/").length);
    }

    @Test(expected = InvalidDateTimeInputException.class)
    public void testFormatInvalidFormat() throws Exception {
        DateTimeUtil.format(new Date(), UNSUPPORTED_FORMAT);

    }

    @Test
    public void testGetCurrentTime() {
        assertNotNull(DateTimeUtil.getCurrentTime());
    }

    @Test
    public void testGetListOfDates() {

        DateTime start = new DateTime();
        DateTime end = start.plusDays(10);
        List<String> listOfDates = DateTimeUtil.getListOfDates(start, end, FORMAT_DD_MM_YYYY);
        assertEquals(10, listOfDates.size());
    }
}
