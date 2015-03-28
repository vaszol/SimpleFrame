package ru.vaszol.Frame.component;

import java.awt.Graphics;
import javax.swing.JComponent;


/**
 * Created by vas on 28.03.15.
 */
public class OvalComponent extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
