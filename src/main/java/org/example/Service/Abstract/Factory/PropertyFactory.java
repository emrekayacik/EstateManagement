package org.example.Service.Abstract.Factory;

import org.example.Entity.Abstract.Property;
import org.example.Service.Enum.PropertyEnum;

import java.util.List;
/**
 * The PropertyFactory interface represents a factory for creating Property objects.
 * It provides a method to create properties based on a given PropertyEnum type.
 */
public interface PropertyFactory {
    /**
     * Creates a list of Property objects based on the specified PropertyEnum type.
     *
     * @param type the PropertyEnum type indicating the kind of properties to create
     * @return a list of Property objects
     */
    List<Property> createProperty(PropertyEnum type);
}
