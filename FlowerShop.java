public abstract class FlowerShop {	
		abstract Flowers createFlowers(String item); // creates a new string called item --> used for the orders
		
		public Flowers orderFlowers(String type) {
			Flowers flowers = createFlowers(type);
			
			System.out.println("--- Making the " + flowers.getName() + " flower arrangment ---");
			System.out.println("              ***Freshening up your bonquet***");
			System.out.println(" ");
			
			// Calling methods from Flowers.java class
			flowers.gather();
			flowers.prepare();
			flowers.arrange();
			
			return flowers;
		}

	}


