package packer;

/**
 *
 * @author 90051500
 */
public class Depot {
   public String name;
   public Address address;

    public Depot(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return address.toString();
    }
    
    public Coordinates getCoordinates() {
        return this.address.getCoordinates();
    }
    
    public String toString() {
        return this.getName();
    }
    
}
