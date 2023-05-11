package org.example.Service.Concrete;

import org.example.Entity.Abstract.Property;
import org.example.Service.Abstract.Mocker.PropertyMocker;
import org.example.Service.Concrete.Mocker.ExamplePropertyMocker;

import java.util.List;

/**
 * The PropertyService class is an implementation of the PropertyService interface.
 * It provides methods to calculate various statistics and retrieve properties based on specific criteria.
 */
public class PropertyService implements org.example.Service.Abstract.PropertyService {
    PropertyMocker propertyMocker;

    /**
     * Constructs a PropertyService object and initializes the propertyMocker using the ExamplePropertyMocker implementation.
     */
    public PropertyService() {
        this.propertyMocker = new ExamplePropertyMocker();
    }

    @Override
    public double getHousesPriceSum() {
        return getPriceSum(propertyMocker.getHouses());
    }

    @Override
    public double getVillasPriceSum() {
        return getPriceSum(propertyMocker.getVillas());
    }

    @Override
    public double getSummerHousesPriceSum() {
        return getPriceSum(propertyMocker.getSummerHouses());
    }

    @Override
    public double getAllPropertyPriceSum() {
        return getPriceSum(propertyMocker.getAllProperty());
    }

    @Override
    public double getHousesAverageArea() {
        return getAverageArea(propertyMocker.getHouses());
    }

    @Override
    public double getVillasAverageArea() {
        return getAverageArea(propertyMocker.getVillas());
    }

    @Override
    public double getSummerHousesAverageArea() {
        return getAverageArea(propertyMocker.getSummerHouses());
    }

    @Override
    public double getPropertyAverageArea() {
        return getAverageArea(propertyMocker.getAllProperty());
    }

    @Override
    public List<Property> getPropertiesByRoomAndSaloon(int minRoomQuantity, int minSaloonQuantity, int maxRoomQuantity, int maxSaloonQuantity) {
        return propertyMocker.getAllProperty().stream()
                .filter(property ->
                        property.getRoomQuantity() <= maxRoomQuantity &&
                                property.getRoomQuantity() >= minRoomQuantity &&
                                property.getSaloonQuantity() <= maxSaloonQuantity &&
                                property.getSaloonQuantity() >= minSaloonQuantity).toList();
    }

    private double getPriceSum(List<Property> properties) {
        return properties.stream().mapToDouble(Property::getPrice).sum();
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    private double getAverageArea(List<Property> properties) {
        return properties.stream().mapToDouble(Property::getArea).average().getAsDouble();
    }
}
