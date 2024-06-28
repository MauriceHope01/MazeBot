package gioco;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Maurizio Speranza
 */
public class Green implements ColoreOggetto{


    private ImageIcon icona;
    private Color colore;

    Green()
    {
        this.colore = Color.green;

        Image tmp;
        this.icona = new ImageIcon("img/ogg_green.png");
        tmp = this.icona.getImage().getScaledInstance(45, 45,  java.awt.Image.SCALE_SMOOTH);
        this.icona = new ImageIcon(tmp);
    }

    /**
     *
     * @return Oggetto di tipo Color
     */
    @Override
    public Color getColore() {
        return this.colore;
    }

    /**
     *
     * @return Oggetto di tipo ImaIcon
     */
    @Override
    public ImageIcon getIcon() {
        return this.icona;
    }

}
