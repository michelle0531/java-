import java.awt.*;
import javax.swing.*;
public class WindowOne extends JFrame { 
   JTextField inputDabase,inputForm;
   JButton button;
   CommandListener listener;
   public WindowOne() {
      setTitle("查询数据库");
      setLayout(new FlowLayout()); 
      setBounds(200,200,300,300);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      init();
   }
   void init() {
      inputDabase = new JTextField(10);//输入数据库名或绝对路径
      inputForm = new JTextField(10); //输入表名 
      button = new JButton("确定");
      add(new JLabel("GUOXUE"));
      add(inputDabase);
      add(new JLabel("xuanzeT"));
      add(inputForm);
      add(button);
      listener=new CommandListener(); //监视器，负责处理数据
      button.addActionListener(listener);
      listener.setJTextField(inputDabase,inputForm);
   }
}