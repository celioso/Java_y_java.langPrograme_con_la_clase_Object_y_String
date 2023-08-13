package co.com.bytebank.test;

import co.com.bytebank.modelo.Cuenta;
import co.com.bytebank.modelo.CuentaCorriente;

public class TestLibreria {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaCorriente(12, 12);
		cuenta.deposita(200.0);
	}
}
