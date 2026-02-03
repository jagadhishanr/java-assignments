import java.sql.*;

public class CheckDuplicateEmail {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employeeDb";
        String user = "root";
        String pass = "admin@sql9841";

        String email = "jagadhishan123@.com";
        String password = "password@tryAgain";

        String checkSql = "SELECT COUNT(*) FROM users WHERE email = ?";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(checkSql);
            ps.setString(1, email);

            ResultSet rs = ps.executeQuery();
            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Email already exists");
            } else {
                System.out.println("Email is available for insertion");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
