import java.sql.*;

public class dbConnection {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    private static final String DB_URL = "jdbc:mysql://localhost:3306/metadb";
    private static final String USER = "root";
    private static final String PASS = "root1234";

    private static Connection conn = null;

    public static Connection getInstance() {
        if(conn == null){
            try {
                Class.forName(JDBC_DRIVER);
                conn = DriverManager.getConnection(DB_URL, USER, PASS);
                System.out.println("DB 연결됨");
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
