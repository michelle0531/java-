import java.awt.*;
import javax.swing.*;
public class xuanzeInsertView extends JPanel {
   JTable table;
   String []head ={"number","content","pic","a","b","c","d","answer"};
   String [][] a ={{" "," "," "," "," "," "," "," "}};
   JButton button;
   xuanzeInsertHandleData handle; 
   xuanzeInsertView() {
      setLayout(null);
      table = new JTable(a,head);
      table.setFont(new Font("����",Font.BOLD,16));
      table.setRowHeight(40);
      button = new JButton("�����¼");
      JScrollPane js=new JScrollPane(table); 
      add(js); 
      add(button);
      js.setBounds(10,10,800,80);
      button.setBounds(812,30,120,30);  
      handle = new xuanzeInsertHandleData();  //���ݵĴ�����
      handle.setArray(a);
      button.addActionListener(handle);
   }
}