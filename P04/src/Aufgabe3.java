import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class Aufgabe3 {

	public static void main(String[] args) {
		
		System.out.println("Die ersten acht natuerlichen geraden Zahlen: ");
		Stream<Integer> stream1 = Stream.iterate(0, x -> x+2);
		stream1.filter(x -> x%2 == 0).limit(8).forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		
		System.out.println("Summe der ersten 20 durch 3 teilbaren ungeraden Zahlen: ");
		Stream<Integer> stream2 = Stream.iterate(1, x -> x+2);
		stream2.filter(x -> x%3 == 0).limit(20).forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		System.out.println("Zehn zufaellige Schulnoten: ");
		Stream<Integer> stream3 = Stream.generate(() -> ThreadLocalRandom.current().nextInt(6) + 1);
		stream3.limit(10).forEach(x -> System.out.print(x + ", "));
		System.out.println();
		
		System.out.println("Notendurchschnitt von 100 Noten kleiner gleich 4:");
		Stream<Integer> stream4 = Stream.generate(() -> ThreadLocalRandom.current().nextInt(6) + 1);
		System.out.println(stream4.limit(100).filter(x -> x <= 4).mapToInt(x -> x).average().getAsDouble());
		
	}

}
