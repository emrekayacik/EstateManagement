package org.example;

import org.example.Service.Abstract.PropertyService;

public class Main {
    public static void main(String[] args) {

        PropertyService propertyService = new org.example.Service.Concrete.PropertyService();

        System.out.println("Price Sum of the Houses: " + propertyService.getHousesPriceSum());
        System.out.println("Price Sum of the Villas: " + propertyService.getVillasPriceSum());
        System.out.println("Price Sum of the Summer Houses: " + propertyService.getSummerHousesPriceSum());
        System.out.println("Price Sum of the All Properties: " + propertyService.getAllPropertyPriceSum());

        System.out.println("\n");

        System.out.println("Price Average Area of the Houses: " + propertyService.getHousesAverageArea());
        System.out.println("Price Average Area of the Villas: " + propertyService.getVillasAverageArea());
        System.out.println("Price Average Area of the Summer Houses: " + propertyService.getSummerHousesAverageArea());
        System.out.println("Price Average Area of the All Properties: " + propertyService.getPropertyAverageArea());

        System.out.println("\n");

        var filteredProperties = propertyService.getPropertiesByRoomAndSaloon(3,1,5,2);
        System.out.println("Filter by 1-2 Saloons and 3-5 Rooms: ");
        for (var property : filteredProperties){
            System.out.println(property.toString());
        };
    }
}