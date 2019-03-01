public class Vectorrev {
	
	static int n;
	
	public static int[] createVector(int n) {
		int[] v = new int[n];
		
		for(int i = 0; i < n; i++)
			v[i] = i;
		
		return v;
	}
	
	public static void printElement(int pos, int[] v) {
		System.out.println(v[pos]);
	}
	
	public static int[] reorderVector(int pos1, int pos2, int[] v) {
		int aux;
		
		while(pos1 <= pos2) {
			aux = v[pos1];
			v[pos1] = v[pos2];
			v[pos2] = aux;
			
			pos1++;
			pos2--;
		}
				
		return v;
	}
	
	public static void printVector(int[] v, int n){
		for(int i = 0; i < n; i++)
			System.out.print(v[i]+ " ");
	}
	
}
