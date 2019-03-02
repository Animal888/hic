package basics;

public class sTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ts = "Now iis the time for all good men ";
		String tss = "1234567890";
		
		String fName;
		String lName;
		if(tss.equalsIgnoreCase(" 123567890")) {
			System.out.println("Found");
		}
		System.out.println(ts.codePointAt(1));
		System.out.println(ts.codePointAt(ts.length()-7));
		System.out.println(ts.concat(tss));
		String tLine[];
		tLine = ts.split("i");
		System.out.println(tLine[0] + tLine[1] +tLine[2]);
	}

}
