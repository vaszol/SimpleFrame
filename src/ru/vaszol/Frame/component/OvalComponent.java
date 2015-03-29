package ru.vaszol.Frame.component;

import java.awt.Graphics;


/**
 * Created by vas on 28.03.15.
 */
public class OvalComponent extends AbstractShape{

    @Override
    protected void paintShape(Graphics g) {
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
