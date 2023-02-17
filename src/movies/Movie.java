package movies;

import util.Input;

import java.util.Scanner;

public class Movie {

    //var
    private String name;
    private String category;

    //setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setCategory(String newCategory){
        this.category = newCategory;
    }
    //getters

    public String getName(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }

    //constructor
    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }



}

