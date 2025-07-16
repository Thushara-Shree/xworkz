class Country{
	public static void country(String[] cName){

		for(String ref:cName)
			if(ref.endsWith("a")|| ref.endsWith("A"))
			{
				System.out.println("The country name ends with 'a' or 'A'is "+ref);
			}
			else
			{
				System.out.println("The country name doesnt end with 'a' is "+ref);
			}
	}
}