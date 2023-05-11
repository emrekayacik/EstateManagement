package org.example.Service.Abstract.Mocker;

import org.example.Entity.Abstract.Property;

import java.util.List;

/**
 * The PropertyMocker interface represents a mocker for generating Property objects.
 * It provides methods to retrieve different types of Properties.
 */
public interface PropertyMocker {

    /**
     * Retrieves a list of House.
     *
     * @return a list of House Property
     */
    List<Property> getHouses();

    /**
     * Retrieves a list of Villa.
     *
     * @return a list of Villa Property
     */
    List<Property> getVillas();

    /**
     * Retrieves a list of Summer House.
     *
     * @return a list of Summer House Property
     */
    List<Property> getSummerHouses();

    /**
     * Retrieves a list of all types of Property.
     *
     * @return a list of all types of Property
     */
    List<Property> getAllProperty();
}