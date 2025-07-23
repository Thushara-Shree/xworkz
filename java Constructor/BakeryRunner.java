class BakeryRunner{
	public static void main(String[] args){
		
		String name="chocolates";
		int itemNo=10;
		Bakery.buy(name,itemNo);
		
		boolean value=true;
		Bakery.open(value);
		
		boolean valueV=false;
		Bakery.close(valueV);
		
		String ownerName="Harry";
		Bakery.owner(ownerName);
		
		String cashierName="Ron";
		Bakery.cashier(cashierName);
		
		
		
		
		
	}
	
	
}