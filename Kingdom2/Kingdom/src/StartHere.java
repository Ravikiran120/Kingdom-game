
public class StartHere {

	public static void main(String[] args) {
		System.out.println("\n\nKINGDOM GAME");
		
		int mat_size = 3;
		int total_length = mat_size * mat_size;
		MatrixCreator m = new MatrixCreator();
		int[][] current_mat = m.createMatrix(mat_size);

		Story s =new Story();
		s.createStory();
		
		ArrayPrinter ap = new ArrayPrinter();
		ap.displayArray(current_mat, mat_size);

		QueenRandomGenerator qrg = new QueenRandomGenerator();
		BombRandomGenerator brg = new BombRandomGenerator();

		int queenPosition = qrg.queenGen(total_length);
		int bombPosition = brg.bombGen(total_length, queenPosition);

		UserInput u = new UserInput();
		QueenGuess qg = new QueenGuess();
		BombGuess bg = new BombGuess();
		MissGuess mg = new MissGuess();

		boolean end_for_sure = false;
		
		System.out.println("Queen in "+ queenPosition );
		System.out.println("Bomb in "+ bombPosition );
		do {
			System.out.println("\nGuess the number to check");
			int guessedNum = u.getUserInput(mat_size);

			if (guessedNum == queenPosition) {
				qg.printWon();
				end_for_sure = true;
			} else if (guessedNum == bombPosition) {
				bg.printLost();
			} else {
				mg.wrongguess(guessedNum,mat_size);
			}
		} while (end_for_sure == false);
	}

}
