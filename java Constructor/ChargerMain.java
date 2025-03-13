class ChargerMain{
	public static void main(String[] args){
		
		String appliance1="Laptop";
		char chargType1='A';
		String brand1="Lenovo";
		
		Charger charger1=new Charger(appliance1,chargType1,brand1);
		
		System.out.println(charger1.appliance);
		System.out.println(charger1.chargType);
		System.out.println(charger1.brand);
		
		
		String appliance2="Lamp";
		char chargType2='B';
		String brand2="Philips";
		
		Charger charger2=new Charger(appliance2,chargType2,brand2);
		
		System.out.println(charger2.appliance);
		System.out.println(charger2.chargType);
		System.out.println(charger2.brand);
		
		
		String appliance3="Phone";
		char chargType3='C';
		String brand3="Realme";
		
		Charger charger3=new Charger(appliance3,chargType3,brand3);
		
		System.out.println(charger3.appliance);
		System.out.println(charger3.chargType);
		System.out.println(charger3.brand);
		
		
		String appliance4="Phone";
		char chargType4='D';
		String brand4="Poco";
		
		Charger charger4=new Charger(appliance4,chargType4,brand4);
		
		System.out.println(charger4.appliance);
		System.out.println(charger4.chargType);
		System.out.println(charger4.brand);
		
		
		String appliance5="Smart Watch";
		char chargType5='E';
		String brand5="Samsung";
		
		Charger charger5=new Charger(appliance5,chargType5,brand5);
		
		System.out.println(charger5.appliance);
		System.out.println(charger5.chargType);
		System.out.println(charger5.brand);
		
	}
}