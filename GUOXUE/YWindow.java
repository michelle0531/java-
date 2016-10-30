import java.awt.*;
import javax.swing.*;
public class YWindow extends JFrame{
    JTabbedPane firstLayer;        //第一层窗格
    JTabbedPane secondLayerOne;   //添加到第一层中的第2层窗格
    JTabbedPane secondLayerTwo;   //添加到第一层中的第2层窗格
  
     
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


        secondLayerOne.add("添加单选试题",addXuanzeShitiView); 
        secondLayerOne.add("更新单选试题",updateXuanzeView);
        secondLayerOne.add("查询单选试题",byNumberXuanze);
        secondLayerOne.add("删除单选试题",xuanzeDView );

        secondLayerTwo.add("添加判断试题",addPanduanShitiView); 
        secondLayerTwo.add("更新判断试题",updatePanduanView);
        secondLayerTwo.add("查询判断试题",byNumberPanduan );
        secondLayerTwo.add("删除判断试题",panduanDView );
       
        firstLayer.add("选择题管理",secondLayerOne);
        firstLayer.add("判断题管理",secondLayerTwo);
        add(firstLayer,BorderLayout.CENTER); 
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}