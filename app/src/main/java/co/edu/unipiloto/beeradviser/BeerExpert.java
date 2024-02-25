package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "Amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                brands.add("Amber Waves");
                brands.add("Copper Lagoon");
                break;
            case "Light":
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");
                brands.add("Summer Light");
                brands.add("Crisp Pils");
                brands.add("Bright Ale");
                break;
            case "Brown":
                brands.add("Brown Bear Beer");
                brands.add("Brew Brun");
                brands.add("Chestnut Ale");
                brands.add("Autumn Brown");
                break;
            case "Dark":
                brands.add("Dark Dragon Stout");
                brands.add("Midnight Brew");
                brands.add("Black Malt");
                brands.add("Nightfall Stout");
                break;
            default:
                brands.add("Unknown Color");
                break;
        }
        return brands;
    }
}
