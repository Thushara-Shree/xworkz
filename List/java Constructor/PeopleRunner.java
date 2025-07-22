class PeopleRunner{
	public static void main(String[] args){
		
		String name="Harry";
		String status=People.count(name);
		System.out.println("The person is "+status);
		
		String name1="Dobby";
		String status1=People.count(name1);
		System.out.println("The person is "+status1);
		
		String name2="Ginny";
		String status2=People.count(name2);
		System.out.println("The person is "+status2);
		
		String name3="Lily";
		String status3=People.count(name3);
		System.out.println("The person is "+status3);
		
		String name4="Hermione";
		String status4=People.count(name4);
		System.out.println("The person is "+status4);
		
		String name5="Draco";
		String status5=People.count(name5);
		System.out.println("The person is "+status5);
		
		
	}
}