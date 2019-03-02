package basics;

public class aTest {
	
	public static void main(String[] args) {
		
		//System.out.println("Roger\nLePage");
		
		String[] fNames = {"Roger", "Lucy"};
		String[] lNames = {"LePage", "Wei"};
		
		//System.out.println(fNames[0] + " " + lNames[0]);
		
		
		String[] addr = new String[2];
		addr[0] = "38 Kenfin Ave";
		addr[1] = "100 Echo Point";
		
		//System.out.println(addr[0]);
		
		int i = 0;
		System.out.println("People List\n-------------------------------------------\n\n");
		do {
			System.out.println(fNames[i] + " " + lNames[i]);
			System.out.println(addr[i] + "\n");
			i++;
		} while (i < 2);
		
		System.out.println("\nPeople List\n-------------------------------------------\n\n");
		for(int x = 0; x < 2; x++) {
			
			System.out.println(fNames[x] + " " + lNames[x]);
			System.out.println(addr[x] + "\n");
			
				
		}
		
		
	}

}
