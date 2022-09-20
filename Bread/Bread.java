package Bread;

/**
 * Class:Bread
 * Date: 09/20/2022
 * Author: Cristian Cortez
 * Course: ITEC 2150 Section 03
 * Instructions:Create Bread superclass and 5 subclass of bread class that shows ingredients
 * and recipe of subclasses.
 */
public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double yeast;


    public Bread(double flour, double water, double salt, double yeast) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.yeast = yeast;
    }

    public String getIngredients(){
        System.out.println(flour + " cups of flour");
        System.out.println(water + " cups of water");
        System.out.println(salt + " tsps of salt");
        System.out.println(yeast + " tsps of yeast");
        return null;
    }

    public void bake(){
        System.out.println("Baked");
    }


    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String toString(){
        return "Ingredients are: " + getIngredients();
    }
}