import java.util.Arrays;
import java.util.List;

public class EinfacheLambdaStreams {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("Alfons", "Rocko", "Willhelm", "Henrietta", "Heidrun", "Leonie");

		list.stream().filter(a -> a.startsWith("H")).sorted().forEach(a -> System.out.println(a));
		System.out.println("--------");
		list.stream().sorted((a, b) -> a.length() - b.length()).filter(a -> a.length() > 5).forEach(a -> System.out.println(a));
		System.out.println("--------");
		list.stream().map(a -> new StringBuilder(a).reverse()).limit(4).forEach(a -> System.out.println(a));
		System.out.println("--------");
		Integer sum = list.stream().map(a -> a.length()).distinct().reduce(0, (a,b) -> a + b);
		System.out.println(sum);
	}

}