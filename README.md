# EstateManagement

A Basic Java program that implements the following requested methods using the factory method and singleton pattern, while adhering to Object-Oriented Programming (OOP) and Clean Code principles.

1. A method that returns the total prices of houses.
2. A method that returns the total prices of villas.
3. A method that returns the total prices of summer houses.
4. A method that returns the total price of houses of all types.

5. A method that returns the average square meter of houses.
6. A method that returns the average square meter of villas.
7. A method that returns the average square meter of summer houses.
8. A method that returns the average square meter of houses of all types.
 
9. A method that filters and returns all houses of all types based on the number of rooms and living rooms.




# Program output:

```
Price Sum of the Houses: 700.8
Price Sum of the Villas: 1300.8
Price Sum of the Summer Houses: 1370.1
Price Sum of the All Properties: 3371.7


Price Average Area of the Houses: 130.66666666666666
Price Average Area of the Villas: 136.66666666666666
Price Average Area of the Summer Houses: 106.06666666666666
Price Average Area of the All Properties: 124.46666666666667


Filter by 1-2 Saloons and 3-5 Rooms: 
Property
Name: The Tiny Love House
Saloon Quantity: 1
Room Quantity: 4
Price: 160.3
Area: 92.0
------------------------------------
Property
Name: The Emre Villa
Saloon Quantity: 1
Room Quantity: 4
Price: 390.0
Area: 130.0
------------------------------------
Property
Name: The Kaya Villa
Saloon Quantity: 1
Room Quantity: 3
Price: 260.3
Area: 102.0
------------------------------------
Property
Name: The Wonderful Summer House
Saloon Quantity: 1
Room Quantity: 5
Price: 360.0
Area: 125.0
------------------------------------
Property
Name: The Beautiful Villa
Saloon Quantity: 2
Room Quantity: 3
Price: 750.0
Area: 133.2
------------------------------------

Process finished with exit code 0\
```

### Example mock data used:

```
                         //(name,room,saloon,price,area) respectively

                         new House("The Lake House", 1, 2, 180.000, 120.0),
                         new House("The Tiny Love House", 1, 4, 160.300, 92.0),
                         new House("The Great House", 2, 8, 360.500, 180.0),

                         new Villa("The Emre Villa", 1, 4, 390.000, 130.0),
                         new Villa("The Kaya Villa", 1, 3, 260.300, 102.0),
                         new Villa("The Beautiful Villa", 2, 7, 650.500, 178.0),

                         new SummerHouse("The Wonderful Summer House", 1, 5, 360.000, 125.0),
                         new SummerHouse("The Tiny Summer House", 1, 2, 260.100, 60.0),
                         new SummerHouse("The Beautiful Villa", 2, 3, 750.000, 133.2)
```
