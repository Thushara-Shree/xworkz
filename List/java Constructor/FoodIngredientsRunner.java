class FoodIngredientsRunner{
	public static void main(String[] args){
		
		
		String[] ingridents=FoodIngredients.food(FoodIt.CHAPPATI);
		for(String ing:ingridents)
		{
			System.out.println(ing);
		}
	}
}