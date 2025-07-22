class SubRegionalPostOfffice{
	public static void deliver(String customername, String address){
		System.out.println("Class SubRegionalPostOfffice is executed");
		System.out.println(customername+","+address);
		RegionalPostOfffice.deliver(customername,address);
	}
}