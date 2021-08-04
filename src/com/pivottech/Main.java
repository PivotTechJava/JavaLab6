package com.pivottech;

public class Main {

    public static void main(String[] args) {
        Restaurant test = new Restaurant("Dek", 3, "$13");
        System.out.println("name" + " " + test.name + " " + "price" + test.priceCategory);

        Review review = new Review("test", "April",4 );
        System.out.println("Body" + "=" + review.body + " " + "Author" + "=" + review.author + "stars" + "=" + review.stars);

    }

}
