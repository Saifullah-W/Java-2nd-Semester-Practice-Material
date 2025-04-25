package AggregationAndComposition.ScenarioBetweenClasses;

public class main {
    public static void main(String[] args) {
        Book mybook = new Book("OOP");
        mybook.addpage(new page(5,300));

        Shelf S1 = new Shelf(1);
        mybook.Placebook(S1);

        Book yourbook = new Book("LAAG");
        yourbook.addpage(new page(6,400));

//        page p3 = new page(7,500);
//        mybook.addpage(p3);
//        yourbook.addpage(p3);

        mybook.printPage();
        yourbook.printPage();

    }
}
