import java.awt.*;
import javax.swing.*;
public class AddPanduanShitiView extends JPanel {
   JTextField inputNumber;     //����������
   JTextArea  inputContent;    //������������
   JTextField inputPic;        //����ʾ��ͼ�����֣�������չ����
   JTextField inputRight;      //��ȷѡ��
   JTextField inputError;      //����ѡ��
   JTextField inputAnswer;      //������ȷ��
   JButton button;              //�ύ��ť
   AddPanduanHandleData handle; 
   AddPanduanShitiView() {
      setLayout(null);
      button = new JButton("�������");
      inputNumber=new JTextField(10);
      inputContent = new JTextArea(8,36);
      inputPic=new JTextField(10);
      inputRight=new JTextField(50);
      inputError=new JTextField(50);
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
      JLabel tishiRight =new JLabel("��ȷѡ�");
      add(tishiRight); 
      add(inputRight);
      JLabel tishiError =new JLabel("����ѡ�");
      add(tishiError); 
      add(inputError);
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
      tishiRight.setBounds(5,255,150,35);
      inputRight.setBounds(155,255,600,35);
      tishiError.setBounds(5,295,150,35);
      inputError.setBounds(155,295,600,35);
      tishiAnswer.setBounds(5,335,100,35);
      inputAnswer.setBounds(155,335,600,35);
      tishiButton.setBounds(5,375,150,35);
      button.setBounds(155,375,150,35);
     
      handle = new AddPanduanHandleData();  //���ݵĴ�����
      handle.setAddPanduanShitiView(this);  //��ȡ��ǰ��ͼ������
      button.addActionListener(handle);
   }
}
