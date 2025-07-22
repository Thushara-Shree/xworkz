class People{
	public static String count(String name){
		System.out.println("The name of the person is "+name);
		
		if(name=="Harry"){
			return "alive";
		}
		
		else if(name=="Dobby"){
			return " not alive";
		}
		
		else if(name=="Ginny"){
			return "alive";
		}
		
		else if(name=="Lily"){
			return "not alive";
		}
		
		else if(name=="Hermione"){
			return "alive";
		}
		else
			
		return "not found";
		
	}
}