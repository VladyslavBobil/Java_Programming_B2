package day06_a_arithmetic_operators;

public class House {
    public static void main (String [] args){
        String houseType = "Single House";
        int     numberOfBedrooms = 5,
                numberOfBathrooms = 3,
                numberOfKitchen = 2;
        boolean hasBasement = true,
                hasAttic = false,
                isOnSale = false;
        double price = 9_999_999.99;
        String address = "123 Central Park, NY";
        int zipcode = 12345;
        boolean parkNearBy = true;
        double rating = 4.9;
        String result = "The " + houseType + " on " + address + ", " + zipcode + " coast $" + price + " \nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, has " +
                numberOfBathrooms + " bathroom, and has " + numberOfKitchen + " kitchen. \nIt also includes a basement: " + hasBasement + ", has an attic: " + hasAttic + " and has a park: " +
                parkNearBy + " is on sale: " + isOnSale + "\nThe school at this ara has a rating: " + rating;
        System.out.println(result);


    }

}
/*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

