package gioco;


import java.awt.Color;
import java.util.Deque;

/**
 *
 * @author Maurizio Speranza
 */
public class SeekState implements Stato{

    /**
     * Metodo che permette al robot di camminare secondo il suo stato
     * @param robot Parametro di tipo Robot
     */
    @Override
    public void cammina(Robot robot) {
        Deque<Integer> stack=robot.getStack();
        robot.muovi(stack.getFirst());
        stack.pop();
    }

    /**
     * Metodo che permette al robot di cambiare dallo stato corrente ad un altro
     * @param robot Oggetto di tipo Robot
     * @param color Oggetto di tipo Colore
     */
    @Override
    public void goNext(Robot robot,Color color) {
        if(color == Color.green)
        {
            robot.setStato(new PursuitState());
        }
        else if(color == Color.yellow)
        {
            robot.setStato(new FleeState());
        }
        else if(color==Color.cyan)
        {
            robot.setStato(new EvadeState());
        }

    }

    /**
     *
     * @return Il nome dello stato corrente come stringa
     */
    @Override
    public String toString() {
        return "Seek";
    }








}
