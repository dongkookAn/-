import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a>=1) {
			
		if (b>=45) {
			System.out.print(a);
			System.out.print(b-45);}
			
				
			
		if (b<45) {
			System.out.print(a-1);	
			System.out.print(60-(45-b));		
		}
		
		}
		if (a<1) {
			if(b<45) {
				System.out.print(23);
				System.out.print(60-(45-b));
				
			}
		}
		}
		}
	
		
	

