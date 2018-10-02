import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	
	public Scanner sc;
	private String[] verif;

	public Mastermind() {
		super();
		
		sc = new Scanner(System.in);
		this.verif = new String[4];
	}
	
	// generate a random number
	public String[] genCode() {
		
		Random rand = new Random();
		Integer nb_alea = rand.nextInt(9999);
		String str_alea = String.format("%04d", nb_alea);		
		
		return str_alea.split("");
	}
	
	// get user input
	public String[] recup_saisie() {
		
		String saisie = sc.nextLine();
		
		return saisie.split("");
	}
	
	// compare user input with secret code
	public String[] verif_code(String[] code, String[] saisie) {
		
		Integer index = 0;
		
		for (String s : saisie) {
			if (s.equals(code[index]) == true) {
				verif[index] = "V";
			} else if (Arrays.asList(code).contains(s) == true) {
				verif[index] = "P";
			} else if (Arrays.asList(code).contains(s) == false) {
				verif[index] = "X";
			}
			
			index++;
		}
		
		for (int i = 0; i < verif.length; i++) {
			System.out.print(verif[i] + " ");
		}
		
		System.out.println(" ");
		
		return verif;
	}
}
