package testingjunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class transferenciaTest {

	public void test() {
		System.out.println("La prueba ha iniciado.");
	}
	
	
	
	public void compararCuentas() {
		Cliente cliente;
		Cuenta cuenta;

		Cliente cliente1;
		cliente1 = new Cliente("Slavi", "Enchev", "Y2066068S",
				674614021, "Rei Jaime 1, 73");
		Cliente cliente2;
		cliente2 = new Cliente("Alvaro", "Campo", "Z123068S", 
				634213441, "Aragón bolk 37");
		
		Cuenta cuenta1;
		cuenta1 = new Cuenta("0049-1111-2222-3333-4444", 400, cliente1);

		Cuenta cuenta2;
		cuenta2 = new Cuenta("0039-1111-2322-3533-1234", 600, cliente2);

		System.out.println("Saldo de la cuenta 1: " + cuenta1.getSaldo());
		System.out.println("Saldo de la cuenta 2: " + cuenta2.getSaldo());

		assertEquals(cuenta1.getDni(), cuenta2.getDni());
	}

	
	public void comprobarTransferencia() {

		System.out.println("_______________");
		System.out.println("Transferencia");
		System.out.println("_______________");

		Cliente cliente;
		Cuenta cuenta;
		

		Cliente cliente1;
		cliente1 = new Cliente("Slavi", "Enchev", "Y2066068S",
				674614021, "Rei Jaime 1, 73");

		Cliente cliente2;
		cliente2 = new Cliente("Alvaro", "Campo", "Z123068S", 
				634213441, "Aragón bolk 37");
		
		Cuenta cuenta1;
		cuenta1 = new Cuenta("0049-1111-2222-3333-4444", 400, cliente1);

		Cuenta cuenta2;
		cuenta2 = new Cuenta("0039-1111-2322-3533-1234", 600, cliente2);

		cuenta1.transferencia(cuenta2, 200);

		System.out.println("Saldo de la cuenta1: " + cuenta1.getSaldo());
		System.out.println("Saldo de la cuenta2: " + cuenta2.getSaldo());

	}

	@Test
	public void comprobarSaldo() {
		System.out.println("_______________");
		System.out.println("Comprobacion de saldo.");
		System.out.println("_______________");
		
		Cliente cliente;
		Cuenta cuenta;

		Cliente cliente1;
		cliente1 = new Cliente("Slavi", "Enchev", "Y2066068S", 674614021, "Rei Jaime 1, 73");
		Cliente cliente2;
		cliente2 = new Cliente("Alvaro", "Campo", "Z123068S", 634213441, "Aragón bolk 37");

		Cuenta cuenta1;
		cuenta1 = new Cuenta("0049-1111-2222-3333-4444", 400, cliente1);

		Cuenta cuenta2;
		cuenta2 = new Cuenta("0039-1111-2322-3533-1234", 100, cliente2);

		cuenta2.transferencia(cuenta1, 600);

		System.out.println("Saldo de la cuenta1: " + cuenta1.getSaldo());
		System.out.println("Saldo de la cuenta2: " + cuenta2.getSaldo());

	}

}
