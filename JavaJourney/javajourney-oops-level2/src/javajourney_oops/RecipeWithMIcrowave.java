package javajourney_oops;

public class RecipeWithMIcrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("GEt the raw materials");
		System.out.println("Switch on the mwave");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the dish");
	}

	@Override
	void cleanup() {
		System.out.println(" Clean the utensils.");
		System.out.println("Switch off the mwave");

	}

}
