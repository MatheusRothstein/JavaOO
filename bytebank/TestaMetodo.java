package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20); 
		System.out.println("atual saldo: " + contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.saldo += 400;
		System.out.println("saldo Marcela antes transferencia: " + contaMarcela.saldo);
		System.out.println("Conta paulo antes transferência: " + contaDoPaulo.saldo);
		if(contaMarcela.transfere(200, contaDoPaulo)) {
			System.out.println("transferência deu certo :)");
		} else {
			System.out.println("Faltou dinheiro :(");
		}
		System.out.println("Saldo marcela depois transferência: " + contaMarcela.saldo);
		System.out.println("Conta Paulo depois transferência: " + contaDoPaulo.saldo);
		
	}

}
