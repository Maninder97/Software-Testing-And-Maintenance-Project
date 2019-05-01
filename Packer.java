/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.ArrayList;
import java.util.List;
import packer.Address;
import packer.Box;
import packer.Coordinates;
import packer.Customer;
import packer.Depot;
import packer.Manifest;
import packer.Packer;
import packer.Product;
/**
 *
 * @author 90051500
 */
public class Packer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Address depotAddress = new Address("23 Good Luck St", "Blue View", "Sandy Shores", "H337", new Coordinates(138, 995));
        Depot depot = new Depot("Main Depot", depotAddress);
        System.out.println("\nDEPOT:");
        System.out.println(depot);
        
        Address customerAddress1 = new Address("67 Torch Rd", "Treeline", "Mt High", "T799", new Coordinates(1102, 87));
        Address customerAddress2 = new Address("88 Camp Mine St", "Ridgeway", "Lowe Valley", "I998", new Coordinates(100, 34));
        Customer customer = new Customer("Andy Bravo", customerAddress1);
        customer.addAddress(customerAddress2);
        System.out.println("\nCUSTOMER");
        System.out.println(customer);

        Manifest manifest = new Manifest();
        manifest.addProduct(new Product("Hammer", 3, false, false), 1);
        manifest.addProduct(new Product("Nails", 1, false, false), 12);
        manifest.addProduct(new Product("Ladder", 15, false, false), 2);
        manifest.addProduct(new Product("Saw", 5, false, false), 1);
        manifest.addProduct(new Product("Light Bulbs", 1, false, true), 20);
        manifest.addProduct(new Product("Weedkiller", 2, true, false), 1);

        System.out.println("\nMANIFEST (to be packed):");
        System.out.println(manifest);

        System.out.println("\nPACKING:");
        List<Box> done = Packer.packProducts(customer, depot, manifest);
        
        // Results
        for (Box b : done) {
            System.out.println(b);
        }
        
    }
     public static List<Box> packProducts(Customer c, Depot d, Manifest m) {
        List<Box> packedBoxes = new ArrayList<>();
        Box b = null;
        while (!m.isEmpty()) { // repeat until all items are packed
            if (b == null) {
                // b= new box(d,c) changed to b = new Box(c,d)
                b = new Box(c,d);
            }
            Product prodToAdd = m.getHeaviestUnder(b.remainingCapacity());
            if (prodToAdd == null) {
                packedBoxes.add(b);
                b = null;
            }
            else {
                b.addProduct(prodToAdd);
                m.removeProduct(prodToAdd);
            }  
        }
        if (b != null) {
            packedBoxes.add(b);
            packedBoxes.add(b);
        }
        return packedBoxes;
    }
    
}
