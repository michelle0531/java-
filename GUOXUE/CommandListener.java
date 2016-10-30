import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class CommandListener implements ActionListener {    
   JTextField inputDabase,inputForm;
   Query query;
   CommandListener() {
      query=new Query();
   }
   public void setJTextField(JTextField ... text) {
      inputDabase = text[0];
      inputForm   = text[1];
   }
   public void actionPerformed(ActionEvent e) {
      String database = inputDabase.getText(); //�õ����ݿ�
      String biao=inputForm.getText(); //�õ�����
      query.setDatabaseName(database);
      query.setSQL("SELECT * FROM "+biao);
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