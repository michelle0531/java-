import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class xuanzeByNumberHandleData implements ActionListener {    
   JTextField inputNumber;
   PreQuery query;         //第2天任务2  Query
   xuanzeByNumberHandleData() {
      query=new PreQuery();
   }
   public void setJTextField(JTextField ... text) {
      inputNumber = text[0];
   }
   public void actionPerformed(ActionEvent e) {
      String na = inputNumber.getText(); 
      query.setDatabaseName("GUOXUE");
      query.setSQL("SELECT * FROM xuanzeT where number='"+na+"'");
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
