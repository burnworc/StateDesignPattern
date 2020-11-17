/**
 * 
 * @author Cole Burnworth
 * Contains methods for the NintendoState of the GameConsole
 */
import java.util.*;
public class NintendoState implements State {
	private GameConsole gameConsole;
	private ArrayList<String> games = new ArrayList<>(Arrays.asList("Zelda ", "Super Smash Bros ", "Super Mario ", "Mario Kart ", "Animal Crossing "));
	
	/**
	 * Creates an instance of the gameConsole for the NintendoState
	 * @param gameConsole
	 */
	public NintendoState(GameConsole gameConsole) {
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
	 * Displays message from pressing Nintendo button
	 */
	@Override
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo");
	}
	
	/**
	 * Displays message from pressing the XBox button and sets the state accordingly
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
		System.out.println("You have the following games:");
		for (String g : games) {
			System.out.println(g);
		}
	}
}
