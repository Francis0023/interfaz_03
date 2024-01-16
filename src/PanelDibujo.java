import javax.swing.*;
import java.awt.Graphics;
public class PanelDibujo extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int ancho=getWidth();
        int altura=getHeight();
        // uso para dibujar en el frame creado
        g.drawLine(50,50,ancho-50,altura-50);
        g.drawLine(50,altura,ancho,50);
        //patrones
        for(int i = 0;i <5; i++){
            g.drawString("Francis",20,i+10);
        }


        g.fillOval(180,80,150,200);
        g.fillArc(100,290,150,200,20,40);
    }

}
