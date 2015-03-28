package ru.vaszol.Frame.component;

/**
 * Created by vas on 28.03.15.
 */
import java.awt.Graphics;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
}