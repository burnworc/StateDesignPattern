/**
 * 
 * @author Cole Burnworth
 * Contains methods for the HomeState of the GameConsole
 */
public class HomeState implements State {
	private GameConsole gameConsole;
	
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Displays message from pressing home button
	 */
	@Override
	public void pressHomeButton() {
		System.out.println("You are already on the home screen.");
	}
	
	/**
	 * Displays message from pressing Nintendo button
	 */
	@Override
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * Displays message from pressing the XBox button
	 */
	@Override
	public void pressXBoxButton() {
		System.out.println();
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Displays message for pressing the game button
	 */
	@Override
	public void pressGameButton() {
		System.out.println("You have to pick a gaming system to play.");
	}
}
