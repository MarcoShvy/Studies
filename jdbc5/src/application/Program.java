package application;
import db.DB;
import db.DbIntegrityException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {
    public static void main(String[] args) throws ParseException {

        Connection conn = null;
        PreparedStatement st = null;

    try {
        conn = DB.getConnection();

        st = conn.prepareStatement("DELETE FROM department WHERE(ID = ?)");
        st.setInt(1, 6);

        int rows = st.executeUpdate();

        System.out.println("Done! new rows = "+ rows);
    } catch (SQLException e) {
        throw new DbIntegrityException(e.getMessage());
    }
      finally {
          DB.closeStatement(st);
          DB.closeConnection();
      }
    }
}
