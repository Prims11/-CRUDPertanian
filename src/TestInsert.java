import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestInsert {

    public static void main(String[] args) {

        try {

            Connection conn = Koneksi.getKoneksi();

            String sql =
                "INSERT INTO hasil_panen(kode, komoditas, jumlah, harga) VALUES (?,?,?,?)";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, "P001");
            pst.setString(2, "Padi");
            pst.setInt(3, 500);
            pst.setDouble(4, 6000);

            pst.executeUpdate();

            System.out.println("Data Berhasil Disimpan");

        } catch (Exception e) {

            System.out.println("Error : " + e.getMessage());

        }
    }
}