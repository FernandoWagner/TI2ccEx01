package exercicio01;
import java.util.*;


class SomarDoisNumeros {
	public static void main(String args[]) {
		int n1, n2, soma;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		n1 = scan.nextInt();
		System.out.println("Digite um segundo numero");
		n2 = scan.nextInt();
		scan.close();
		
		soma = n1 + n2;
		
		System.out.println("Resultado: " + soma);
	}

}
