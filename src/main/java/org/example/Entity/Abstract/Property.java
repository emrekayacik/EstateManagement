package org.example.Entity.Abstract;

/**
 * The abstract class representing a property.
 */
public abstract class Property {
    private final String name;
    private final int saloonQuantity;
    private final int roomQuantity;
    private final double price;
    private final double area;
    /**
     * Constructs a Property object with the specified details.
     *
     * @param name            the name of the property
     * @param saloonQuantity  the quantity of saloons in the property
     * @param roomQuantity    the quantity of rooms in the property
     * @param price           the price of the property
     * @param area            the area of the property
     */
    public Property(String name, int saloonQuantity, int roomQuantity, double price, double area) {
        this.name = name;
        this.saloonQuantity = saloonQuantity;
        this.roomQuantity = roomQuantity;
        this.price = price;
        this.area = area;
    }

    /**
     * Retrieves the quantity of saloons in the property.
     *
     * @return the quantity of saloons
     */
    public int getSaloonQuantity() {
        return saloonQuantity;
    }

    /**
     * Retrieves the quantity of rooms in the property.
     *
     * @return the quantity of rooms
     */
    public int getRoomQuantity() {
        return roomQuantity;
    }

    /**
     * Retrieves the price of the property.
     *
     * @return the price of the property
     */
    public double getPrice() {
        return price;
    }

    /**
     * Retrieves the area of the property.
     *
     * @return the area of the property
     */
    public double getArea() {
        return area;
    }

    /**
     * Returns a string representation of the Property object.
     *
     * @return a string representation of the object
     */
    @Override
    public String toString() {
        return "Property" + "\n" +
                "Name: " + name + "\n" +
                "Saloon Quantity: " + saloonQuantity + "\n" +
                "Room Quantity: " + roomQuantity + "\n" +
                "Price: " + price + "\n" +
                "Area: " + area + "\n" +
                "------------------------------------";
    }
}
