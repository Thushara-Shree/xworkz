class Trafficsignal{
	
	static void redLight(){
		System.out.println("The method 5 of Traffic Signal is executed");
	}
	
	static void greenLight(){
		redLight();
		System.out.println("The method 6 of Traffic Signal is executed");
		
	}
	
	static void yellowLight(){
		System.out.println("The method 7 of Traffic Signal is executed");
	}
	
	static void solarSignal(){
			Lipstick.useLipstick();
			greenLight();
			Brand.microsoft();
			System.out.println("The method 8 of Traffic Signal is executed");
			
	}
	
		
	

		
}
