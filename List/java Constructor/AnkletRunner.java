class AnkletRunner{
	
	public static void main(String[] args){
		long price=60781;
		String metal="Platinum";
		String brand="Sulthan Jewellery";
		
		Anklet anklet1=new Anklet(price,metal,brand);
		
		System.out.println(anklet1.price);
		System.out.println(anklet1.metal);
		System.out.println(anklet1.brand);
		
		long price2=69798;
		String metal2="Gold";
		String brand2="Titan Jewellery";
		
		Anklet anklet2=new Anklet(price2,metal2,brand2);
		
		System.out.println(anklet2.price);
		System.out.println(anklet2.metal);
		System.out.println(anklet2.brand);
		
		long price3=56784;
		String metal3="silver";
		String brand3="Kalyan Jewellery";
		
		Anklet anklet3=new Anklet(price3,metal3,brand3);
		
		System.out.println(anklet3.price);
		System.out.println(anklet3.metal);
		System.out.println(anklet3.brand);
		
		long price4=87789;
		String metal4="Diamond";
		String brand4="Bhima Jewellery";
		
		Anklet anklet4=new Anklet(price4,metal4,brand4);
		
		System.out.println(anklet4.price);
		System.out.println(anklet4.metal);
		System.out.println(anklet4.brand);
		
		long price5=10781;
		String metal5="copper";
		String brand5="Malabar Jewellery";
		
		Anklet anklet5=new Anklet(price5,metal5,brand5);
		
		System.out.println(anklet5.price);
		System.out.println(anklet5.metal);
		System.out.println(anklet5.brand);
		
		
		
	}
}