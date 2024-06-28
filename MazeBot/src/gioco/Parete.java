package gioco;

import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*
    La classe Parete estende la classe Elemento . Le pareti sono la zona del
    labirinto dove il robot non può muoversi.
 */

/**
 *
 * @author Maurizio Speranza
 */

public class Parete extends Elemento{

    /**
     * Costruttore della classe Parete. Setta il colore e il bordo.
     */
    Parete()
    {
        Border border = new LineBorder(Color.decode("#404040"), 1);
        this.setOpaque(true);
        this.setBackground(Color.decode("#606060"));
        this.setBorder(border);
    }

    /**
     *
     * @return Oggetto di tipo Parete
     */
    public Object clone()
    {
        return super.clone();
    }
}
