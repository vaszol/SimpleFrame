package ru.vaszol.Frame.component;

/**
 * Created by vas on 29.03.15.
 */
import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class AbstractShape extends JComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        paintShape(g);
    }

    abstract protected void paintShape(Graphics g);
}