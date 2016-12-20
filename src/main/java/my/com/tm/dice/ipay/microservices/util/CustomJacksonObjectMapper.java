package my.com.tm.dice.ipay.microservices.util;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Custom {@link ObjectMapper} to let Jackson serialize fields without getters/setters (properties). This configuration will set the
 * getter/setter visibility to {@link JsonAutoDetect.Visibility#NONE}
 * 
 * @author prabharangopalan
 * 
 */
public class CustomJacksonObjectMapper extends ObjectMapper {

    public CustomJacksonObjectMapper() {
        this.setVisibilityChecker(getSerializationConfig().getDefaultVisibilityChecker().withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                .withGetterVisibility(JsonAutoDetect.Visibility.NONE).withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
    }
}
