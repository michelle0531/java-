import java.awt.*;
import javax.swing.*;
public class AddXuanzeShitiView extends JPanel {
   JTextField inputNumber;     //����������
   JTextArea  inputContent;    //������������
   JTextField inputPic;        //����ʾ��ͼ�����֣�������չ����
   JTextField inputA;          //����ѡ��a
   JTextField inputB;          //����ѡ��b
   JTextField inputC;          //����ѡ��c
   JTextField inputD;          //����ѡ��d
   JTextField inputAnswer;      //������ȷ��
   JButton button;              //�ύ��ť
   AddXuanzeHandleData handle; 
   AddXuanzeShitiView() {
      setLayout(null);
      button = new JButton("�������");
      inputNumber=new JTextField(10);
      inputContent = new JTextArea(8,36);
      inputPic=new JTextField(10);
      inputA=new JTextField(50);
      inputB=new JTextField(50);
      inputC=new JTextField(50);
      inputD=new JTextField(50);
      inputAnswer=new JTextField(5);
      JScrollPane js=new JScrollPane(inputContent);
      JLabel tishiBianhao =new JLabel("��ţ�");
      add(tishiBianhao); 
      add(inputNumber); 
      JLabel tishiNeirong =new JLabel("�������ݣ�");
      add(tishiNeirong); 
      add(js);
      JLabel tishiImage =new JLabel("��ʾͼ����(������չ��):");
      add(tishiImage); 
      add(inputPic);
      JLabel tishiA =new JLabel("ѡ��A");
      add(tishiA); 
      add(inputA);
      JLabel tishiB =new JLabel("ѡ��B:");
      add(tishiB); 
      add(inputB);
      JLabel tishiC =new JLabel("ѡ��c:");
      add(tishiC); 
      add(inputC);
      JLabel tishiD =new JLabel("ѡ��D:");
      add(tishiD); 
      add(inputD);
      JLabel tishiAnswer =new JLabel("��ȷ��:");
      add(tishiAnswer); 
      add(inputAnswer);
      JLabel tishiButton =new JLabel("������⣺");
      add(tishiButton);
      add(button);
      tishiBianhao.setBounds(5,5,150,35);
      inputNumber.setBounds(155,5,600,35);
      tishiNeirong.setBounds(5,45,150,35);
      js.setBounds(155,45,600,160);
      tishiImage.setBounds(5,210,150,35);
      inputPic.setBounds(155,210,600,35);
      tishiA.setBounds(5,255,150,35);
      inputA.setBounds(155,255,600,35);
      tishiB.setBounds(5,295,150,35);
      inputB.setBounds(155,295,600,35);
      tishiC.setBounds(5,335,150,35);
      inputC.setBounds(155,335,600,35);
      tishiD.setBounds(5,375,150,35);
      inputD.setBounds(155,375,600,35);
      tishiAnswer.setBounds(5,415,150,35);
      inputAnswer.setBounds(155,415,600,35);
      tishiButton.setBounds(5,455,150,35);
      button.setBounds(155,455,150,35);
     
      handle = new AddXuanzeHandleData();  //���ݵĴ�����
      handle.setAddXuanzeShitiView(this);  //
      button.addActionListener(handle);
   }
}