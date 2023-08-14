package factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		do {
			System.out.print("Введите целое неотрицательное число: ");
			try {
				int a = sc.nextInt();
				if (a < 0) {
					System.out.println("Число должно быть положительным. Попробуйте еще раз. ");
				} else if (a == 0) {
					System.out.println("Факториал нуля  равен 1" );
					loop = false;
				} else {
					int f = 1;
					for(int i = 1; i <= a; i++) {
						f=f*i;
					}
					System.out.println("Факториал числа " + a + " равен " + f);
					loop = false;
				}

			} catch (InputMismatchException e) {
				System.out.println("Это не целое число. Попробуйте еще раз. ");
				sc.next();
			}

		} while (loop);
		sc.close();
	}
}
