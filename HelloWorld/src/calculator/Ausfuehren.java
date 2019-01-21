package calculator;

public class Ausfuehren {

	public static void main(String[] args) {
		
		String[] eingabe = { 
				"addieren 5",
				"addieren xx 5",
				"subtrahieren 4 5",
				"multiplizieren 4 5",
				"dividieren 4 5"};
		
		RechenOptionHilfe helper = new RechenOptionHilfe();
		for(String statement : eingabe) {
			try{
				helper.process(statement);
				System.out.println(helper);
			} catch(InvalidStatementException e) {
				System.out.println(e.getMessage());
				if(e.getCause() != null) {
					System.out.println("Original Exception: " + e.getCause().getMessage());
				}
			}
		}
		
//		Zahlen[] zahlenAr = new Zahlen[4];
//		zahlenAr[0] = new Addieren(4, 5);
//		zahlenAr[1] = new Subtrahieren(4, 5);
//		zahlenAr[2] = new Multiplizieren(4, 5);
//		zahlenAr[3] = new Dividieren(4, 5);
//		
////		if(zahlenAr[2] instanceof Multiplizieren) {
////			Multiplizieren mul;
////			mul = (Multiplizieren) zahlenAr[2];
////			mul.berechne(5);
////		}
//
//		for(Zahlen result: zahlenAr) {
//			System.out.println("Das Ergebnis lautet: " + result.getResult());
//		}
	}
}
