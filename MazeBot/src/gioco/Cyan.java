package gioco;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Maurizio Speranza
 */
public class Cyan implements ColoreOggetto{

    private ImageIcon icona;
    private Color colore;

    /**
     *  Costruttore Cyan
     */
    public Cyan() {
        this.colore = Color.cyan;
        Image tmp;
        this.icona = new ImageIcon("img/ogg_cyan.png");
        tmp = this.icona.getImage().getScaledInstance(45, 45,  java.awt.Image.SCALE_SMOOTH);
        this.icona = new ImageIcon(tmp);
    }

    @Override
    public Color getColore() {
        return this.colore;
    }

    @Override
    public ImageIcon getIcon() {
        return this.icona;
    }


}
