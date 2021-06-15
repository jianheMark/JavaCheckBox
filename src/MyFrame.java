import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button = new JButton();
    JCheckBox checkBox = new JCheckBox();
    ImageIcon imageIcon;
    ImageIcon imageIcon2;
    //= new ImageIcon("check.png");

    MyFrame() {
        this.setSize(750,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        imageIcon = new ImageIcon("x.png");
        imageIcon2 = new ImageIcon("check.png");

        checkBox.setText("Do you really restart you PC.");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Helvetica ",Font.PLAIN,25));
        //checkBox.setIcon(imageIcon);
        //checkBox.setSelectedIcon(imageIcon2);

        button.setText("Summit");
        button.addActionListener(this);

        this.add(button);
        this.add(checkBox);
        //this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }

    }
}
