package continuandoMetodoss2020;

import java.util.Scanner;

public class Classe extends Consulta {

//private boolean depositar;

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Classe conta = new Classe();
	Classe poupanca = new Classe();
	
	
	System.out.println("Digite o valor de dep�sito!!!");
	conta.depositar(teclado.nextDouble());
	
	
	poupanca.tranferencia(valorPoupanca);
	System.out.println("Sua conta poupan�a acaba de receber R$ " + valorPoupanca );
	
	
}
}
	      
	