class Trip{
	public static double price(String source){
		System.out.println("The source is "+source);
		
		if(source=="Manali"){
			return 14000;
		}
		
		else if(source=="Ooty"){
			return 8000;
		}
		else if(source=="Munnar"){
			return 10000;
		}
		else if(source=="Goa"){
			return 18000;
		}
		else if(source=="Delhi"){
			return 21000;
		}
		else
			return 0;
	}
}