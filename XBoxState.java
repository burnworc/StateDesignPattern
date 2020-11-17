/**
 * 
 * @author Cole Burnworth
 * Contains the methods for the XBox state of the GameConsole
 */
import java.util.*;
public class XBoxState implements State {
	private GameConsole gameConsole;
	private ArrayList<String> games = new ArrayList<>(Arrays.asList("Forza ", "Fortnite ", "Minecraft ", "Call of Duty ", "Halo "));
	
	/**
	 * Creates an instance of the gameConsole for the XBoxState
	 * @param gameConsole
	 */
	public XBoxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Displays message from pressing home button and sets the state accordingly
	 */
	@Override
	public void pressHomeButton() {
		System.out.println();
		System.out.println("Display Home Screen...");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * Displays message from pressing Nintendo button and sets the state accordingly
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
		System.out.println("You are already viewing XBox");
	}
	
	/**
	 * Displays message for pressing the game button
	 */
	@Override
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for (String g : games) {
			System.out.println(g);
		}
	}
}
