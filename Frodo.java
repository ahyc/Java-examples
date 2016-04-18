public class Frodo extends Hobbit {
       public static void main (String[] args) {
       	      int myGold = 7;
	      Hobbit frodo = new Hobbit();
	      System.out.println(frodo.countGold(myGold,6));
	}

}

class Hobbit {
      int countGold(int x, int y) {
      	  return x+y;
	}
}
