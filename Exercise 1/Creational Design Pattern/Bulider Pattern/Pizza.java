public class Pizza {
    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;
    private boolean vegetables;

    public String getSize() 
    { 
    return size;
    } 
    public String getCrust() 
    { 
    return crust;
    }
    public boolean hasCheese()
    { 
    return cheese;
    }
    public boolean hasPepperoni()
    {
    return pepperoni;
    }
    public boolean hasVegetables() 
    {
    return vegetables;
    }
    public void setSize(String size) 
   {
    this.size = size;
    }
    public void setCrust(String crust) 
    {
    this.crust = crust;
    }
    public void setCheese(boolean cheese) 
    { 
    this.cheese = cheese;
    }
    public void setPepperoni(boolean pepperoni) 
    { 
    this.pepperoni = pepperoni;
    }
    public void setVegetables(boolean vegetables)
    {
    this.vegetables = vegetables; 
    }
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crust=" + crust + ", cheese=" + cheese +
               ", pepperoni=" + pepperoni + ", vegetables=" + vegetables + "]";
    }
}
