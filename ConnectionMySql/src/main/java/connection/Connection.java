package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    private static final String url = "jdbc:mysql://localhost:3306/kifesta";
    private static final String user = "root";
    private static final String pass = "";

    private static java.sql.Connection con;

    public static java.sql.Connection getConnection() {
        if (con == null) {
            try {
                con = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return con;
        }
        else {
            return con;
        }
    }
}
