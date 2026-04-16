package javajourney_oops;

public class Recipe1 extends AbstractRecipe {

	@Override

	void getReady() {
		System.out.println("GEt the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("Prepare the dish");
	}

	@Override
	void cleanup() {
		System.out.println(" Clean the utensils.");
	}

}
