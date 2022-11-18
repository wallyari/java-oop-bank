package jana60.bank;

import java.util.Random;

public class Conto {

	public String proprietario;
	public int numeroConto;
	private int saldo;
	
	
	public Conto(String proprietario) {
		
		Random rnd = new Random();
		this.numeroConto = rnd.nextInt(999999999);
		this.saldo = 0;
		this.proprietario = proprietario;
	}
	
	public int getConto() {
		return numeroConto;
	}

	public int getSaldo() {
		return saldo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	
	public int addMoney(int value) {
		if(!(value < 0))
			saldo += value;
		return saldo;
	}
	
	public int getMoney(int value) {
		
		if(saldo > value)
			saldo -= value;
		return saldo;
	}
	
	@Override
		public String toString() {			
			return "Nome proprietario: " + proprietario
					+ "\nNumero conto: " + numeroConto
					+ "\nSaldo: " + saldo;
		}
	
}
	
	
	

