/**
 * public class HomeState declares private GameConsole gameConsole
 */
public class HomeState implements State {
    private GameConsole gameConsole;

    /**
     * public HomeState is the constructor for class HomeState
     * @param gameConsole
     */
    public HomeState(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    /**
     * public void PressHomeButton displays "you are already on the home screen"
     * sets state to home state
     */
    public void pressHomeButton() {
        System.out.println("You are already on the home screen.");
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
     * public void PressXBoxButton displays "Starting XBox..."
     * sets state to xbox state
     */
    public void pressXBoxButton() {
        System.out.println("\nStarting XBox...");
        gameConsole.setState(gameConsole.getXBoxState());
    }

    /**
     * public void PressNintendoButton displays "You have to pick a gaming system to play"
     */
    public void pressGameButton() {
        System.out.println("You have to pick a gaming system to play.");
    }
}
