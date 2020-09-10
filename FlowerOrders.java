/* Developer: Stephanie Quick
 * Program: Flower Shop - Factory Pattern
 * Date: September 9 2020
 * Course: Object Oriented Development
 * */
public class FlowerOrders {

	public static void main(String[] args) {
		
		FlowerShop summerShop = new SummerFlowerShop();
		FlowerShop winterShop = new WinterFlowerShop();
		
		Flowers flowers = summerShop.orderFlowers("summerAnniversary");
		System.out.println("");
		System.out.println("Aubree ordered a " + flowers.getName() + "\n");
 
		flowers = winterShop.orderFlowers("winterWedding");
		System.out.println("");
		System.out.println("Jessica ordered a " + flowers.getName() + "\n");

		flowers = winterShop.orderFlowers("winterBirthday");
		System.out.println("");
		System.out.println("Xavier ordered a " + flowers.getName() + "\n");
		
		flowers = summerShop.orderFlowers("summerWedding");
		System.out.println("");
		System.out.println("Jenna ordered a " + flowers.getName() + "\n");
 
	}

}
