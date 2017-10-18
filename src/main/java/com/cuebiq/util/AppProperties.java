package com.cuebiq.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author bvanchuhov
 */
public enum AppProperties {
    INSTANCE;

    public static final String PROPERTIES_FILE = "application.properties";

    private final Properties properties;

    AppProperties() {
        this.properties = readProperties();
    }

    private Properties readProperties() {
        try (InputStream inputStream = AppProperties.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
            Properties props = new Properties();
            props.load(inputStream);
            return props;
        } catch (IOException e) {
            throw new RuntimeException("Can't load properties from " + PROPERTIES_FILE, e);
        }
    }

    public String getString(String key) {
        String property = properties.getProperty(key);
        if (property == null) {
            throw new RuntimeException("application property '" + key + "' is not found");
        }
        return property;
    }
}
