import java.awt.*;
import javax.swing.*;
public class xuanzeUpdateView extends JPanel {
   JTextField inputID;
   JTable table;
   String []head ={"number","content","pic","a","b","c","d","answer"};
   String [][]a = {{" ", "  " ," " , "  "  , "  " ,"  ","  ","  "} };
   JButton buttonLook,buttonUpdate;
   xuanzeUpdateHandleData handle;
   xuanzeUpdateView() {
      setLayout(null);
      inputID = new JTextField(10);
      table = new JTable(a,head);
      table.setRowHeight(40);
      table.setFont(new Font("宋体",Font.BOLD,16));
      buttonLook = new JButton("看看这条记录");
      buttonUpdate = new JButton("更新记录");
      JLabel tishiOne=new JLabel("输入要更新的记录的ID:");
      add(tishiOne);
      add(inputID) ;
      add(buttonLook);
      JLabel tishiTwo=new JLabel("输入新的值:");
      add(tishiTwo);
      JScrollPane js=new JScrollPane(table); 
      add(js); 
      add(buttonUpdate); 
      tishiOne.setBounds(10,10,160,30);
      inputID.setBounds(172,10,100,30);
      buttonLook.setBounds(275,10,150,30);
      tishiTwo.setBounds(10,60,200,50);
      js.setBounds(10,110,800,90);
      buttonUpdate.setBounds(10,200,100,40);
      handle = new xuanzeUpdateHandleData();  //数据的处理者
      handle.setArray(a);
      handle.setJTextField(inputID);
      handle.setJButton(buttonLook,buttonUpdate);
      buttonLook.addActionListener(handle);
      buttonUpdate.addActionListener(handle);
   }
}