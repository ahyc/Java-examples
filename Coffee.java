enum CoffeeSize {
    BIG (8), HUGE(10), OVERWHELMING (16){
        public String getLidCode() {
            return "A";
        }
    };
	CoffeeSize (int ounces) {
		 this.ounces = ounces;
	}

	private int ounces;

	public int getOunces() {
	       return ounces;
	}

    public String getLidCode() {
        return "B";
    }
}

class Coffee {
      //Constructor variable; each time an instance is made, the instance has a separate enum:
      CoffeeSize size;

      public static void main(String args[]) {
         //Each object creates an instance of Coffee, not "CoffeeSize"
         Coffee drink1 = new Coffee();
	     drink1.size = CoffeeSize.BIG;

	     Coffee drink2 = new Coffee();
	     drink2.size = CoffeeSize.OVERWHELMING;

	     System.out.println(drink1.size.getOunces());
	     for(CoffeeSize cs: CoffeeSize.values()) {
	     		    System.out.println(cs + " " + cs.getOunces() + " " + cs.getLidCode();
	     }
      }
}


