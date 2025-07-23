class Broker{
	public static void brokerage(String vegetable,int quantity){
		System.out.println("Running Broker class");
		System.out.println(vegetable+","+quantity);
		Farmer.farm(vegetable, quantity);
		
	}
}