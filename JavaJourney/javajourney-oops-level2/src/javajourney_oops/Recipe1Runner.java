package javajourney_oops;

public class Recipe1Runner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		System.out.println("-------------");
		RecipeWithMIcrowave recipe2 = new RecipeWithMIcrowave();
		recipe2.execute();
	}

}
