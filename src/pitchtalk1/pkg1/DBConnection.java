package pitchtalk1.pkg1;

import java.sql.*;
import javax.swing.*;


public class DBConnection {
    public Connection mycon;
    public Statement stmt; 
    public ResultSet rs;
    public PreparedStatement pst;
    boolean status = false;
 
    public DBConnection(){    
        //connect to database
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/users";
            String user = "root";
            String pw = "";
            mycon = DriverManager.getConnection(url, user, pw);
            stmt = mycon.createStatement();    
            System.out.println("Database Connected!");
            status = true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Unable to Connect"+" "+e.getMessage( ));
            status = false;
        }
    }
            
//              public DBConnection(String aSpecialID){    
//        //connect to database
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://"+aSpecialID+"/student";
//            String user = "root";
//            String pw = "";
//            con = DriverManager.getConnection(url, user, pw);
//            stmt = con.createStatement();    
//            System.out.println("Database Connected!");
//            status = true;
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Unable to Connect"+" "+e.getMessage( ));
//            status = false;
//            
//        }
//    }
  
        
        
    
      public boolean connectionStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
      }
}
   
    

