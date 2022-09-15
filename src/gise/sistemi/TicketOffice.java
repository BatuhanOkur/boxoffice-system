package gise.sistemi;

import java.util.ArrayList;

public class TicketOffice implements IOffice{	
	ArrayList <ICar> carList = new ArrayList<ICar>();
	ArrayList <Integer> incomes = new ArrayList<Integer>();
	public void Payment(ICar car)
	{
		int balance = car.Balance();
		if(car instanceof Bus )
		{
			balance -= 200;
			incomes.add(200);
			((Bus) car).setBalance(balance);
		}
		else if(car instanceof Automobile )
		{
			balance -= 100;
			incomes.add(100);
			((Automobile) car).setBalance(balance);
		}
		else
		{
			balance -= 150;
			incomes.add(150);
			((Minibus) car).setBalance(balance);
		}
		carList.add(car);
		
	}
	@Override
	public ArrayList<Integer> Incomes() {
		return incomes;
	}

	
	
}
