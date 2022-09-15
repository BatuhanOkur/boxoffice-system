package boxoffice.system;

public class Management{

	int totalIncome = 0;
	
	public int TotalIncome(IOffice of)
	{
		for(int i: of.Incomes())
		{
			totalIncome += i;
		}
		
		return totalIncome;
	}
	
	
	
	
	
	
}
