package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String url = "jdbc:mysql://localhost:3306/kifesta";
    private static final String user = "root";
    private static final String password = "";

    private static Connection con;

    public static Connection getConnection() {
        if(con == null) {
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }
}
