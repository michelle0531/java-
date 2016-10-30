import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class panduanDeleteHandleData implements ActionListener {    
   JTextField inputNumber;
   PreQuery query;        // Query
   panduanDelete del;
   int m; 
   String na;
   panduanDeleteHandleData() {
   query=new PreQuery();
   }
   public void setPDelete(panduanDelete d){
      del=d;
    }
   public void setJTextField(JTextField ... text) {
      inputNumber = text[0];
   }
   public void actionPerformed(ActionEvent e) {
     if(e.getSource()==del.button1){
         na=inputNumber.getText().trim();
          doDelete();
      }

      if(e.getSource()==del.button2){
       na=inputNumber.getText().trim();
          doLook();
      }
}



private void doDelete(){

      Connection con;
      PreparedStatement sql=null;  

        try {
            String uri="jdbc:derby:GUOXUE;create=true"; 
            con=DriverManager.getConnection(uri);
            String SQL= "DELETE FROM panduanT where number='"+na+"'";
            sql=con.prepareStatement(SQL);
            m=sql.executeUpdate();
            con.close();       
            }
      catch(SQLException e) { 
         JOptionPane.showMessageDialog
         (null,""+e,"消息对话框", JOptionPane.WARNING_MESSAGE);
       } 
    if(m!=0){
        query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM panduanT where name='"+na+"'");
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
        (null,"删除记录失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      } 
}

 private void doLook() {
     query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM panduanT where name='"+na+"'");
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setVisible(true); }
}



