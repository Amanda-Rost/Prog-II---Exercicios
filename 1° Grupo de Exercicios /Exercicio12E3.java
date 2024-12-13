import java.util.ArrayList;
import java.util.Scanner;
// Exercicios de função

public class Exercicio12E3 {
	static int fatorial(int num) {
		int cont = num - 1 , res = num;
		do {
			if(res!=1) {
				res = res * cont;
			}
			cont--;
		}while(cont > 0);
		if(num == 0)res = 1;
		return res;
	}

	static int contaMin(String tex) {
		int cont = 0, cont2 = 0;
		do {
			char let = tex.charAt(cont);
			int valAsc = (int) let;
			if(valAsc <= 122 && valAsc >= 97 )cont2++;
			
			cont++;
		}while(cont<tex.length());
		return cont2;
	}

	static double mediaVet(ArrayList num) {
		int cont = 0, val = 0;
		double res = 0;
		do {
            val += (int) num.get(cont);
			cont++;
		}while(cont <= num.size() -1);
		res = val / num.size();
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Exercicio 1 : Fazer o fatorial de um numero
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		System.out.println("Fatorial do numero que digitou eh: "+fatorial(num));

		// Exercicio 2: Conta quantas letras minusculas tem na String
		System.out.println("Digite uma palavra:");
		String palavra = sc.next();
		System.out.println("Ha "+contaMin(palavra)+ " letras minusculas nessa palavra");

		//Exerciocio 3: Calcula a media
		ArrayList<Integer> nums = new ArrayList<>();

		System.out.println("Digite números positivos (digite -1 para parar):");
		while (true) {
			int val = sc.nextInt();
			if (val == -1) break; // Condição de parada
			nums.add(val); // Adiciona à lista
		}

		System.out.println(mediaVet(nums)+ " eh a media dos numeros que digitou!");
	}
}
