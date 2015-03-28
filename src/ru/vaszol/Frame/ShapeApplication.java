package ru.vaszol.Frame;

/**
 * Created by vas on 28.03.15.
 */
import javax.swing.JFrame;

public class ShapeApplication
{
    public static void main(String[] args) {
        // Создаем графическое окно
        ShapeFrame of = new ShapeFrame();
        // Задаем правидо, по которому приложение завершиться при
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}
