import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {

		int n,m,resultado;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dame un numero n");
		n = scanner.nextInt();

		System.out.println("Dame un numero m");
		m = scanner.nextInt();

		while ( (n <=0 || n >10) && (m <=0 || m >10)) {
			n = scanner.nextInt();
			m = scanner.nextInt();
		}

		resultado = calculaSuma(n,m);
		scanner.close();
		
		System.out.println("El resultado de sumar "+n+" y "+m+" es: "+resultado);

	}

	public static int calculaSuma(int x, int y) {
		int res = 0;

		if  ( (x > 0 && x < 10) && ( y > 0 && y < 10) )  {
			
			res = x + y;
		}
		else {
			res = -1;
		}
		return res;
	}
}