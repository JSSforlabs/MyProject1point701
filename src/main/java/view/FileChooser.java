package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Стас on 18.09.2016.
 */
public class FileChooser extends JPanel  implements ActionListener {
    JFileChooser fc;

    public FileChooser() {
        super(new BorderLayout());

        //Create a file chooser
        fc = new JFileChooser();
        //fc.showOpenDialog(FileChooser.this);
        setVisible(true);


    }


    public void actionPerformed(ActionEvent e) {

    }
}