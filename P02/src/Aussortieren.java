public class Aussortieren {
	
	public static void main(String[] args) {
		
		int[] arr = new int[30];
		
//		for(int a : arr) {
//			a = (int) (Math.random() * 100);
//		}
		
		for(int i = 0; i < 30; i++) {
			arr[i] = (int) (Math.random() * 200 - 100);
		}
		
		ausgabe("alle", reduziertesArray(arr, a -> true));
		ausgabe("negative", reduziertesArray(arr, a -> a < 0));
		ausgabe("gerade", reduziertesArray(arr, a -> a%2 == 0));
		ausgabe("7-fache", reduziertesArray(arr, a -> a%7 == 0));
		ausgabe("quadratische", reduziertesArray(arr, a -> ((int) Math.sqrt(a) * (int) Math.sqrt(a)) == a));
		
	}
	
	public static int[] reduziertesArray(int[] ia, Pruefung prfg) {
		
		int n = 0;
		
		for(int a : ia) {
			if(prfg.istErfolgreichFuer(a)) {
				n++;
			}
		}
		
		int[] newarr = new int[n];
		
		int k = 0;
		for(int i = 0; i < ia.length; i++) {
			if(prfg.istErfolgreichFuer(ia[i])) {
				newarr[k] = ia[i];
				k++;
			}
		}
		
		return newarr;
		
	}
	
	public static void ausgabe(String text, int[] ia) {
		
		System.out.println(text + " :");
		
		for(int a : ia) {
			System.out.print(a + " | ");
		}
		System.out.println("\n");
		
	}
	
}
