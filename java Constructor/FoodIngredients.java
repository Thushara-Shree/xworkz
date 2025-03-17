class FoodIngredients{
	public static String[] food(FoodIt fooditems){
	
		
		if(fooditems==FoodIt.CHAPPATI){
			String[] items1={"wheat","flour","water","salt"};
			return items1;
			
			
		}
			else if(fooditems==FoodIt.MAGGIE){
				String[] items2={"maggie","maggie masala"};
				return items2;
		    
		}
		
		else if(fooditems==FoodIt.PIZZA){
			String[] items3={"Dough","Tomato Sauce","Cheese","Olives","Pepperoni"};
		return items3;
		}
			return null;
	}
	
	
		
	}
