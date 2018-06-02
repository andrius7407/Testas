package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test_kcs";
    private static final String NAME = "root";
    private static final String PASSWORD = "";

    public static Connection sukurtiRysi(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("prisijungti nepavyko" + e);
        }
        return connection;
    }

}

