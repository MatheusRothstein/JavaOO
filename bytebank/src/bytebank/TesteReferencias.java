package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta é " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("segunda conta saldo " + segundaConta.saldo);
		
		System.out.println("Primeira conta saldo " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesmíssima conta");
		}
	}

}
