package AggregationAndComposition.ContinentCountryCity;

import java.util.ArrayList;

public class Country {
    String countName;
    double countArea;
    double population;
    ArrayList<City> city = new ArrayList<City>();

    Country(String countName,double countArea){
        this.countName = countName;
        this.countArea = countArea;
        this.population = 0;
    }

    public Country addCity(City cty) {
        city.add(cty);
//        city.(this); // Linking the city back to this country
        updatePopulation();
        return this;
    }

    public void updatePopulation() {
        population = 0;
        for (City city : city) {
            population += city.getPopulation();
        }
    }

    public double getPopulation() {
        return population;
    }



    public String toString(){
        return countName;
    }

//    public void countPopulation(){
//        System.out.println(countName+" contain "+population+" population ");
//    }
}
