import java.sql.*;

public class LoginValidation {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employeeDb";
        String user = "root";
        String pass = "admin@sql9841";
        String password = "password@tryAgain";
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid credentials");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
