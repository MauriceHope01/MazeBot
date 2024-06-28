package gioco;

import java.awt.Color;

/**
 *
 * @author Maurizio Speranza
 */
public class EvadeState implements Stato{

    /**
     * Metodo che permette al robot di camminare secondo il suo stato
     * @param robot Parametro di tipo Robot
     */
    @Override
    public void cammina(Robot robot) {
        int s=robot.getSuccRand();
        robot.muovi(s);
    }

    /**
     * Metodo che permette al robot di cambiare dallo stato corrente ad un altro
     * @param robot Oggetto di tipo Robot
     * @param color Oggetto di tipo Colore
     */
    @Override
    public void goNext(Robot robot, Color color) {

        robot.setStack(Dijkstra.findMin(robot.getElementi(),robot.getPosCorrente(),191));

        if(color==Color.green)
        {
            robot.setStato(new PursuitState());
        }
        else if(color==Color.yellow)
        {
            robot.setStato(new FleeState());
        }

        else if(color==Color.red)
        {
            robot.setStato(new SeekState());
        }
    }

    /**
     *
     * @return Il nome dello stato corrente come stringa
     */
    @Override
    public String toString() {
        return "Evade";
    }






}
