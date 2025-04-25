package AggregationAndComposition.ContinentCountryCity;

public class City {
    String cityName;
    double population;
    Country locateIn;

    City(String cityName,double population){
        this.cityName = cityName;
      this.population = population;

    }

    public String toString(){
        return cityName+" with population"+population;
    }

    public double getPopulation(){
        return population;
    }

    public void setLocateIn(Country locateIn){
        this.locateIn = locateIn;
    }
}
