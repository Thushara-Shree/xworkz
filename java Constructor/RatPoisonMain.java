class RatPoisonMain{
	public static void main(String[] args){
		
		int count1=1;
		String brand1="RodentFix";
		String color1="red";
		
		RatPoison ratPoison1=new RatPoison(count1,brand1,color1);
		
		System.out.println(ratPoison1.count);
		System.out.println(ratPoison1.brand);
		System.out.println(ratPoison1.color);
		
		int count2=2;
		String brand2="RUBY poison";
		String color2="blue";
		
		RatPoison ratPoison2=new RatPoison(count2,brand2,color2);
		
		System.out.println(ratPoison2.count);
		System.out.println(ratPoison2.brand);
		System.out.println(ratPoison2.color);
		
		int count3=3;
		String brand3="Sapphire Poison";
		String color3="green";
		
		RatPoison ratPoison3=new RatPoison(count3,brand3,color3);
		
		System.out.println(ratPoison3.count);
		System.out.println(ratPoison3.brand);
		System.out.println(ratPoison3.color);
		
		int count4=4;
		String brand4="Romax Poison";
		String color4="yellow";
		
		RatPoison ratPoison4=new RatPoison(count4,brand4,color4);
		
		System.out.println(ratPoison4.count);
		System.out.println(ratPoison4.brand);
		System.out.println(ratPoison4.color);
		
		int count5=5;
		String brand5="Racan Poison";
		String color5="orange";
		
		RatPoison ratPoison5=new RatPoison(count5,brand5,color5);
		
		System.out.println(ratPoison5.count);
		System.out.println(ratPoison5.brand);
		System.out.println(ratPoison5.color);
	}
	
	
}