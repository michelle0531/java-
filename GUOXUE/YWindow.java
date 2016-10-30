import java.awt.*;
import javax.swing.*;
public class YWindow extends JFrame{
    JTabbedPane firstLayer;        //��һ�㴰��
    JTabbedPane secondLayerOne;   //��ӵ���һ���еĵ�2�㴰��
    JTabbedPane secondLayerTwo;   //��ӵ���һ���еĵ�2�㴰��
  
     
    AddXuanzeShitiView    addXuanzeShitiView;
    xuanzeInsertView     insertXuanzeView;
    xuanzeUpdateView     updateXuanzeView;
    xuanzeByNumber       byNumberXuanze;
    xuanzeDelete         xuanzeDView;

    AddPanduanShitiView   addPanduanShitiView;
    panduanInsertView    insertPanduanView;
    panduanUpdateView    updatePanduanView;
    panduanByNumber     byNumberPanduan;
    panduanDelete       panduanDView;





    public YWindow(){
        setBounds(100,20,900,560);
        setVisible(true);
        firstLayer=new JTabbedPane();
        secondLayerOne = new JTabbedPane(JTabbedPane.LEFT);
        secondLayerTwo = new JTabbedPane(JTabbedPane.LEFT);
        
       
        addXuanzeShitiView  =new AddXuanzeShitiView();
        insertXuanzeView =new xuanzeInsertView();
        updateXuanzeView =new xuanzeUpdateView();
        byNumberXuanze =new xuanzeByNumber();
        xuanzeDView =new  xuanzeDelete();

        addPanduanShitiView  =new AddPanduanShitiView();
        insertPanduanView =new panduanInsertView();
        updatePanduanView =new panduanUpdateView();
        byNumberPanduan  = new panduanByNumber();
        panduanDView=new panduanDelete();


        secondLayerOne.add("��ӵ�ѡ����",addXuanzeShitiView); 
        secondLayerOne.add("���µ�ѡ����",updateXuanzeView);
        secondLayerOne.add("��ѯ��ѡ����",byNumberXuanze);
        secondLayerOne.add("ɾ����ѡ����",xuanzeDView );

        secondLayerTwo.add("����ж�����",addPanduanShitiView); 
        secondLayerTwo.add("�����ж�����",updatePanduanView);
        secondLayerTwo.add("��ѯ�ж�����",byNumberPanduan );
        secondLayerTwo.add("ɾ���ж�����",panduanDView );
       
        firstLayer.add("ѡ�������",secondLayerOne);
        firstLayer.add("�ж������",secondLayerTwo);
        add(firstLayer,BorderLayout.CENTER); 
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}