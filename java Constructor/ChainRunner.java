class ChainRunner{
	
	public static void main(String[] args){
		long price=60781;
		String metal="Platinum";
		String brand="Sulthan Jewellery";
		
		Chain chain1=new Chain(price,metal,brand);
		
		System.out.println(chain1.price);
		System.out.println(chain1.metal);
		System.out.println(chain1.brand);
		
		long price2=69798;
		String metal2="Gold";
		String brand2="Titan Jewellery";
		
		Chain chain2=new Chain(price2,metal2,brand2);
		
		System.out.println(chain2.price);
		System.out.println(chain2.metal);
		System.out.println(chain2.brand);
		
		long price3=56784;
		String metal3="silver";
		String brand3="Kalyan Jewellery";
		
		Chain chain3=new Chain(price3,metal3,brand3);
		
		System.out.println(chain3.price);
		System.out.println(chain3.metal);
		System.out.println(chain3.brand);
		
		long price4=87789;
		String metal4="Diamond";
		String brand4="Bhima Jewellery";
		
		Chain chain4=new Chain(price4,metal4,brand4);
		
		System.out.println(chain4.price);
		System.out.println(chain4.metal);
		System.out.println(chain4.brand);
		
		long price5=10781;
		String metal5="copper";
		String brand5="Malabar Jewellery";
		
		Chain chain5=new Chain(price5,metal5,brand5);
		
		System.out.println(chain5.price);
		System.out.println(chain5.metal);
		System.out.println(chain5.brand);
		
		
		
	}
}