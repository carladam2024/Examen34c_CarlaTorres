package examen;

import java.util.*;

/**
 * Clase que realiza un juego de piedra, papel o tijera
 * 
 * @author DAM114
 * @version 1.1
 * @since version 1.1
 */
public class RockPaperScissors {
	
	private static int keyboard = 0;
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * Lista que almacena las 3 opciones posibles: Rock, Paper y Scissors
	 */
	public static List<String> optionList = Arrays.asList("Rock", "Paper", "Scissors");

	/**
	 * Constructor por defecto de la clase RockPaperScissors
	 */
	public RockPaperScissors() {
	}

	/**
	 * @hidden
	 */
	public static void main(String[] args) {
		do {
			System.out.println("Welcome to Rock, Paper, Scissors!");
			System.out.print("Enter your choice (Rock(1), Paper(2), or Scissors(3)): ");
			keyboard = scanner.nextInt();
			scanner.nextLine();
		} while (keyboard < 1 || keyboard > 3);
		String computerChoice = optionList.get(new Random().nextInt(3));
		String userChoice = optionList.get(keyboard - 1);
		System.out.println("Your chose: " + userChoice + "\nComputer chose: " + computerChoice);
		System.out.println(RockPaperScissors.checkGame(userChoice, computerChoice));
		scanner.close();
	}

	/**
	 * Método que muestra el resultado del juego según las opciones introducidas por parámetros, mostrando quien gana o si hay empate
	 * @param userChoice Opción del usuario
	 * @param computerChoice Opción de la máquina
	 * @return Resultado del juego
	 */
	public static String checkGame(String userChoice, String computerChoice) {
		String gameResult = "";
		if (userChoice.equals(computerChoice)) {
			gameResult = "It's a tie!";
		} else if (userChoice.equals("Rock") && computerChoice.equals("Scissors")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Paper") && computerChoice.equals("Rock")) {
			gameResult = "You win this round!";
		} else if (userChoice.equals("Scissors") && computerChoice.equals("Paper")) {
			gameResult = "You win this round!";
		} else {
			gameResult = "Computer wins this round!";
		}
		return gameResult;
	}
}