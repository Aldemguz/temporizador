
package temporizador;
import java.awt.event.ActionListener;
import javax.swing.*;
//import java.awt.event.*;
/**
 *
 * @author aldemaro
 */
public class Temporizador {

    public static void main(String[] args) {
        
        //DameLaHora oyente = new DameLaHora();
        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(5000,oyente);
        
        miTemporizador.start();//Con esto hacemos que comience.
        JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
        System.exit(0);
    }
    
}
