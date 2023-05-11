package org.example.Service.Abstract;

import org.example.Entity.Abstract.Property;

import java.util.List;

/**
 * The PropertyService interface represents a service for managing Property objects.
 * It provides methods for retrieving information and performing operations on properties.
 */
public interface PropertyService {

    /**
     * Calculates the total price sum of all House.
     *
     * @return the total price sum of House
     */
    double getHousesPriceSum();

    /**
     * Calculates the total price sum of all Villa.
     *
     * @return the total price sum of Villa
     */
    double getVillasPriceSum();

    /**
     * Calculates the total price sum of all SummerHouse.
     *
     * @return the total price sum of SummerHouse
     */
    double getSummerHousesPriceSum();

    /**
     * Calculates the total price sum of all types of properties.
     *
     * @return the total price sum of all types of properties
     */
    double getAllPropertyPriceSum();

    /**
     * Calculates the average area of all House.
     *
     * @return the average area of House
     */
    double getHousesAverageArea();

    /**
     * Calculates the average area of all Villa.
     *
     * @return the average area of Villa
     */
    double getVillasAverageArea();

    /**
     * Calculates the average area of all SummerHouse.
     *
     * @return the average area of SummerHouse
     */
    double getSummerHousesAverageArea();

    /**
     * Calculates the average area of all types of properties.
     *
     * @return the average area of all types of properties
     */
    double getPropertyAverageArea();

    /**
     * Retrieves a list of properties based on the minimum and maximum room and saloon quantities.
     *
     * @param minRoomQuantity    the minimum room quantity
     * @param minSaloonQuantity  the minimum saloon quantity
     * @param maxRoomQuantity    the maximum room quantity
     * @param maxSaloonQuantity  the maximum saloon quantity
     * @return a list of Properties matching the room and saloon quantity criteria
     */
    List<Property> getPropertiesByRoomAndSaloon(int minRoomQuantity, int minSaloonQuantity, int maxRoomQuantity, int maxSaloonQuantity);
}