import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "postgres";

    public static void main(String[] args) {
        Connection connection = null;
        String sql = "SELECT * FROM employees";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("NAME: " + resultSet.getString("name"));
                System.out.println("POSITION: " + resultSet.getString("position"));
                System.out.println("SALARY: " + resultSet.getInt("salary"));
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Veritabanı hatası: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Bağlantı kapatma hatası: " + e.getMessage());
            }
        }
    }
}
