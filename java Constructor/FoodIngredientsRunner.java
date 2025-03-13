enum foodItems{
	CHAPPATI,
	MAGGIE,
	PIZZA
}
class FoodIngredientsRunner{
	public static void main(String[] args){
		foodItems name=foodItems.PIZZA;
		
		if(foodItems=="CHAPPATI"){
			System.out.println("The ingredients for chapatti are wheat flour,water,salt");
		}
		
		else if(foodItems=="MAGGIE"){
			System.out.println("The ingredients for maggie are maggie,maggie masala,water");
		}
		
		else if(foodItems=="PIZZA"){
			System.out.println("The ingredients for pizza are Dough, Tomato Sauce, Cheese, Olives, Pepperoni");
		}
		else{
			System.out.println("Choose another item");
		}
	}
}