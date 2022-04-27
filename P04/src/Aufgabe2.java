import java.util.List;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		List<Person> list = TestPersonen.erzeuge();
		
		System.out.println("----- Alle Personen: ");
		list.stream().forEach(a -> System.out.println(a));
		
		System.out.println("----- Alle Frauen: ");
		list.stream().filter(a -> a.geschlecht == 'w').forEach(a -> System.out.println(a));
		
		System.out.println("----- Alle Männer, die nach 2300 geboren sind: ");
		list.stream().filter(a -> a.gebJahr > 2300).forEach(a -> System.out.println(a));
		
		System.out.println("----- Erste Buchstaben Vor- und Nachname gleich: ");
		list.stream().filter(a -> a.vorname.charAt(0) == a.nachname.charAt(0)).forEach(a -> System.out.println(a));
		
		System.out.println("----- Anzahl der Frauen: ");
		System.out.println(list.stream().filter(a -> a.geschlecht == 'w').count());
		
		System.out.println("----- Durchschnittsalter im Jahr 2400: ");
		System.out.println(list.stream().mapToInt(a -> 2400 - a.gebJahr).average().getAsDouble());

		System.out.println("----- Spätestes Geburtsjahr: ");
		System.out.println(list.stream().mapToInt(a -> a.gebJahr).max().getAsInt());
		
		System.out.println("----- Älteste Person: ");
		list.stream().sorted((a, b) -> {
			Integer i = a.gebJahr;
			return i.compareTo(b.gebJahr);
		}) .limit(1).forEach(a -> System.out.println(a));
		
	}

}
