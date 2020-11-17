/**
 * 
 * @author Cole Burnworth
 * Contains the methods for the GameConsole 
 */
public class GameConsole {
	private State homeState;
	private State nintendoState;
	private State xBoxState;
	
	private State state;
	
	/**
	 * Constructor that sets the variables of state and displays the welcome line
	 */
	public GameConsole() {
		homeState = new HomeState(this);
		nintendoState = new NintendoState(this);
		xBoxState = new XBoxState(this);
		state = homeState;
		System.out.println("Starting up the game console");
		System.out.println();
	}
	
	/**
	 * Calls press home button on the state variable
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	/**
	 * Calls press Nintendo button on state variable
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	
	/**
	 * Calls press XBox button on state variable
	 */
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	
	/**
	 * Calls press Game button on state variable
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	/**
	 * Changes the state accordingly
	 * @param state
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Returns the home state
	 * @return
	 */
	public State getHomeState() {
		return homeState;
	}
	
	/**
	 * Returns the Nintendo state
	 * @return
	 */
	public State getNintendoState() {
		return nintendoState;
	}
	
	/**
	 * Returns the XBox state
	 * @return
	 */
	public State getXBoxState() {
		return xBoxState;
	}
}
