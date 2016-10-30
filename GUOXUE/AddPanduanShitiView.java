import java.awt.*;
import javax.swing.*;
public class AddPanduanShitiView extends JPanel {
   JTextField inputNumber;     //输入试题编号
   JTextArea  inputContent;    //输入试题内容
   JTextField inputPic;        //输入示意图的名字（包括扩展名）
   JTextField inputRight;      //正确选择
   JTextField inputError;      //错误选择
   JTextField inputAnswer;      //输入正确答案
   JButton button;              //提交按钮
   AddPanduanHandleData handle; 
   AddPanduanShitiView() {
      setLayout(null);
      button = new JButton("添加试题");
      inputNumber=new JTextField(10);
      inputContent = new JTextArea(8,36);
      inputPic=new JTextField(10);
      inputRight=new JTextField(50);
      inputError=new JTextField(50);
      inputAnswer=new JTextField(5);
      JScrollPane js=new JScrollPane(inputContent);
      JLabel tishiBianhao =new JLabel("编号：");
      add(tishiBianhao); 
      add(inputNumber); 
      JLabel tishiNeirong =new JLabel("试题内容：");
      add(tishiNeirong); 
      add(js);
      JLabel tishiImage =new JLabel("提示图名字(包括扩展名):");
      add(tishiImage); 
      add(inputPic);
      JLabel tishiRight =new JLabel("正确选项：");
      add(tishiRight); 
      add(inputRight);
      JLabel tishiError =new JLabel("错误选项：");
      add(tishiError); 
      add(inputError);
     JLabel tishiAnswer =new JLabel("正确答案:");
      add(tishiAnswer); 
      add(inputAnswer);
      JLabel tishiButton =new JLabel("添加试题：");
      add(tishiButton);
      add(button);
      tishiBianhao.setBounds(5,5,150,35);
      inputNumber.setBounds(155,5,600,35);
      tishiNeirong.setBounds(5,45,150,35);
      js.setBounds(155,45,600,160);
      tishiImage.setBounds(5,210,150,35);
      inputPic.setBounds(155,210,600,35);
      tishiRight.setBounds(5,255,150,35);
      inputRight.setBounds(155,255,600,35);
      tishiError.setBounds(5,295,150,35);
      inputError.setBounds(155,295,600,35);
      tishiAnswer.setBounds(5,335,100,35);
      inputAnswer.setBounds(155,335,600,35);
      tishiButton.setBounds(5,375,150,35);
      button.setBounds(155,375,150,35);
     
      handle = new AddPanduanHandleData();  //数据的处理者
      handle.setAddPanduanShitiView(this);  //获取当前视图的引用
      button.addActionListener(handle);
   }
}
