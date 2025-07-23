class MainRunner{
	public static void main(String[] args){
		
		
		String type1="Diwali";
		String cuisine1="Soan Papdi";
		int days1=3;
		
		Festival festival1=new Festival(type1,cuisine1,days1);
	
		System.out.println(festival1.type);
		System.out.println(festival1.cuisine);
		System.out.println(festival1.days);
		
		String type2="Holi";
		String cuisine2="Bhang";
		int days2=2;
		
		Festival festival2=new Festival(type2,cuisine2,days2);
	
		System.out.println(festival2.type);
		System.out.println(festival2.cuisine);
		System.out.println(festival2.days);
		
		String type3="Ramzan";
		String cuisine3="Biriyani";
		int days3=1;
		
		Festival festival3=new Festival(type3,cuisine3,days3);
	
		System.out.println(festival3.type);
		System.out.println(festival3.cuisine);
		System.out.println(festival3.days);
		
		String type4="Vishu";
		String cuisine4="Veg Thali";
		int days4=1;
		
		Festival festival4=new Festival(type4,cuisine4,days4);
	
		System.out.println(festival4.type);
		System.out.println(festival4.cuisine);
		System.out.println(festival4.days);
		
		String type5="Christmas";
		String cuisine5="Plum Cake";
		int days5=1;
		
		Festival festival5=new Festival(type5,cuisine5,days5);
	
		System.out.println(festival5.type);
		System.out.println(festival5.cuisine);
		System.out.println(festival5.days);
		
		
		
	
	}
}