public class Vectorrev {
	
	private int lenght;
	private int[] v;
	
	public Vectorrev(int n) {
		lenght = n;
		v = new int[lenght];
		
		for(int i = 0; i < lenght; i++)
			v[i] = i;
	}
	
	public void printElement(int pos) {
		System.out.println(v[pos]);
	}
	
	public void reorderVector(int pos1, int pos2) {
		int aux;
		
		while(pos1 <= pos2) {
			aux = v[pos1];
			v[pos1] = v[pos2];
			v[pos2] = aux;
			
			pos1++;
			pos2--;
		}
	}
	
	public void shiftLeft(int pos1, int pos2) {
		int aux = v[pos1];
		
		for(int i = pos1 + 1; i <= pos2; i++)
			v[i-1] = v[i];
				
		v[pos2] = aux;
	}
	
	public void shiftRight(int pos1, int pos2) {
		int aux = v[pos2];
		
		for(int i = pos2 - 1; i >= pos1; i--)
			v[i+1] = v[i];
		
		v[pos1] = aux;
	}
	
	public void printVector() {
		for(int i = 0; i < lenght; i++)
			System.out.print(v[i]+ " ");
	}
	
}