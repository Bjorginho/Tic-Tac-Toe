package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FooterGUI extends JPanel implements ActionListener {

    public JButton restartButton;
    public JButton menuButton;

    public FooterGUI(Dimension dim){
        this.setPreferredSize(dim);
        restartButton = new JButton("Restart");
        restartButton.addActionListener(this);
        menuButton = new JButton("Menu");
        menuButton.addActionListener(this);
        this.add(restartButton);
        this.add(menuButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==restartButton){
            System.out.println("Restart!");
        }
        else if(e.getSource()==menuButton){
            System.out.println("Menu!");
        }
    }
}
