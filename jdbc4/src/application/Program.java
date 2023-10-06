package application;
import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {
    public static void main(String[] args) throws ParseException {

        Connection conn = null;
        PreparedStatement st = null;

    try {
        conn = DB.getConnection();

        st = conn.prepareStatement("update seller set BaseSalary = BaseSalary + ? where(DepartmentId = ?)");

        st.setDouble(1, 200);
        st.setInt(2, 2);
        int rows = st.executeUpdate();

        System.out.println("Done! new rows = "+ rows);
    } catch (SQLException e) {
        e.printStackTrace();
    }
        finally {
          DB.closeStatement(st);
          DB.closeConnection();
      }
    }
}
