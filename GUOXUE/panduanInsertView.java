import java.awt.*;
import javax.swing.*;
public class panduanInsertView extends JPanel {
   JTable table;
   String []head ={"number","content","pic","T","F","answer"};
   String [][] a ={{" "," "," "," "," "," "}};
   JButton button;
   panduanInsertHandleData handle; 
   panduanInsertView() {
      setLayout(null);
      table = new JTable(a,head);
      table.setFont(new Font("宋体",Font.BOLD,16));
      table.setRowHeight(40);
      button = new JButton("插入记录");
      JScrollPane js=new JScrollPane(table); 
      add(js); 
      add(button);
      js.setBounds(10,10,800,80);
      button.setBounds(812,30,120,30);  
      handle = new panduanInsertHandleData();  //数据的处理者
      handle.setArray(a);
      button.addActionListener(handle);
   }
}