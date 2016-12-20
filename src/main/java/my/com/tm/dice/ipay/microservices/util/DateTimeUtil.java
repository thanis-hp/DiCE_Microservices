package my.com.tm.dice.ipay.microservices.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

import my.com.tm.dice.ipay.microservices.exception.InvalidDateTimeInputException;
import my.com.tm.dice.ipay.microservices.exception.InvalidInputException;
import my.com.tm.dice.ipay.microservices.exception.SystemException;
import my.com.tm.dice.ipay.microservices.exception.InvalidDateTimeInputException;
import my.com.tm.dice.ipay.microservices.exception.InvalidInputException;
import my.com.tm.dice.ipay.microservices.exception.SystemException;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeUtil {

    // constants to use for date time conversions
    private static final String FORMAT_MM_DD_YYYY_HH_MM_SS = "MM/dd/yyyy hh:mm:ss";
    private static final String FORMAT_DD_MM_YYYY_HH_MM_SS = "dd/MM/yyyy hh:mm:ss";
    private static final String FORMAT_MM_DD_YYYY_HH_MM_SS_24H = "MM/dd/yyyy HH:mm:ss";
    private static final String FORMAT_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSSX";
    private static final String FORMAT_DD_MM_YYYY = "dd/MM/yyyy";
    private static final String FORMAT_MM_DD_YYYY = "MM/dd/yyyy";
    private static final String[] FORMATS_AVAILABLE = { FORMAT_MM_DD_YYYY_HH_MM_SS, FORMAT_DD_MM_YYYY_HH_MM_SS, FORMAT_ISO, FORMAT_DD_MM_YYYY,
            FORMAT_MM_DD_YYYY, FORMAT_MM_DD_YYYY_HH_MM_SS_24H };
    private static final String INVALID_DATE_FORMAT = "Invalid date format";

    static Logger logger = Logger.getLogger(DateTimeUtil.class);

    /**
     * Returns the current time formatted in the format specified by {@link DateTimeUtil#TIME_STAMP_FORMAT}
     * 
     * @return
     */
    public static String getFormattedCurrentTime(String format) {
        return new SimpleDateFormat(format).format(Calendar.getInstance().getTime());
    }

    /**
     * Returns the current time formatted in the format specified by {@link DateTimeUtil#TIME_STAMP_FORMAT}
     * 
     * @return
     */
    public static String getFormattedPreviousDate(String format) {
        Calendar date = Calendar.getInstance();
        date.add(Calendar.DATE, -1);
        return new SimpleDateFormat(format).format(date.getTime());
    }

    public static String getFormattedNow() {
        return new SimpleDateFormat(FORMAT_DD_MM_YYYY_HH_MM_SS).format(Calendar.getInstance().getTime());
    }
    
    public static String getBookingSwiftFormattedNow() {
        return new SimpleDateFormat(FORMAT_MM_DD_YYYY_HH_MM_SS_24H).format(Calendar.getInstance().getTime());
    }

    /**
     * Returns the current date converted to the time zone specified by {@link DateTimeUtil#LOCAL_TIMEZONE}
     * 
     * @param date
     *            in ISO Format
     * @return Date
     * @throws my.com.tm.dice.ipay.microservices.exception.InvalidDateTimeInputException
     */
    public static Date convertToTimeZone(String date, String format, String timeZone) throws InvalidDateTimeInputException {
        if (isSupportedFormat(format)) {
            try {
                DateTime dateTime;
                if (format.equals(FORMAT_ISO))
                    dateTime = new DateTime(DateTime.parse(date));
                else
                    dateTime = new DateTime(DateTime.parse(date, DateTimeFormat.forPattern(format)));
                DateTime dateTimeWithLocalZone = dateTime.withZone(DateTimeZone.forID(timeZone));
                return dateTimeWithLocalZone.toDate();
            } catch (Exception exception) {
                throw new InvalidDateTimeInputException(exception.getMessage());
            }
        } else {
            throw new InvalidDateTimeInputException("Unsupported Format");
        }

    }

    /**
     * Returns the String formatted when date and format specified are provided
     * 
     * @param date
     *            - Date
     * @param format
     *            - Time Zone format to be converted to
     * @return Date
     * @throws InvalidDateTimeInputException
     */
    public static String format(Date date, String pattern) throws InvalidDateTimeInputException {
        logger.debug("Format: " + pattern);
        if (isSupportedFormat(pattern)) {
            try {
                return DateTimeFormat.forPattern(pattern).print(new DateTime(date));
            } catch (Exception exception) {
                throw new InvalidDateTimeInputException(exception.getMessage());
            }
        } else {
            throw new InvalidDateTimeInputException("Unsupported Format");
        }
    }

    /**
     * Checks whether supplied format supported by the library
     * 
     * @param format
     *            - Format to be modified
     */

    private static boolean isSupportedFormat(String format) {
        return Arrays.asList(FORMATS_AVAILABLE).contains(format);
    }

    public static DateFormat getDateFormater(String formatString, String timeZoneString) {
        DateFormat dateFormat = new SimpleDateFormat(formatString);
        /**
         * TODO : Use joda DateTimeZone for time zone conversion to get time zone ID.To align with a single time zone reference rather than
         * have different for swift in domain.properties. we are not taking care of it as it is a risk to test the complete system.
         */
        TimeZone timeZone = TimeZone.getTimeZone(timeZoneString);
        dateFormat.setTimeZone(timeZone);
        return dateFormat;
    }

    public static DateTime getCurrentTime() {
        return new DateTime();
    }

    public static Date getTime(String time, DateFormat appliedFormat) throws InvalidInputException {
        try {
            return new Date(appliedFormat.parse(time).getTime());
        } catch (ParseException exception) {
            throw new InvalidInputException(INVALID_DATE_FORMAT);
        }
    }

    public static Date getTimeFormated(String time, String timeFormat, String timeZoneId) throws InvalidDateTimeInputException {
        try {
            return new Date(DateTimeUtil.getDateFormater(timeFormat, timeZoneId).parse(time).getTime());
        } catch (ParseException e) {
            throw new InvalidDateTimeInputException(INVALID_DATE_FORMAT);
        }
    }

    public static int getDifferenceInMinutes(Date startTime, Date endTime) {
        DateTime start = new DateTime(startTime);
        DateTime end = new DateTime(endTime);
        Minutes minutes = Minutes.minutesBetween(start, end);
        return minutes.getMinutes();
    }

    public static List<String> sortDates(Set<String> set, DateFormat dateFormat) throws ParseException {
        ArrayList<Date> dates = getDateList(set, dateFormat);
        Collections.sort(dates);
        return getDatesAsString(dates, dateFormat);
    }

    public static List<String> getDatesAsString(ArrayList<Date> dates, DateFormat dateFormat) {
        List<String> set = new ArrayList<String>();
        for (Date date : dates) {
            String dateString = dateFormat.format(date);
            set.add(dateString);
        }
        return set;
    }

    private static ArrayList<Date> getDateList(Set<String> set, DateFormat dateFormat) throws ParseException {
        ArrayList<Date> dates = new ArrayList<Date>();
        for (String dateString : set) {
            Date date = new Date(dateFormat.parse(dateString).getTime());
            dates.add(date);
        }
        return dates;
    }

    public static List<String> getListOfDates(DateTime start, DateTime end, String format) {
        List<String> dates = new ArrayList<String>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(format);
        for (int i = 0; i < getNumberOfDays(start, end); i++) {
            DateTime dateTime = start.withFieldAdded(DurationFieldType.days(), i).withTimeAtStartOfDay();
            dates.add(dateTime.toString(dateTimeFormatter));
        }
        return dates;
    }

    public static int getNumberOfDays(DateTime start, DateTime end) {
        return Days.daysBetween(start.withTimeAtStartOfDay(), end.withTimeAtStartOfDay()).getDays();
    }

    public static Date getOutputTimeFormated(String time, String outputTimeFormat, String outputTimeZoneID) throws SystemException {
        try {
            return new Date(DateTimeUtil.getDateFormater(outputTimeFormat, outputTimeZoneID).parse(time).getTime());
        } catch (ParseException exception) {
            throw new SystemException();
        }
    }

}
