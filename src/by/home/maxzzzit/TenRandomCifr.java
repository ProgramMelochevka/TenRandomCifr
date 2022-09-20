package by.home.maxzzzit;

public class TenRandomCifr {
	public static void main(String[] args) {
		int x;
		System.out.print("Десять случайных двухзначных чисел: ");
		for (int i=0; i<10; i++) {
			x = 10 + (int) (Math.random() * 90);
			System.out.print(x+", ");
		}
	}
}
