class ChatRunner{
	public static void main(String[] args){
		int msgNo1=1;
		String platform1="Whatsapp";
		boolean recieved1=true;
		
		Chat chat1=new Chat(msgNo1,platform1,recieved1);
		
		System.out.println(chat1.msgNo);
		System.out.println(chat1.platform);
		System.out.println(chat1.recieved);
		
		int msgNo2=2;
		String platform2="Facebook";
		boolean recieved2=false;
		
		Chat chat2=new Chat(msgNo2,platform2,recieved2);
		
		System.out.println(chat2.msgNo);
		System.out.println(chat2.platform);
		System.out.println(chat2.recieved);
		
		int msgNo3=3;
		String platform3="SnapChat";
		boolean recieved3=true;
		
		Chat chat3=new Chat(msgNo3,platform3,recieved3);
		
		System.out.println(chat3.msgNo);
		System.out.println(chat3.platform);
		System.out.println(chat3.recieved);
		
		int msgNo4=4;
		String platform4="Instagram";
		boolean recieved4=false;
		
		Chat chat4=new Chat(msgNo4,platform4,recieved4);
		
		System.out.println(chat4.msgNo);
		System.out.println(chat4.platform);
		System.out.println(chat4.recieved);
		
		int msgNo5=5;
		String platform5="Twitter";
		boolean recieved5=true;
		
		Chat chat5=new Chat(msgNo5,platform5,recieved5);
		
		System.out.println(chat5.msgNo);
		System.out.println(chat5.platform);
		System.out.println(chat5.recieved);
		
	}
}