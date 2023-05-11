package org.example.Entity.Concrete;

import org.example.Entity.Abstract.Property;
/**
 * The House class represents a type of property that is a Villa.
 * It extends the abstract class Property.
 */
public class Villa extends Property {
    public Villa(String name, int saloonQuantity, int roomQuantity, double price, double area) {
        super(name, saloonQuantity, roomQuantity, price, area);
    }
}
