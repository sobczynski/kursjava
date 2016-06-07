import java.util.Scanner;

public class HelloWorld {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Podaj imiê: ");
	    String imieWczytaneOdUzytkownika = getUserInput();
		System.out.println(imieWczytaneOdUzytkownika);
//System.out.println("Hello World");
	}
	
	
	public static String getUserInput(){

		return sc.nextLine();
	}





}
