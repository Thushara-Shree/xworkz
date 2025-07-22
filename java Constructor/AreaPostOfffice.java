class AreaPostOfffice{
	public static void deliver(String customername, String address){
		System.out.println("Class AreaPostOfffice is executed");
		System.out.println(customername+","+address);
		SubRegionalPostOfffice.deliver(customername,address);
	}
}