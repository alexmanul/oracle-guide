package lv.java.oracleguide.chapter16.frame;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Frame extends JFrame implements ActionListener {

    private JButton jButton;

    Frame() {
        setTitle("JFrame.DO_NOTHING_ON_CLOSE");
        setLayout(new FlowLayout());
        setButton();
        setAction();
        setSize(700, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private void setButton() {
        jButton = new JButton("Close Frame");
        add(jButton);
    }

    private void setAction() {
        jButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent eve) {
        dispose();
    }
}