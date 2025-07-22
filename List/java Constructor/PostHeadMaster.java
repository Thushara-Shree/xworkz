class PostHeadMaster{
	public static void deliver(String customername, String address){
		System.out.println("Class PostHeadMaster is executed");
		System.out.println(customername+","+address);
		PostMaster.deliver(customername,address);
	}
}