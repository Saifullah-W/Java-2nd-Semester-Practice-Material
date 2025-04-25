package AggregationAndComposition.ScenarioBetweenClasses;

import java.util.ArrayList;

public class Book {
    String title;
    ArrayList<page> pages = new ArrayList<page>();
    Shelf placedAt;

    Book(String title){
        this.title = title;}

         void addpage(page p){
            pages.add(p);}

        void printPage(){
            for(int i=0; i<pages.size(); i++){
                System.out.println(pages.get(i));
            }
                }

            void Placebook(Shelf S){
                placedAt = S;
            }

            public String toString(){
              return " "+title+" "+placedAt;
            }
        }



