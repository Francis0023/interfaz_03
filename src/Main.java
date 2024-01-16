import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame aplicacion=new JFrame(" Prototipo");
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(600,580);
        aplicacion.setVisible(true);
    }
}