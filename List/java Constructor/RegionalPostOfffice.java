class RegionalPostOfffice{
	public static void deliver(String customername, String address){
		System.out.println("Class RegionalPostOfffice is executed");
		System.out.println(customername+","+address);
		PostHeadMaster.deliver(customername,address);
	}
}