package AggregationAndComposition.ContinentCountryCity;

public class main1 {
    public static void main(String[] args) {
        Continent asia = new Continent("ASIA", 765788545);
        asia.addCountry(new Country("Pakistan",438));

//        asia.addCountry(new Country("Pakistan",3443).addCity(new City("karachi",89689)));
//        asia.addCountry(new Country("India",57575));
//        asia.addCountry(new Country("Bangladesh",6443));
//        asia.addCountry(new Country("Japan", 665655));
//        asia.addCountry(new Country("China",3456337));
//        System.out.println(asia.contName);
//        System.out.println(asia.country);
//        System.out.println();
//
//
//        Continent america = new Continent("AMERICA", 45768654);
//
//        Continent australia = new Continent("AUSTRALIA ", 678766545);
//        Continent africa = new Continent("Africa",64884809);
//        Continent Europe = new Continent("Europe", 5749098);

        Continent c1 = new Continent("Asia",4355);
        Country p1 = new Country("pakistan",5543);
        p1.addCity(new City("Karachi",5434));
        p1.addCity(new City("Hyderabad",54457));
        c1.addCountry(p1);
        System.out.println(p1);
    }
}
