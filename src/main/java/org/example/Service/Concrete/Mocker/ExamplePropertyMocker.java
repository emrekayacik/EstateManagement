package org.example.Service.Concrete.Mocker;

import org.example.Entity.Abstract.Property;
import org.example.Service.Abstract.Factory.PropertyFactory;
import org.example.Service.Abstract.Mocker.PropertyMocker;
import org.example.Service.Concrete.Factory.ExamplePropertyFactory;
import org.example.Service.Enum.PropertyEnum;

import java.util.List;

/**
 * The ExamplePropertyMocker class is an implementation of the PropertyMocker interface.
 * It provides methods to retrieve different types of properties using the ExamplePropertyFactory.
 */
public class ExamplePropertyMocker implements PropertyMocker {
    private final PropertyFactory propertyFactory;

    /**
     * Constructs an ExamplePropertyMocker object and initializes the propertyFactory using the ExamplePropertyFactory singleton instance.
     */
    public ExamplePropertyMocker() {
        this.propertyFactory = ExamplePropertyFactory.getInstance();
    }

    @Override
    public List<Property> getHouses() {
        return propertyFactory.createProperty(PropertyEnum.House);
    }

    @Override
    public List<Property> getVillas() {
        return propertyFactory.createProperty(PropertyEnum.Villa);
    }

    @Override
    public List<Property> getSummerHouses() {
        return propertyFactory.createProperty(PropertyEnum.SummerHouse);
    }

    @Override
    public List<Property> getAllProperty() {
        return propertyFactory.createProperty(PropertyEnum.AllProperty);
    }
}