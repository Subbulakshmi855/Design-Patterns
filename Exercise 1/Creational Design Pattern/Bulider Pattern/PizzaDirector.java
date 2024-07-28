public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeMargheritaPizza() {
        return builder.setSize("Medium")
                      .setCrust("Thin")
                      .addCheese()
                      .build();
    }

    public Pizza makePepperoniPizza() {
        return builder.setSize("Large")
                      .setCrust("Thick")
                      .addCheese()
                      .addPepperoni()
                      .build();
    }
}
