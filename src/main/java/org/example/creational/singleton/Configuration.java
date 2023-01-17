package org.example.creational.singleton;

public class Configuration {

    private static Configuration instance;
    private String setting1;
    private String setting2;
    private String setting3;

    // Private constructor to prevent direct instantiation
    private Configuration() {
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getSetting1() {
        return setting1;
    }

    public void setSetting1(String value) {
        setting1 = value;
    }

    public String getSetting2() {
        return setting2;
    }

    public void setSetting2(String value) {
        setting2 = value;
    }

    public String getSetting3() {
        return setting3;
    }

    public void setSetting3(String value) {
        setting3 = value;
    }
}
