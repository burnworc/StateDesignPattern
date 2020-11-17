/**
 * 
 * @author Cole Burnworth
 *
 */
import java.util.*;
public class NintendoState implements State {
	private GameConsole gameConsole;
	private ArrayList<String> games = new ArrayList<>(Arrays.asList("Zelda ", "Super Smash Bros ", "Super Mario ", "Mario Kart ", "Animal Crossing "));
	
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Displays message from pressing home button
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
		//System.out.println("You are already viewing Nintendo");
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
		System.out.println("You have the following games:");
		for (String g : games) {
			System.out.println(g);
		}
	}
}
