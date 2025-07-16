class BarRunner{
	
	public static void main(String[] args){
	String brand1="Jack Daniels";
	String alcType1="Whiskey";
	String location1="Delhi";
	
	Bar bar1=new Bar(brand1,alcType1,location1);
	
	System.out.println(bar1.brand);
	System.out.println(bar1.alcType);
	System.out.println(bar1.location);
	
	String brand2="Johnnie Walker";
	String alcType2="Wine";
	String location2="manglore";
	
	Bar bar2=new Bar(brand2,alcType2,location2);
	
	System.out.println(bar2.brand);
	System.out.println(bar2.alcType);
	System.out.println(bar2.location);
	
	String brand3="Old Monk";
	String alcType3="Rum";
	String location3="Banglore";
	
	Bar bar3=new Bar(brand3,alcType3,location3);
	
	System.out.println(bar3.brand);
	System.out.println(bar3.alcType);
	System.out.println(bar3.location);
	
	String brand4="Baileys";
	String alcType4="Whiskey";
	String location4="UK";
	
	Bar bar4=new Bar(brand4,alcType4,location4);
	
	System.out.println(bar4.brand);
	System.out.println(bar4.alcType);
	System.out.println(bar4.location);
	
	String brand5="HeinKein";
	String alcType5="Beer";
	String location5="Banglore";
	
	Bar bar5=new Bar(brand5,alcType5,location5);
	
	System.out.println(bar5.brand);
	System.out.println(bar5.alcType);
	System.out.println(bar5.location);
	

}
}