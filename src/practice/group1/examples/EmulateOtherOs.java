package practice.group1.examples;
// Helper class for emulating platform dependent behavior for other platforms
// than the real one

import java.util.Enumeration;
import java.util.Properties;

public class EmulateOtherOs {
    static char fileSeparatorReal = java.io.File.separatorChar;
    static String osNameReal = System.getProperty("os.name");

    public static void listAllSystemProperties() {
        Properties p = System.getProperties();
        @SuppressWarnings("rawtypes")
		Enumeration enuProp = p.propertyNames();
        while (enuProp.hasMoreElements()) {
            String propertyName = (String) enuProp.nextElement();
            String propertyValue = p.getProperty(propertyName);
            System.out.println(propertyName + ": " + propertyValue);
        }
    }

    public static void reset() throws Exception {
        Properties p = System.getProperties();
        p.setProperty("file.separator", String.valueOf(fileSeparatorReal));
        p.setProperty("os.name", osNameReal);
    }

    public static void emulateWindows() throws Exception {
        Properties p = System.getProperties();
        p.setProperty("file.separator", "\\");
        p.setProperty("os.name", "Windows 10");
    }

    public static void emulateLinux() throws Exception {
        Properties p = System.getProperties();
        p.setProperty("file.separator", "/");
        p.setProperty("os.name", "Linux");
    }

    public static void emulateMac() throws Exception {
        Properties p = System.getProperties();
        p.setProperty("file.separator", "/");
        p.setProperty("os.name", "Mac OS");
    }

    public static void listRelevantSystemProperties() {
        System.out.println("File.separator1:" + java.io.File.separatorChar);
        System.out.println("File.separator2:"
                + System.getProperty("file.separator"));
        System.out.println("OS.name:" + System.getProperty("os.name"));
    }

}
