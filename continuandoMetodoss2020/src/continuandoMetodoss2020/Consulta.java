package continuandoMetodoss2020;

public class Consulta{
	String titular;
	double salario;
	
	static double valorPoupanca;
	double calc;
	
	void depositar(double valorDeposito) {
		salario =valorDeposito;
		System.out.println("Vec� acabou de receber R$ " + salario +" em sua conta !!!");
		if(salario>=30000) {
			System.out.println("Voc� est� ganhando muito bem!!");
		}
		else {
			System.out.println("Voc� precisa estudar mais pois seu sal�rio est� pouco ainda");
		}
		
		
		
	}
	
	void tranferencia(double valorTranferencia) {
		valorTranferencia=salario-27000;
		
		
		valorPoupanca = valorTranferencia;
	}
	
	
}