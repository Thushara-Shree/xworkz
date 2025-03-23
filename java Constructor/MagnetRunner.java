class MagnetRunner{
	public static void main(String[] args){
		
		String appliance1="Speaker";
		String magnetType1="permanent";
		String brand1="Arnold";
		
		Magnet magnet1=new Magnet(appliance1,magnetType1,brand1);
		
		System.out.println(magnet1.appliance);
		System.out.println(magnet1.magnetType);
		System.out.println(magnet1.brand);
		
		
		String appliance2="Refrigerator";
		String magnetType2="permanent";
		String brand2="Dexter";
		
		Magnet magnet2=new Magnet(appliance2,magnetType2,brand2);
		
		System.out.println(magnet2.appliance);
		System.out.println(magnet2.magnetType);
		System.out.println(magnet2.brand);
		
		
		String appliance3="Phone";
		String magnetType3="electromagnet";
		String brand3="Adams";
		
		Magnet magnet3=new Magnet(appliance3,magnetType3,brand3);
		
		System.out.println(magnet3.appliance);
		System.out.println(magnet3.magnetType);
		System.out.println(magnet3.brand);
		
		
		String appliance4="Fan";
		String magnetType4="temporary";
		String brand4="Eclipse";
		
		Magnet magnet4=new Magnet(appliance4,magnetType4,brand4);
		
		System.out.println(magnet4.appliance);
		System.out.println(magnet4.magnetType);
		System.out.println(magnet4.brand);
		
		
		String appliance5="Generator";
		String magnetType5="permanent";
		String brand5="Thomas and Skinner";
		
		Magnet magnet5=new Magnet(appliance5,magnetType5,brand5);
		
		System.out.println(magnet5.appliance);
		System.out.println(magnet5.magnetType);
		System.out.println(magnet5.brand);
		
	}
}