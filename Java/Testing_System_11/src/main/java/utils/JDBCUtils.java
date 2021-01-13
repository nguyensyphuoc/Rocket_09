package utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtils {
    private Connection connection;
    private DatabaseProperties databaseProperties;

    /**
     * Constructor for class JdbcUtils.
     *
     * @Description: .
     * @author: syPhuoc
     * @create_date: January 12, 2021
     * @version: 1.0
     * @modifer: SyPhuoc
     * @modifer_date: January 12, 2021
     * @throws IOException
     */
    public JDBCUtils() throws IOException {
        databaseProperties = new DatabaseProperties();
    }

    public void connectForTesting() throws ClassNotFoundException, SQLException {
        String url = databaseProperties.getProperty("url");
        String username = databaseProperties.getProperty("username");
        String password = databaseProperties.getProperty("password");

        // step 1: register the drive class with DriverManager
        Class.forName(databaseProperties.getProperty("driver"));

        // step 2: get a database connection
        connection = DriverManager.getConnection(url, password, username);

        System.out.println("Connect success!");
    }

    public Connection connect() throws ClassNotFoundException, SQLException {
        String url = databaseProperties.getProperty("url");
        String username = databaseProperties.getProperty("username");
        String password = databaseProperties.getProperty("password");

        // step 1: register the driver class with DriverManager
        Class.forName(databaseProperties.getProperty("driver"));

        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }

    public void disconnect() throws SQLException {
        connection.close();
    }
}
