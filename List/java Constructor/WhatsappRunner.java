class WhatsappRunner{
	public static void main(String[] args){
		int msgNo1=1;
		String feature1="Dark Mode";
		boolean recieved1=true;
		
		Whatsapp whatsapp1=new Whatsapp(msgNo1,feature1,recieved1);
		
		System.out.println(whatsapp1.msgNo);
		System.out.println(whatsapp1.feature);
		System.out.println(whatsapp1.recieved);
		
		int msgNo2=2;
		String feature2="Delete for everyone";
		boolean recieved2=false;
		
		Whatsapp whatsapp2=new Whatsapp(msgNo2,feature2,recieved2);
		
		System.out.println(whatsapp2.msgNo);
		System.out.println(whatsapp2.feature);
		System.out.println(whatsapp2.recieved);
		
		int msgNo3=3;
		String feature3="DP Privacy";
		boolean recieved3=true;
		
		Whatsapp whatsapp3=new Whatsapp(msgNo3,feature3,recieved3);
		
		System.out.println(whatsapp3.msgNo);
		System.out.println(whatsapp3.feature);
		System.out.println(whatsapp3.recieved);
		
		int msgNo4=4;
		String feature4="user made stickers";
		boolean recieved4=false;
		
		Whatsapp whatsapp4=new Whatsapp(msgNo4,feature4,recieved4);
		
		System.out.println(whatsapp4.msgNo);
		System.out.println(whatsapp4.feature);
		System.out.println(whatsapp4.recieved);
		
		int msgNo5=5;
		String feature5="Encryption";
		boolean recieved5=true;
		
		Whatsapp whatsapp5=new Whatsapp(msgNo5,feature5,recieved5);
		
		System.out.println(whatsapp5.msgNo);
		System.out.println(whatsapp5.feature);
		System.out.println(whatsapp5.recieved);
		
	}
}