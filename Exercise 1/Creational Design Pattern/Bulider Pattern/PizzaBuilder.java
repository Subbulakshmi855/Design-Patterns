public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setCrust(String crust);
    PizzaBuilder addCheese();
    PizzaBuilder addPepperoni();
    PizzaBuilder addVegetables();
    Pizza build();
}
