import java.util.ArrayList;
import java.util.List;

/**
 * public class HomeState declares necessary variables
 * private variables include GameConsole gameConsole, ArrayList<String> of nintendo games
 */
public class NintendoState implements State {
    private GameConsole gameConsole;
    private ArrayList<String> games = new ArrayList<>(
            List.of("Animal Crossing", "Super Smash Bros", "Super Mario", "Kirby", "Donkey Kong"));


    /**
     * public NintendoState is the constructor for class NintendoState
     * @param gameConsole
     */
    public NintendoState(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    /**
     * public void PressHomeButton displays "Display Home Screen"
     * sets state to home state
     */
    public void pressHomeButton() {
        System.out.println("\nDisplay Home Screen.");
        gameConsole.setState(gameConsole.getHomeState());
    }

    /**
     * public void PressNintendoButton displays "You are already viewing nintendo"
     * sets state to nintendo state
     */
    public void pressNintendoButton() {
        System.out.println("You are already viewing Nintendo");
        gameConsole.setState(gameConsole.getNintendoState());
    }

    /**
     * public void PressXBoxButton displays "Starting XBox..."
     * sets state to xbox state
     */
    public void pressXBoxButton() {
        System.out.println("\nStarting XBox...");
        gameConsole.setState(gameConsole.getXBoxState());
    }

    /**
     * public void PressNintendoButton displays "You have the following games" + arrayList of games
     */
    public void pressGameButton() {
        System.out.println("You have the following games: ");
        for(String game:games) {
            System.out.println(game);
        }

    }
}
