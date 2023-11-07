import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url = "jdbc:mysql://localhost:3306/mensajes_app";
    private static String user = "root";
    private static String pass = "admin";
    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if(pool == null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(user);
            pool.setPassword(pass);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(10);
            pool.setMaxTotal(10);
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
