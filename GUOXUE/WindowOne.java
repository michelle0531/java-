import java.awt.*;
import javax.swing.*;
public class WindowOne extends JFrame { 
   JTextField inputDabase,inputForm;
   JButton button;
   CommandListener listener;
   public WindowOne() {
      setTitle("��ѯ���ݿ�");
      setLayout(new FlowLayout()); 
      setBounds(200,200,300,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      init();
   }
   void init() {
      inputDabase = new JTextField(10);//�������ݿ��������·��
      inputForm = new JTextField(10); //������� 
      button = new JButton("ȷ��");
      add(new JLabel("GUOXUE"));
      add(inputDabase);
      add(new JLabel("xuanzeT"));
      add(inputForm);
      add(button);
      listener=new CommandListener(); //������������������
      button.addActionListener(listener);
      listener.setJTextField(inputDabase,inputForm);
   }
}