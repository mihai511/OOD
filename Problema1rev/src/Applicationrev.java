import java.io.File; 
import java.util.Scanner; 

public class Applicationrev {
	
	public static void main(String[] args) throws Exception { 
		File file = new File("src\\rev.in"); 
		Scanner sc = new Scanner(file);
	
		int n = sc.nextInt();
		int[] v = Vectorrev.createVector(n);
		int x;
		int y;
		
		while(sc.hasNextInt()) {
			x = sc.nextInt();
		
			if(x == 1) {
				int pos1 = sc.nextInt();
				int pos2 = sc.nextInt();
			
				Vectorrev.reorderVector(pos1, pos2, v);
				Vectorrev.printVector(v, n);
				System.out.println("\n");
			}else {
				y = sc.nextInt();
				Vectorrev.printElement(y, v);
				System.out.println("\n");
			}
		}
		
		sc.close();
	}
}