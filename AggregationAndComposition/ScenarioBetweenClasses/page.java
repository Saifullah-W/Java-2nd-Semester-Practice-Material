package AggregationAndComposition.ScenarioBetweenClasses;

public class page {
   public int pageno;
   public  int noOfwords;

   page(int pageno, int noOfwords){
       this.pageno = pageno;
       this.noOfwords = noOfwords;
   }

   public String toString(){
       return " "+pageno+" \t "+noOfwords;
    }
}
