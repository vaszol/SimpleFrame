package ru.vaszol.Frame;

/**
 * Created by vas on 28.03.15.
 */
// Мы ИМПОРТИРОВАЛИ класс из пакета
import javax.swing.JFrame;

public class OvalFrame extends JFrame
{
    public OvalFrame() {
        // Создаем объект типа OvalComponent
        OvalComponent oc = new OvalComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);

        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }

}

