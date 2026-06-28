import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    private static Connection conn;

    public static Connection getKoneksi() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/db_pertanian";
            String user = "root";
            String pass = "";

            conn = DriverManager.getConnection(url, user, pass);

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            System.out.println("Koneksi Gagal : " + e.getMessage());

        }

        return conn;
    }
}