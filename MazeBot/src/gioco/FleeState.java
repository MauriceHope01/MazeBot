package gioco;

import java.awt.Color;
import java.util.Deque;

/**
 *
 * @author Maurizio Speranza
 */
public class FleeState implements Stato{

    /**
     * Metodo che permette al robot di camminare secondo il suo stato
     * @param robot Oggetto di tipo Robot
     */
    @Override
    public void cammina(Robot robot) {
        Deque<Integer> stack=robot.getStack();

        if(stack.size()>1)
        {
            stack.pop();
        }

            /*
            Lo stack viene svuotato due volte perchè il questo stato il robot
            cammina a due passi alla volta.
            */

        int s=stack.getFirst();
        robot.muovi(s);
        stack.pop();

    }

    /**
     * Metodo che permette al robot di cambiare dallo stato corrente ad un altro
     * @param robot Oggetto di tipo Robot
     * @param color Oggetto di tipo Colore
     */
    @Override
    public void goNext(Robot robot, Color color) {
        if(color == Color.green)
        {
            robot.setStato(new PursuitState());
        }
        else if(color == Color.cyan)
        {
            robot.setStato(new EvadeState());
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
        return "Flee";
    }

}
