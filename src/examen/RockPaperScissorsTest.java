package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

	@Test
	void cp1() {
		assertEquals(RockPaperScissors.checkGame("Paper", "Paper"), "It's a tie!");
	}
	
	@Test
	void cp2() {
		assertEquals(RockPaperScissors.checkGame("Rock", "Scissors"), "You win this round!");
	}	
	
	@Test
	void cp3() {
		assertEquals(RockPaperScissors.checkGame("Paper", "Rock"), "You win this round!");
	}

	@Test
	void cp4() {
		assertEquals(RockPaperScissors.checkGame("Scissors", "Paper"), "You win this round!");
	}
}
