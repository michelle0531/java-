import java.awt.*;
import javax.swing.*;
public class xuanzeByNumber extends JPanel {
   JTextField inputNumber;
   JButton button;
   xuanzeByNumberHandleData handle; 
   xuanzeByNumber() {
      inputNumber = new JTextField(12);
      button = new JButton("ȷ��");
      add(new JLabel("Number:"));
      add(inputNumber);
      add(button); 
      handle = new xuanzeByNumberHandleData();  //����Numberȥ�������ݵĴ�����
      handle.setJTextField(inputNumber);
      button.addActionListener(handle);
   }
}