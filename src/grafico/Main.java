/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<RowInfo> lRows =  new  ArrayList<RowInfo>();
        lRows.add(new RowInfo("C++", 70));
        lRows.add(new RowInfo("C#", 60));
        lRows.add(new RowInfo("Java", 90));
        
          EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                Pantalla pant = new Pantalla(lRows);
                pant.setVisible(true);
            }
        });
    }
    
}
