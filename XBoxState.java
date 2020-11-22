import java.util.ArrayList;
import java.util.List;

/**
 * public class HomeState declares necessary variables
 * private variables include GameConsole gameConsole, ArrayList<String> of xbox games
 */
public class XBoxState implements State{
    private GameConsole gameConsole;
    private ArrayList<String> games = new ArrayList<>(
            List.of("Grand Theft Auto", "Minecraft", "Call of Duty", "Fortnite", "Assassin's Creed"));


    /**
     * public XBoxState is the constructor for class XBoxState
     * @param gameConsole
     */
    public XBoxState(GameConsole gameConsole) {
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
     * public void PressNintendoButton displays "Starting Nintendo..."
     * sets state to nintendo state
     */
    public void pressNintendoButton() {
        System.out.println("\nStarting Nintendo...");
        gameConsole.setState(gameConsole.getNintendoState());
    }

    /**
     * public void PressXBoxButton displays "You are already viewing XBox"
     * sets state to xbox state
     */
    public void pressXBoxButton() {
        System.out.println("You are already viewing XBox");
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
