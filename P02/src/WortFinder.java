
public class WortFinder {

	public static void main(String[] args) {
		
		String[] testArray = TestDaten.erzeuge();
		System.out.println("1. Wort mit Anfangsbuchstabe A: " + erstesWort(testArray, s -> s.startsWith("A")));
		System.out.println("1. Wort, das 'au' enthält: " + erstesWort(testArray, s -> s.contains("au")));
		System.out.println("1. Wort, das auf 'suppe' endet: " + erstesWort(testArray, s -> s.endsWith("suppe")));
		System.out.println("1. Wort, das aus 8 Zeichen besteht: " + erstesWort(testArray, s -> s.length() == 8));

	}
	
	public static String erstesWort(String[] str, Bedingung bedingung) {
		
		for(String s : str) {
			if(bedingung.trifftZuAuf(s)) {
				return s;
			}
		}
		return "";
		
	}

}
