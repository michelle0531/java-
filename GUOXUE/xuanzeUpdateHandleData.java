import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class xuanzeUpdateHandleData implements ActionListener { 
   JTextField inputID;
   JButton buttonLook,buttonUpdate;     
   String [][] a;
   PreQuery query;
   String num;
   int m;        
   xuanzeUpdateHandleData() {
      query=new PreQuery();
   }
   public void setArray(String [][] a) {
      this.a =a;
   }
   public void setJTextField(JTextField ... text) {
      inputID = text[0];
   }
   public void setJButton(JButton ... b) {
      buttonLook= b[0];
      buttonUpdate =b[1];
   }
   public void actionPerformed(ActionEvent e) {
       if(e.getSource()==buttonUpdate) {
          num=inputID.getText().trim();
          doGengxin();
       }
       else if(e.getSource()==buttonLook) {
          num=inputID.getText().trim();
          doLookRecord();
       }
   }
   private void doGengxin(){
       Connection con;
       PreparedStatement sql;   
       try { String uri="jdbc:derby:GUOXUE;create=true"; 
             con=DriverManager.getConnection(uri);
             String SQL=
  "update xuanzeT set number=?,content=?,pic=?,a=?,b=?,c=?,d=?,answer = ? where number='"+num+"'";
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
       catch(SQLException e) { 
         JOptionPane.showMessageDialog
         (null,""+e,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
       if(m!=0){
        query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM xuanzeT where number='"+num+"'");
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
        (null,"更新记录失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
   private void doLookRecord() {
        query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM xuanzeT where number='"+num+"'");
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setVisible(true); 
   }
}
