import java.io.File; 
import java.util.Scanner; 

public class Applicationrev {
	
	public static void main(String[] args) throws Exception { 
		File file = new File("src\\rev.in"); 
		Scanner sc = new Scanner(file);
	
		int n = sc.nextInt();
		Vectorrev v = new Vectorrev(n);
		int x;
		int y;
		int pos1;
		int pos2;
		
		while(sc.hasNextInt()) {
			x = sc.nextInt();
		
			if(x == 1) {
				pos1 = sc.nextInt();
				pos2 = sc.nextInt();
			
				v.reorderVector(pos1, pos2);
				v.printVector();
				System.out.println("\n");
			}
			
			if(x == 2) {
				y = sc.nextInt();
				v.printElement(y);
				System.out.println("\n");
			}
			
			if(x == 3) {
				pos1 = sc.nextInt();
				pos2 = sc.nextInt();
			
				v.shiftLeft(pos1, pos2);
				v.printVector();
				System.out.println("\n");
			}
			
			if(x == 4) {
				pos1 = sc.nextInt();
				pos2 = sc.nextInt();
			
				v.shiftRight(pos1, pos2);
				v.printVector();
				System.out.println("\n");
			}
			
			if(x == 5) {
				pos1 = sc.nextInt();
				pos2 = sc.nextInt();
			
				v.interchangeEvenOdd(pos1, pos2);
				v.printVector();
				System.out.println("\n");
			}
		}
		
		sc.close();
	}
}
