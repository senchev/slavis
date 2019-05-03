package testingjunit;

public class Cuenta {

	private String numeroCuenta;
	private String identificador;

	private double saldo;
	private String nombre;
	private String dni;

	public Cuenta() {

	}

	public Cuenta(String cuenta, double inicial, Cliente cliente) {

		numeroCuenta = cuenta;
		saldo = inicial;
		nombre = cliente.getNombre();
		dni = cliente.getDni();
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public boolean depositar(double cantidad) {
		boolean ingresoCorrecto = true;
		if (cantidad < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + cantidad;
		}
		return ingresoCorrecto;
	}

	public boolean reintegro(double cantidad) {
		boolean reintegroCorrecto = true;
		if (cantidad < 0) {
			reintegroCorrecto = false;
		} else if (saldo >= cantidad) {
			saldo -= cantidad;
		} else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}

	public double saldo() {
		return saldo;
	}

	public boolean transferencia(Cuenta c, double cantidad) {
		boolean transferenciaCorrecta = true;
		if (cantidad < 0) {
			transferenciaCorrecta = false;
		} else if (saldo >= cantidad) {
			reintegro(cantidad);
			c.depositar(cantidad);
		} else {
			transferenciaCorrecta = false;
		}
		return transferenciaCorrecta;
	}

	public boolean traspaso(Cuenta c, double cantidad) {
		boolean transferenciaCorrecta = true;
		if (cantidad < 0) {
			transferenciaCorrecta = false;
		} else if (saldo >= cantidad) {
			saldo = saldo - cantidad;
			c.depositar(cantidad);
		} else {
			transferenciaCorrecta = false;
		}
		return transferenciaCorrecta;
	}

}
