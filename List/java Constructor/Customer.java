class Customer{
	public static void buy(String vegetable,int quantity){
		System.out.println("Running Customer class");
		System.out.println(vegetable+","+quantity);
		Shop.sell(vegetable, quantity);
	}
}