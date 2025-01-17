package gioco;

import java.awt.Color;
import javax.swing.JButton;

/*
La classe Elemento estende JButton ed implementa Cloneable per sfruttare il
 pattern di tipo Prototype
 */

/**
 *
 * @author Maurizio Speranza
 */

public class Elemento extends JButton implements Cloneable {

    /**
     * Numero identifica il numero di elemento
     */
    protected int numero;

    /**
     * Il costo serve per calcolarci il percorso minimo con Dijkstra
     */
    protected double costo;

    /**
     * Ogni elemento ha un determinato colore
     */
    protected Color colore;


    /**
     *
     * @return Oggetto di tipo Elemento
     */
    public Object clone()
    {
        try{
            Elemento copy = (Elemento)super.clone();
            return copy;
        }
        catch(CloneNotSupportedException e)
        {
            return null;
        }
    }

    /**
     *
     * @return Un numero intero
     */
    public int getNumero()
    {
        return this.numero;
    }

    /**
     *
     * @param numero è il parametro per settare il numero
     */
    public void setNumero(int numero)
    {
        this.numero=numero;
    }

    /**
     *
     * @param colore Setta l'attributo colore
     */
    public void setColore(Color colore) {
        this.colore = colore;
    }

    /**
     *
     * @return Oggetto di tipo Color
     */
    public Color getColore() {
        return colore;
    }



}
