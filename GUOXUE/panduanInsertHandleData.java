import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class panduanInsertHandleData implements ActionListener {    
   String [][] a;
   PreQuery query;
   int m;        
   panduanInsertHandleData() {
      query=new PreQuery();
   }
   public void setArray(String [][] a) {
      this.a =a;
   }
   public void actionPerformed(ActionEvent e) {
       Connection con;
       PreparedStatement sql;   
       try { String uri="jdbc:derby:GUOXUE;create=true"; 
             con=DriverManager.getConnection(uri);
             String SQL=
            "INSERT INTO panduanT VALUES(?,?,?,?,?,?)";
             sql=con.prepareStatement(SQL);
             sql.setString(1,a[0][0].trim()); 
             sql.setString(2,a[0][1].trim());
             sql.setString(3,a[0][2].trim()); 
             sql.setString(4,a[0][3].trim()); 
             sql.setString(5,a[0][4].trim()); 
             
             sql.setFloat(6,Float.parseFloat(a[0][5].trim()));
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException exp) { 
         JOptionPane.showMessageDialog
         (null,""+exp,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
      if(m!=0){
        query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM panduanT where number='"+a[0][0].trim()+"'");
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setVisible(true);
      }
      else {
        JOptionPane.showMessageDialog
        (null,"插入记录失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
}
