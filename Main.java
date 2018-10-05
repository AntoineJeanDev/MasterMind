

public class Main {

	public static void main(String[] args) {
		
		Integer recommencer; 
		
		do {
		
		// mastermind construction
		Mastermind mastermind = new Mastermind();
		
		// generating code
		String[] code = mastermind.genCode();
		
		// some vars
		Integer compt = 1;
		Integer victoire = 0;
		Integer defaite = 0;
		String[] saisie = new String[code.length];
		String[] verif = new String[code.length];
		
		// game loop
		do {
			
			System.out.println("Code is : " + String.join("", code));
			System.out.println("Essai n° " + compt);
			
			saisie = mastermind.recup_saisie();
			
			System.out.println(String.join(" ", saisie));
			
			// compare verifString[] and codeString[]
			verif = mastermind.verif_code(code, saisie);
			
			// check if 
			if (mastermind.verifWin(verif))
				victoire = 1;	
			if (mastermind.verifLose(compt))
				defaite = 1;
			
			compt++;
			
		} while (victoire == 0 && defaite == 0);
		
		// check if win or lose
		recommencer = mastermind.showResults(victoire, defaite, compt);
		
		if (recommencer == 0)
			mastermind.sc.close();
		
		} while (recommencer == 1);
		
		System.out.println("Bye Bye");

	}

}
