package gioco;

import java.awt.Color;

/**
 *
 * @author Maurizio Speranza
 */
public abstract class Oggetto {

    /**
     *
     */
    protected ColoreOggetto coloreOggetto;

    Oggetto(ColoreOggetto coloreOggetto)
    {
        this.coloreOggetto = coloreOggetto;
    }

    /**
     *
     * @param cella Parametro di tipo Cella
     */
    protected abstract void disegnaOggetto(Cella cella);

    /**
     *
     */
    protected abstract void rimuoviOggetto();
}
