package boxoffice.system;

public class MainClass {

	public static void main(String[] args) {
		ICar car1 = new Automobile(2000,"Batuhan","Okur",12345);
		ICar car2 = new Bus(3000,"Berat","Safran",12345);
		ICar car3 = new Minibus(4000,"Serkan","Aydoğdu",12345);
		ICar car4 = new Automobile(5000,"Ali","Atay",12345);
		TicketOffice of = new TicketOffice();
		Management mn = new Management();
		
		System.out.println("Car1 geçmeden önce : " + car1.Balance());
		of.Payment(car1);
		System.out.println("Car1 geçtikten sonra : " + car1.Balance());
		
		System.out.println("Car2 geçmeden önce : " + car2.Balance());
		of.Payment(car2);
		System.out.println("Car2 geçtikten sonra : " + car2.Balance());
		
		System.out.println("Car3 geçmeden önce : " + car3.Balance());
		of.Payment(car3);
		System.out.println("Car3 geçtikten sonra : " + car3.Balance());
		
		System.out.println("Car4 geçmeden önce : " + car4.Balance());
		of.Payment(car4);
		System.out.println("Car4 geçtikten sonra : " + car4.Balance());
		
		
		System.out.println("*********************************************************************");
		
		
		System.out.println("Araç Listesi:");
		System.out.println("*********************************************************************");
		for(ICar car: of.carList)
		{			
			System.out.println("Araç Tipi: " + car.ReturnType());
			System.out.println("HGS No: " + car.HgsNumber());
			System.out.println("Sahibinin Adı: " + car.Name());
			System.out.println("Sahibinin Soyadı: " + car.Surname());
			System.out.println("Araç Bakiyesi " + car.Balance());
			System.out.println("------------------------------------------------------------");
		}
		
		System.out.println("Toplam elde edilen gelir: " + mn.TotalIncome(of));
		
		

	}

}
