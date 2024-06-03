package org.example.singleton;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    private static Settings instance;
    private Map<String, String> config;

    private Settings() {
        config = new HashMap<>();
    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public void set(String key, String value) {
        config.put(key, value);
    }

    public String get(String key) {
        return config.get(key);
    }
}

