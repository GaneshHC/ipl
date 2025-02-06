package com.wecp.progressive.config;

<<<<<<< HEAD
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();

    static {
        loadProperties();
    }

    private static void loadProperties() {
 try (InputStream input = DatabaseConnectionManager.class.getClassLoader()
 .getResourceAsStream("application.properties"))
  {
            if (input == null) {
                throw new IllegalStateException("resource.properties not found in classpath");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("spring.datasource.url");
        String user = properties.getProperty("spring.datasource.username");
        String password = properties.getProperty("spring.datasource.password");
        return DriverManager.getConnection(url, user, password);
    }
}
=======
public class DatabaseConnectionManager {

}
>>>>>>> 3b5d29aab2f1fd95badf39a7a6b0ebb47a4171d1
