class Chat{
	int msgNo;
	String platform;
	boolean recieved;
	
	public Chat(int msgNo,String platform,boolean recieved){
		this.msgNo=msgNo;
		this.platform=platform;
		this.recieved=recieved;
		System.out.println("Running Chat Constructor");
	}
	
}