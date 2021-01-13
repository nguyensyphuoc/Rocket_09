package Backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Basic {
    private Properties properties;
    private Connection connection;

//    public Basic() {
//        properties = new Properties();
//        properties.load("");
//    }

    public void connect() throws IOException, ClassNotFoundException, SQLException {
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        // Register the drive class with DriverManager
            Class.forName(properties.getProperty("driver"));
        System.out.println(properties.getProperty("connect.success"));
    }
}
