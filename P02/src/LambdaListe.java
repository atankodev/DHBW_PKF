import java.util.Arrays;
import java.util.List;

public class LambdaListe {

	public static void main(String[] args) {
		
		// Erzeuge eine Liste mit Zahlen vom Typ Integer
		List<Integer> liste = Arrays.asList(11, 21, 24, 36, 41, 55, 62, 66);

		// Hier folgt Ihr eigener Code

		liste.forEach(a -> System.out.print(a + " "));
		liste.sort((a, b) -> {
			a = a % 8;
			return a.compareTo(b % 8);
		});
		System.out.println();
		liste.forEach(a -> System.out.print(a + " "));
		
	}

}