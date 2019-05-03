package testingjunit;

public class App {

	public static void main(String[] args) {
		double totalCuenta;
		Cliente cliente;
		// Creamos la cuenta

		Cliente cliente1;
		cliente1 = new Cliente("Slavi", "Enchev", "Y2066068S", 674614021, "Rei Jaime 1, 73");
		Cuenta cuenta1;
		cuenta1 = new Cuenta("0049-1111-2222-3333-4444", 0, cliente1);
		
		Cuenta cuenta2;
		cuenta1 = new Cuenta("0039-1111-2322-3533-1234", 0, cliente1);

		// Consultamos el saldo
		totalCuenta = cuenta1.saldo();
		System.out.println("Total actual en la cuenta: " + totalCuenta + " €");

	}

}
