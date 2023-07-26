/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Lenovo
 */
public class GreetingGUI extends JFrame{

    //private JFrame uiFrame;
    private JPanel mainPnl;
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsPnl;
    private JPanel btnPnl;
    
    
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfield
    private JTextField nameTxtField;
    private JTextField surnameTxtField;
    
    //textarea 
    private JTextArea greetingsTxtArea;
    
    //buttons
    
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
    public GreetingGUI() {
        
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700,750);
        setBackground(Color.YELLOW);
        
                
        
        //create the panels
        
        namePnl = new JPanel(new FlowLayout());
        surnamePnl =new JPanel(new FlowLayout());
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        
        greetingsPnl= new JPanel(new FlowLayout());
        greetingsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel (new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder( new BevelBorder(BevelBorder.RAISED));
        
        
        //create labels
        headingLbl = new JLabel(" Greeting App");
     nameLbl = new JLabel("Name :");
    surnameLbl = new JLabel("Surname :");
    
    //create text field
    nameTxtField = new JTextField(20);
    surnameTxtField = new JTextField(20);
    
    //create Text area
    
    greetingsTxtArea = new JTextArea(20,40);
    greetingsTxtArea.setEditable(false);
    greetingsTxtArea.setText("Hello[name] [surname]");
        
        //create buttons 
        
        
        greetBtn = new JButton("Greet");
clearBtn= new JButton("clear");
 exitBtn = new JButton("Exit");
 
 //add labels and textfield to panel
 
 namePnl.add(nameLbl);
 namePnl.add(nameTxtField);
 
 surnamePnl.add(surnameLbl);
 surnamePnl.add(surnameTxtField);
 
 nameAndSurnamePnl.add(namePnl);
 nameAndSurnamePnl.add(surnamePnl);
 
 greetingsPnl.add(greetingsTxtArea);
 
 btnPnl.add(clearBtn);
         btnPnl.add(greetBtn);
         btnPnl.add(exitBtn);
         
         mainPnl.add(nameAndSurnamePnl,BorderLayout.NORTH);
         mainPnl.add(greetingsPnl,BorderLayout.CENTER);
         mainPnl.add(btnPnl,BorderLayout.SOUTH);
         
         add(headingPnl,BorderLayout.NORTH);
         add(mainPnl,BorderLayout.CENTER);
         setVisible(true);
    }
    
    
}
