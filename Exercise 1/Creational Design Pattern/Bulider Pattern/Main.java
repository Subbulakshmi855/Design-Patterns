public class  Main{
    public static void main(String[] args) {
        PizzaBuilder builder = new ConcretePizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);
        Pizza margherita = director.makeMargheritaPizza();
        Pizza pepperoni = director.makePepperoniPizza();
        System.out.println("Margherita Pizza: \n" + margherita);
        System.out.println("Pepperoni Pizza: \n" + pepperoni);
    }
}
