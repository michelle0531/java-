import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class AddPanduanHandleData implements ActionListener {    
   AddPanduanShitiView view;
   Connection con;
   PreparedStatement sql;
   PreQuery query;
   String SQL;
   int m; 
   AddPanduanHandleData() {
      query=new PreQuery();
      try {
         String uri="jdbc:derby:GUOXUE;create=true"; 
         con=DriverManager.getConnection(uri);
         SQL = "create table panduanT"+
           "(number char(10) primary key not null,"+
            "content varchar(200)," + 
            "pic  varchar(15),"+
            "T  varchar(6),"+
            "F  varchar(6),"+
            "answer varchar(6))";
         sql=con.prepareStatement(SQL);
         sql.execute();
         con.close();
      }
      catch(SQLException exp){}
   }
   public void setAddPanduanShitiView(AddPanduanShitiView v) {
      view = v;
   }
   public void actionPerformed(ActionEvent e) {
      String id="";
      try {  String uri="jdbc:derby:GUOXUE;create=true"; 
             con=DriverManager.getConnection(uri);
             SQL="INSERT INTO panduanT VALUES(?,?,?,?,?,?)";
             sql=con.prepareStatement(SQL);
             id=view.inputNumber.getText().trim(); 
             sql.setString(1,id); 
             sql.setString(2,view.inputContent.getText().trim()); 
             sql.setString(3,view.inputPic.getText().trim()); 
             sql.setString(4,view.inputRight.getText().trim()); 
             sql.setString(5,view.inputError.getText().trim());
             sql.setString(6,view.inputAnswer.getText().trim());
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException exp) { 
         JOptionPane.showMessageDialog
         (null,""+exp,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
      if(m!=0){
        query.setDatabaseName("GUOXUE");
        query.setSQL("SELECT * FROM panduanT where number='"+id+"'");
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
        (null,"添加试题失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
}
  