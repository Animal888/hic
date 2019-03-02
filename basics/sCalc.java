package basics;

public class sCalc {
	
	public static void main(String[] args) {
		
		String fPart;
		String sPart;
		String tPart;
		
		double pRate = 18.9;
		double hRate = 1;
		double oRate = 1.5;
		double oHours = 0;
		double wHours;
				
		double py;
		
		fPart = "This is hour much we make before taxes "; 
		sPart =	" if we work ";
		tPart = " hours per week;";
				
		wHours = 42.5 + 10.5;
		
		if(wHours > 40) {
			oHours = wHours - 40;
			py = (oHours * oRate * pRate) + (40 * pRate);
		} else {
			py = pRate * wHours;
		}
		
		System.out.println(fPart + py + sPart + wHours + tPart);
		
		
	}

}
