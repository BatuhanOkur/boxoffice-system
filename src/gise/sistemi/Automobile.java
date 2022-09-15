package gise.sistemi;

public class Automobile implements ICar {
	
	private int balance;
	private String name;
	private String surname;
	private int hgsNumber;
	
	

	public Automobile(int balance, String name, String surname, int hgsNumber) {
		this.balance = balance;
		this.name = name;
		this.surname = surname;
		this.hgsNumber = hgsNumber;
	}

	@Override
	public int HgsNumber() {
		// TODO Auto-generated method stub
		return hgsNumber;
	}

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String Surname() {
		// TODO Auto-generated method stub
		return surname;
	}

	@Override
	public int Balance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	public void setBalance(int amount) {
		this.balance = amount;
		
	}

	@Override
	public String ReturnType() {
		// TODO Auto-generated method stub
		return "Automobile";
	}

}
