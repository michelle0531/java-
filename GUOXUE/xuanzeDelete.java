import java.awt.*;
import javax.swing.*;
public class xuanzeDelete extends JPanel {
   JTextField inputNumber;
   JButton button1;
   JButton button2;
   xuanzeDeleteHandleData handle; 
   xuanzeDelete() {
      inputNumber = new JTextField(12);
      button1 = new JButton("确定");
      button2 =new JButton("删除");
      add(new JLabel("Number:"));
      add(inputNumber);
      add(button1);
      add(button2); 
      handle = new xuanzeDeleteHandleData();  //负责按Number去处理数据的处理者
     
      handle.setJTextField(inputNumber);
      button1.addActionListener(handle);
      button2.addActionListener(handle);
   }
}