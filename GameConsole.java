/**
 * 
 * @author Cole Burnworth
 *
 */
public class GameConsole {
	private State homeState;
	private State nintendoState;
	private State xBoxState;
	
	private State state;
	
	public GameConsole() {
		homeState = new HomeState(this);
		nintendoState = new NintendoState(this);
		xBoxState = new XBoxState(this);
		state = homeState;
		System.out.println("Starting up the game console");
		System.out.println();
	}
	
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getHomeState() {
		return homeState;
	}
	
	public State getNintendoState() {
		return nintendoState;
	}
	
	public State getXBoxState() {
		return xBoxState;
	}
}
