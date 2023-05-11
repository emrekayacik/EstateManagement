package org.example.Service.Concrete.Factory;

import org.example.Entity.Abstract.Property;
import org.example.Entity.Concrete.House;
import org.example.Entity.Concrete.SummerHouse;
import org.example.Entity.Concrete.Villa;
import org.example.Service.Abstract.Factory.PropertyFactory;
import org.example.Service.Enum.PropertyEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * The ExamplePropertyFactory class is an implementation of the PropertyFactory interface.
 * It provides methods to create different types of properties based on a given PropertyEnum type.
 */
public class ExamplePropertyFactory implements PropertyFactory {
    private static volatile ExamplePropertyFactory instance;
    private ExamplePropertyFactory() {
    }
    /**
     * Retrieves the singleton instance of ExamplePropertyFactory.
     *
     * @return the singleton instance
     */
    public static ExamplePropertyFactory getInstance() {
        if (instance == null) {
            synchronized (ExamplePropertyFactory.class) {
                if (instance == null) {
                    instance = new ExamplePropertyFactory();
                }
            }
        }
        return instance;
    }
    /**
     * Creates a list of Property objects based on the specified PropertyEnum type.
     *
     * @param type the PropertyEnum type indicating the kind of properties to create
     * @return a list of Property objects based on the specified type
     */
    @Override
    public List<Property> createProperty(PropertyEnum type) {
        List<Property> Houses = new ArrayList<>(
                List.of(
                        new House("The Lake House", 1, 2, 180.000, 120.0),
                        new House("The Tiny Love House", 1, 4, 160.300, 92.0),
                        new House("The Great House", 2, 8, 360.500, 180.0)
                )
        );

        List<Property> Villas = new ArrayList<>(
                List.of(
                        new Villa("The Emre Villa", 1, 4, 390.000, 130.0),
                        new Villa("The Kaya Villa", 1, 3, 260.300, 102.0),
                        new Villa("The Beautiful Villa", 2, 7, 650.500, 178.0)
                )
        );

        List<Property> SummerHouses = new ArrayList<>(
                List.of(
                        new SummerHouse("The Wonderful Summer House", 1, 5, 360.000, 125.0),
                        new SummerHouse("The Tiny Summer House", 1, 2, 260.100, 60.0),
                        new SummerHouse("The Beautiful Villa", 2, 3, 750.000, 133.2)
                )
        );

        List<Property> AllProperty = new ArrayList<>(
                List.of( new House("The Lake House", 1, 2, 180.000, 120.0),
                         new House("The Tiny Love House", 1, 4, 160.300, 92.0),
                         new House("The Great House", 2, 8, 360.500, 180.0),
                         new Villa("The Emre Villa", 1, 4, 390.000, 130.0),
                         new Villa("The Kaya Villa", 1, 3, 260.300, 102.0),
                         new Villa("The Beautiful Villa", 2, 7, 650.500, 178.0),
                         new SummerHouse("The Wonderful Summer House", 1, 5, 360.000, 125.0),
                         new SummerHouse("The Tiny Summer House", 1, 2, 260.100, 60.0),
                         new SummerHouse("The Beautiful Villa", 2, 3, 750.000, 133.2)
                )
        );
        return switch (type) {
            case House -> Houses;
            case Villa -> Villas;
            case SummerHouse -> SummerHouses;
            case AllProperty -> AllProperty;
        };

    }
}
