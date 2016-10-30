import java.awt.*;
import javax.swing.*;
public class xuanzeByNumber extends JPanel {
   JTextField inputNumber;
   JButton button;
   xuanzeByNumberHandleData handle; 
   xuanzeByNumber() {
      inputNumber = new JTextField(12);
      button = new JButton("确定");
      add(new JLabel("Number:"));
      add(inputNumber);
      add(button); 
      handle = new xuanzeByNumberHandleData();  //负责按Number去处理数据的处理者
      handle.setJTextField(inputNumber);
      button.addActionListener(handle);
   }
}