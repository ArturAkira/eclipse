package prototipo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class codigo1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		DecimalFormat div = new DecimalFormat("0.00");
		
		int e,r;
		double x,y,res;

	do {
		System.out.println("Olá, mundo!");
		System.out.println("O que você deseja fazer?");
		System.out.println("_1 - Somar_");
		System.out.println("_2 - Subtrair_");
		System.out.println("_3 - Multiplicar_");
		System.out.println("_4 - Dividir_");
			e = ler.nextInt();
		if (e == 1) {
			System.out.println("Certo! Digite o primero número: ");
			x = ler.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = ler.nextDouble();
			res = x + y;
			System.out.println("O resultado é: "+res);
		}
		
		else if (e == 2) {
			System.out.println("Certo! Digite o primero número: ");
			x = ler.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = ler.nextDouble();
			res = x - y;
			System.out.println("O resultado é: "+res);
		}
		else if (e == 3) {
			System.out.println("Certo! Digite o primero número: ");
			x = ler.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = ler.nextDouble();
			res = x * y;
			System.out.println("O resultado é: "+res);
		}
		else if (e == 4) {
			System.out.println("Certo! Digite o primero número: ");
			x = ler.nextDouble();
			System.out.println("Digite o segundo número: ");
			y = ler.nextDouble();
			if(y == 0) {
				System.out.println("Não é possível dividir por zero");
			}
			else {
				res = x/y;
				System.out.println("Oresultado da divisão é: "+div.format(res));
			}
		}
		else {
			System.out.println("Nenhuma opção foi escolhida...");
		}
		
		System.out.println("deseja calcular novamente?");
		System.out.println("_1 - Sim_");
		System.out.println("_2 - Não_");
			r = ler.nextInt();
			
			if(r != 1 && r != 2) {
				do {
				System.out.println("Essa não é uma opção válida...");
				System.out.println("deseja calcular novamente?");
				System.out.println("_1 - Sim_");
				System.out.println("_2 - Não_");
					r = ler.nextInt();
				} while(r != 1 && r != 2);
			}
			
	
	} while (r != 2);
		
		System.out.println("Fim do programa");
	}
}
