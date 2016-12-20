package my.com.tm.dice.ipay.microservices.testHelpers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class FileReaderHelper {

    public static String readFileContents(String fileName) throws IOException {
        if (StringUtils.isEmpty(fileName)) {
            throw new FileNotFoundException("Invalid or empty filename");
        }
        InputStream stream = null;
        try {
            stream = FileReaderHelper.class.getResourceAsStream(fileName);
            if (stream == null) {
                throw new FileNotFoundException("File with " + fileName + " not found");
            }
            return IOUtils.toString(stream);
        } finally {
            if (stream != null)
                stream.close();
        }
    }
}
