package org.example.creational.singleton;

/*
    The code defines a Java class called "Configuration" that implements the Singleton pattern. The class has several
    private properties such as setting1, setting2, setting3 and a private constructor to prevent direct instantiation
    of the class.
    The class has a static method called 'getInstance()' which returns the single instance of the class.
    This method first checks if an instance of the class already exists, and if not, creates a new instance.
    This ensures that there is only ever one instance of the class in memory.
    The class also has getter and setter methods fo each of the private properties.
    This allows other parts of the application to access and modify the settings contained within the
    Configuration project.
    So the class allows to create a singleton object of the Configuration class, which is able to
    store the settings and can be accessed and modified by other parts of the application through the getter
    and setter methods.

 */

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
