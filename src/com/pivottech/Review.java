package com.pivottech;

public class Review {
    String body;
    String author;
    int stars;

    public Review(String newbody, String newAuthor, int newStars)
    {
        body = newbody;
        author = newAuthor;
        stars = newStars;
    }
}
