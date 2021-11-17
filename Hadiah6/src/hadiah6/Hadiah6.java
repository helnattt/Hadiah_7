package hadiah6;

import javax.swing.*;
import java.awt.event.*;

public abstract class Hadiah6 implements ActionListener {

    private static void createAndShowGUI(){

        JFrame frame = new JFrame ("Hadiah Teori 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        frame.setSize(450,200);
        frame.getContentPane().setLayout(null);
    
        JButton button1 = new JButton("Munculkan Nama ");
        frame.getContentPane().add(button1);
        button1.setBounds(30,20,200,25);
       
        JButton button2 = new JButton("Munculkan Nim ");
        frame.getContentPane().add(button2);
        button2.setBounds(30,60,200,25);
    
        JButton button3 = new JButton("Munculkan Alamat ");
        frame.getContentPane().add(button3);
        button3.setBounds(30,100,200,25);
        
       
        Hadiah6 label;
        label = new Hadiah6() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
            
        };
      
           label.label1 = new JLabel();
           label.label1.setBounds(250,13,200,40);
           frame.getContentPane().add(label.label1);
           label.label2 = new JLabel();
           label.label2.setBounds(250,53,200,40);
           frame.getContentPane().add(label.label2);
           label.label3 = new JLabel();
           label.label3.setBounds(250,93,200,40);
           frame.getContentPane().add(label.label3);           
    
        button1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                label.actionPerformed1();
            };
            
        });
        
        button2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                label.actionPerformed2();
            };
            
        });

        button3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                label.actionPerformed3();
            };
            
        });
      
        // Untuk Menampilkan JFrame Supaya Keliatan    
        frame.setVisible(true);
        
    }
    
 
    public void actionPerformed1(){ 
        label1.setText("Helennatalia");
    }      
    public void actionPerformed2(){
    
        label2.setText("51019010");
    }    
    public void actionPerformed3(){
       label3.setText("Jl.Daeng Tata Raya");
    }    
    public static void main(String[] args) {
   
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    

JLabel label1, label2, label3; 
}
