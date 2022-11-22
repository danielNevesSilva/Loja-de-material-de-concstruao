package Connection;
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection Connection() {
      
        return null;
      
    }

    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/projetoevolucao";
    private final String USER = "root";
    private final String PASS = "";

    public Connection getConnection() throws ClassNotFoundException{
   
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);

    }

    /**
     *
     * @param con
     */
   /* public static void closeConnection(Connection con) {
        try {

            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

       public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
           
           try {

            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
        public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
           
           try {

            if (rs != null) {
                rs.close();
            }
       } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }*/

}
}