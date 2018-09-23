/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Adri
 */
public class Barra  extends JPanel {
    private List<RowInfo> infoBarra;
   
    
    public Barra(List<RowInfo> info){
    this.infoBarra = info;
   
    }
      @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
        private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.drawLine(5, 200, 5, 5);
        g2d.drawLine(5, 200, 300, 200);
            for (int i = 0; i < infoBarra.size(); i++) {
                RowInfo row = infoBarra.get(i);
                 g2d.drawRect(calcPosition(i), 200-row.getValue(), 40, row.getValue());
                 g2d.drawString(row.getName(), calcPosition(i) +10, 220);
                
            }
       
        


        
        g2d.dispose();
    }
        
        private int calcPosition(int pos){
            return 10+(40*pos)+ (10*pos);
        }




}
