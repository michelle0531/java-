import java.awt.*;
import javax.swing.*;
public class panduanDelete extends JPanel {
   JTextField inputNumber;
   JButton button1;
   JButton button2;
   panduanByNumberHandleData handle; 
   panduanDelete() {
      inputNumber = new JTextField(12);
      button1 = new JButton("ȷ��");
      button2 =new JButton("ɾ��");
      add(new JLabel("Number:"));
      add(inputNumber);
      add(button1);
      add(button2); 
      handle = new panduanByNumberHandleData();  //����Numberȥ�������ݵĴ�����
     
      handle.setJTextField(inputNumber);
      button1.addActionListener(handle);
      button2.addActionListener(handle);
   }
}