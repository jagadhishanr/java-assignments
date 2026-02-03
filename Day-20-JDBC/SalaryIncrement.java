import java.sql.*;

public class SalaryIncrement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employeeDb";
        String user = "root";
        String pass = "admin@sql9841";

 String department = "Be.CSE";

        String sql = "UPDATE employees SET salary = salary * 1.10 WHERE department = ?";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, department);

            int rows = ps.executeUpdate();
            System.out.println(rows + " employees salary updated");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
