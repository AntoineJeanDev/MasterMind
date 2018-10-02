import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		
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
			
			verif = mastermind.verif_code(code, saisie);
			
			if (String.join("", verif).equals("VVVV"))
				victoire = 1;
			if (compt == 8)
				defaite = 1;
			
			compt++;
			
		} while (victoire == 0 && defaite == 0);
		
		mastermind.sc.close();
		
		// check if win or lose
		if (victoire == 1)
			System.out.println("gagné en " + compt + " coups");
		else if (defaite == 1)
			System.out.println("perdu");

	}

}
