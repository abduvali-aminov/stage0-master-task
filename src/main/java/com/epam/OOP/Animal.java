package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s = "This animal is mostly " + this.color +
                ". It has "+ this.numberOfPaws;
        if(this.numberOfPaws > 1){
            s = s + " paws and ";
        }else{
            s = s + " paw and ";
        }

        if(this.hasFur){
            s = s + "a fur.";
        }else{
            s = s + "no fur.";
        }
        return s;
    }

}
