class TripRunner{
	
	public static void main(String[] args){
		
		String source="Manali";
		double rate=Trip. price(source);
		System.out.println("The price is "+rate);
		
		String source1="Ooty";
		double rate1=Trip. price(source1);
		System.out.println("The price is "+rate1);
		
		String source2="Munnar";
		double rate2=Trip. price(source2);
		System.out.println("The price is "+rate2);
		
		String source3="Goa";
		double rate3=Trip. price(source);
		System.out.println("The price is "+rate3);
		
		String source4="Delhi";
		double rate4=Trip. price(source4);
		System.out.println("The price is "+rate4);
	}
}