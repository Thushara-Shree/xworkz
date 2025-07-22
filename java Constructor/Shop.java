class Shop{
	public static void sell(String vegetable,int quantity){
		System.out.println("Running Shop class");
		System.out.println(vegetable+","+quantity);
		 Agent.purchase(vegetable, quantity);
	}
}