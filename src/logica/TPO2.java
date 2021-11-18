package logica;


import vistas.Principal;

/**
 *
 * @author JuanPC
 */
public class TPO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Controladora ctrl = new Controladora();
        Principal princ = new Principal(ctrl);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
    
}
