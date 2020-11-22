/**
 * public class GameConsole declares necessary variables
 * private variables include: State HomeState, State NintendoState, State XBoxState, State state
 */
public class GameConsole {
    private State HomeState;
    private State NintendoState;
    private State XBoxState;
    private State state;

    /**
     * public GameConsole() is the constructor for the GameConsole class
     */
    public GameConsole() {
        HomeState = new HomeState(this);
        NintendoState = new NintendoState(this);
        XBoxState = new XBoxState(this);
        System.out.println("Starting up the game console");
        state = HomeState;
    }

    /**
     * public void pressHomeButton sets calls press home button on the state variable
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * public void pressNintendoButton calls press nintendo button on the state variable
     */
    public void pressNintendoButton() {
        state.pressNintendoButton();
    }

    /**
     * public void pressXBoxButton calls press Xbox button on the state variable
     */
    public void pressXBoxButton() {
        state.pressXBoxButton();
    }

    /**
     * public void pressGameButton sets calls press game button on the state variable
     */
    public void pressGameButton() {
        state.pressGameButton();
    }

    /**
     * public void setState changes the state accordingly
     * @param state
     */
    public void setState(State state) {
       this.state = state;
    }

    /**
     * public State getHomeState returns the home state
     * @return
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * public State getNintendoState returns the nintendo state
     * @return
     */
    public State getNintendoState() {
        return NintendoState;
    }

    /**
     * public State getXBoxState returns the xbox state
     * @return
     */
    public State getXBoxState() {
        return XBoxState;
    }

}
