// Specific Summer shop -- grabs/inherits the objects from flower shop
public class SummerFlowerShop extends FlowerShop {
	Flowers createFlowers(String item) {
    	if (item.equals("summerAnniversary")) { // if the item equals this value,then the anniversarysummerarrangements method is called 
        		return new AnniversarySummerArrangments();
    	} else if (item.equals("summerBirthday")) {
    	    	return new BirthdaySummerArrangments();
    	} else if (item.equals("summerWedding")) {
    	    	return new WeddingSummerArrangements();
    	} else return null;
   }
}

