public class WinterFlowerShop extends FlowerShop { // similar to summer flower shop --> just for the winter flowers 

	Flowers createFlowers(String item) {
    	if (item.equals("winterAnniversary")) {
        		return new AnniversaryWinterArrangments();
    	} else if (item.equals("winterBirthday")) {
    	    	return new BirthdayWinterArrangments();
    	} else if (item.equals("winterWedding")) {
    	    	return new WeddingWinterArrangments();
    	} else return null;
   }
}
