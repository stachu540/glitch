package glitch;

import java.io.IOException;
import java.util.Properties;

public final class Property {

    private static final Properties prop = new Properties();
    public static final String VERSION = prop.getProperty("application.version");
    public static final String REVISION = prop.getProperty("git.commit.id.abbrev");

    static {
        try {
            prop.load(Property.class.getClassLoader().getResourceAsStream("git.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
