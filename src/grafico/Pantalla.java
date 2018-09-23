/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.Graphics2D;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Adri
 */
public class Pantalla extends JFrame {

    public Pantalla(List<RowInfo> info) {

        initUI(info);
    }
    
    private void initUI(List<RowInfo> info) {

        add(new  Barra(info));
         
        setTitle("Mejores lengujaes");
        setSize(340, 300);
        setLocationRelativeTo(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
