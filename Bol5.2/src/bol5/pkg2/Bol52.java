package bol5.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author ggarciaalvarez
 */
public class Bol52 {

    public static void main(String[] args) {
       Satelite obx = new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Introduce meridiano:")), Double.parseDouble(JOptionPane.showInputDialog("Introduce paralelo:")), Double.parseDouble(JOptionPane.showInputDialog("Introduce distancia tierra:")));
       obx.verPosicion();  
    }
    
}
