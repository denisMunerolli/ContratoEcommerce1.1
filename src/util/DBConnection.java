package util;

public class DBConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/*********************";
    private static final String USER = "***************************************";
    private static final String PASSWORD = "**********";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
	
}
