package AggregationAndComposition.ContinentCountryCity;

import java.util.ArrayList;

public class Continent {
    String contName;
    double contArea;
    double population;
    ArrayList<Country> country = new ArrayList<Country>();

    Continent(String contName, double contArea){
        this.contName = contName;
        this.contArea = contArea;
        this.population = 0;
    }

    public Continent addCountry(Country cotry) {
        country.add(cotry);
        updatePopulation();
        return this;
    }

    public double getPopulation() {
        return population;
    }

    public void updatePopulation() {
        population = 0;
        for (Country country : country) {
            population += country.getPopulation();
        }
    }


    public String toString() {
        return contName + " with total population: " + population;
    }



//    public double getPopulation(){
//        country.getp
//    }

//    public Continent addCountry(Country C){
//        country.add(C);
//        return this;
////        population += country.getFirst().population;
//    }
}
