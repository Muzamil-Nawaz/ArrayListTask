package arraylisttask;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SaqibFrame {
    public JFrame mainFrame;
    public SaqibFrame(){
        mainFrame= new JFrame("Online Frame");
        mainFrame.setSize(1000,700);
        mainFrame.setLayout(null);
        
        
        firstRow();
        secondRow();
        thirdRow();
        fourthRow();
        fifthRow();
        sixthRow();
        seventhRow();
        eighthRow();
        ninthRow();
        tenthRow();
        eleventhRow();
        twelvthRow();
        
        
        JButton btmbtn = new JButton("XML");
        btmbtn.setBounds(25, 620, 170, 25);
        mainFrame.add(btmbtn);
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
    }
    public static void main(String[] args) {
        SaqibFrame sb = new SaqibFrame();
    }
    public void firstRow(){
            JButton btn1 = new JButton("Abmeldungen");
            btn1.setBounds(20,100,150,70);
            mainFrame.add(btn1);
            
            JButton btn2 = new JButton("Weid");
            btn2.setBounds(165,100,150,70);
            mainFrame.add(btn2);
            
            JButton btn3 = new JButton("Neuz");
            btn3.setBounds(310,100,150,70);
            mainFrame.add(btn3);
            
    }
    public void secondRow(){
        JLabel lbl1 =  new JLabel("FIN");
        lbl1.setBounds(25,180,110,50);
        Border  border = BorderFactory.createLineBorder(Color.black,2);
        lbl1.setBorder(border);
        mainFrame.add(lbl1);
        
        JLabel lbl2 =  new JLabel("Kenzz.");
        lbl2.setBounds(140,180,110,50);
        lbl2.setBorder(border);
        mainFrame.add(lbl2);
        
        JLabel lbl3 =  new JLabel("Scheil");
        lbl3.setBounds(255,180,150,50);
        lbl3.setBorder(border);
        mainFrame.add(lbl3);
        
        JLabel lbl4 =  new JLabel("Keinz");
        lbl4.setBounds(410,180,110,50);
        lbl4.setBorder(border);
        mainFrame.add(lbl4);
        
        JLabel lbl5 =  new JLabel("Entsorg");
        lbl5.setBounds(525,180,150,50);
        lbl5.setBorder(border);
        mainFrame.add(lbl5);
        
        JLabel lbl6 =  new JLabel("Referenz");
        lbl6.setBounds(680,180,140,50);
        lbl6.setBorder(border);
        mainFrame.add(lbl6);
    }
    
    public void thirdRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,240,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,240,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,240,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,240,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,240,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,240,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,240,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,240,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,240,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void fourthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,275,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,275,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,275,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,275,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,275,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,275,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,275,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,275,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,275,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void fifthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,310,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,310,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,310,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,310,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,310,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,310,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,310,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,310,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,310,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void sixthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,345,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,345,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,345,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,345,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,345,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,345,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,345,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,345,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,345,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void seventhRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,375,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,375,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,375,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,375,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,375,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,375,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,375,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,375,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,375,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void eighthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,410,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,410,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,410,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,410,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,410,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,410,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,410,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,410,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,410,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void ninthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,445,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,445,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,445,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,445,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,445,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,445,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,445,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,445,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,445,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void tenthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,480,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,480,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,480,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,480,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,480,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,480,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,480,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,480,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,480,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void eleventhRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,515,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,515,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,515,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,515,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,515,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,515,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,515,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,515,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,515,75,25);
        mainFrame.add(tf6);
        
        
    }
    public void twelvthRow(){
        JTextField tf1 = new JTextField();
        tf1.setBounds(25,550,110,30);
        mainFrame.add(tf1);
        
        JTextField tf2 =  new JTextField("Kenzz.");
        tf2.setBounds(140,550,110,30);
        mainFrame.add(tf2);
       
        JTextField tf3 =  new JTextField("Kenzz.");
        tf3.setBounds(255,550,70,30);
        mainFrame.add(tf3);
        
        JTextField tf4 =  new JTextField("Kenzz.");
        tf4.setBounds(330,550,35,30);
        mainFrame.add(tf4);  
    
        JTextField tf5 =  new JTextField("Kenzz.");
        tf5.setBounds(370,550,35,30);
        mainFrame.add(tf5); 
        
        JCheckBox box1 = new JCheckBox();
        box1.setBounds(440,550,40,40);
        mainFrame.add(box1);
        
        
        JComboBox combo1 = new JComboBox();
        combo1.setBounds(525,550,150,25);
        combo1.addItem("Item 1");
        mainFrame.add(combo1);
        
        JComboBox combo2 = new JComboBox();
        combo2.setBounds(680,550,60,25);
        combo2.addItem("Item 1");
        mainFrame.add(combo2);
        
        JTextField tf6 =  new JTextField("Kenzz.");
        tf6.setBounds(745,550,75,25);
        mainFrame.add(tf6);
        
        
    }
    
    
}
