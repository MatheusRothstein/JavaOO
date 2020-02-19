package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println("a agencia da primeira conta é " + primeiraConta.agencia);
		System.out.println("a agencia da segunda conta é " + segundaConta.agencia);
		
		segundaConta.agencia = 346;
		
		System.out.println("agora a agencia da segunda conta é " + segundaConta.agencia);
	}

}
 