import java.awt.*;
import javax.swing.*;
public class panduanByNumber extends JPanel {
   JTextField inputNumber;
   JButton button;
   panduanByNumberHandleData handle; 
   panduanByNumber() {
      inputNumber = new JTextField(12);
      button = new JButton("ȷ��");
      add(new JLabel("Number:"));
      add(inputNumber);
      add(button); 
      handle = new panduanByNumberHandleData();  //����Numberȥ�������ݵĴ�����
      handle.setJTextField(inputNumber);
      button.addActionListener(handle);
   }
}