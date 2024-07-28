public class ConcretePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;
    public ConcretePizzaBuilder() {
        pizza = new Pizza();
    }
    @Override
    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }
    @Override
    public PizzaBuilder setCrust(String crust) {
        pizza.setCrust(crust);
        return this;
    }
    @Override
    public PizzaBuilder addCheese() {
        pizza.setCheese(true);
        return this;
    }
    @Override
    public PizzaBuilder addPepperoni() {
        pizza.setPepperoni(true);
        return this;
    }
    @Override
    public PizzaBuilder addVegetables() {
        pizza.setVegetables(true);
        return this;
    }
    @Override
    public Pizza build() {
        return pizza;
    }
}
