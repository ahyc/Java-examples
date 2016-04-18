import food.Fruit;
class Apple extends Fruit {
    
    public Apple() {
        super();
        this.changeYear();
        System.out.println("The year is " +this.year);
    }
    
    public static void main(String args[]) {
        Apple ac = new Apple();
        ac.year = 2007;
        
        System.out.println("The year is now " +ac.year);
        
    }
}
