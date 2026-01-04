package com.dev.generic;

public class Cat {
    private String name;
    Cat cat;

    public Cat getCat(String name) {
        this.name = name;
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    void  printCat(){
        System.out.println(cat);
    }
}
