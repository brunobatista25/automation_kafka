package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class ReadYml {

    public static ReadYml value() { return new ReadYml(); }

    public static Properties lerArquivoYml(String arquivo) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        Properties properties = null;
        try {
            properties = mapper.readValue(new File("./src/test/resources/data/" + arquivo + ".yml"), Properties.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
