package packer;

/**
 *
 * @author 90051500
 */
public class Product {

    public String name;
    public String prod;
    public int weight;
    public boolean hazardous;
    public boolean fragile;
    public int quantity;
    
    // creating variable for heavy items
    public boolean heavy;

    public Product(String name, int weight, boolean hazardous, boolean fragile, boolean heavy) {
        this.name = name;
        this.weight = weight;
        this.hazardous = hazardous;
        this.fragile = fragile;
        this.heavy = heavy;
    }

    public Product(String prod, int quantity, boolean hazardous, boolean fragile) {
        this.prod = prod;
        this.quantity = quantity;
        this.hazardous = hazardous;
        this.fragile = fragile;
        
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the hazardous
     */
    // "return false" changed to "return hazardous".
    public boolean isHazardous() {
        return hazardous;
    }

    /**
     * @return the fragile
     */
    public boolean isFragile() {
        return fragile;
    }

    public String toString() {
        return this.getName();
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product)o;
        return p.getName().equals(this.getName());
    }

    /*
    //Refactoring 4
    // returns heavy label if the box contains heavy items
    */
    public boolean isHeavy() {
        return heavy;
    }
    
}
