import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class xuanzeInsertHandleData implements ActionListener {    
   String [][] a;
   PreQuery query;
   int m;        
   xuanzeInsertHandleData() {
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
            "INSERT INTO xuanzeT VALUES(?,?,?,?,?,?,?,?)";
             sql=con.prepareStatement(SQL);
             sql.setString(1,a[0][0].trim()); 
             sql.setString(2,a[0][1].trim());
             sql.setString(3,a[0][2].trim()); 
             sql.setString(4,a[0][3].trim()); 
             sql.setString(5,a[0][4].trim()); 
             sql.setString(6,a[0][5].trim()); 
             sql.setString(7,a[0][6].trim()); 
             sql.setFloat(8,Float.parseFloat(a[0][7].trim()));
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException exp) { 
         JOptionPane.showMessageDialog
         (null,""+exp,"��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
       }   
      if(m!=0){
        query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM xuanzeT where number='"+a[0][0].trim()+"'");
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
        (null,"�����¼ʧ��","��Ϣ�Ի���", JOptionPane.WARNING_MESSAGE);
      }
   }
}
