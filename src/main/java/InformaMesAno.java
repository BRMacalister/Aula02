import java.util.Scanner;


public class InformaMesAno {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o valor númerico de um mês do ano:");
		
		int mesAno = scanner.nextInt();
		
		switch (mesAno){
		case 1: 
			System.out.println("January");
		case 2: 
			System.out.println("February");
		case 3: 
			System.out.println("March");
		case 4: 
			System.out.println("April");
		case 5: 
			System.out.println("May");
		case 6: 
			System.out.println("June");
		case 7: 
			System.out.println("July");
		case 8: 
			System.out.println("Agust");
		case 9: 
			System.out.println("Septembre");
		case 10: 
			System.out.println("October");
		case 11: 
			System.out.println("November");
		case 12: 
			System.out.println("December");
		break;
		
		default: System.out.println("Escolher um númeró entre 1 e 12.");
		
		}
		
		
	}

}
