package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestView extends JFrame{

    JLabel judul;
    public TestView(String s){
        setTitle("Testing");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(552, 540);

        if(s.equals("Lingkaran")){
            judul = new JLabel("Lingkaran");
        }else if(s.equals("Persegi")){
            judul = new JLabel("Persegi");
        }else{
            judul = new JLabel("Ngga jelas");
        }
        add(judul);

        judul.setBounds(185,30,200,20);
    }
}
