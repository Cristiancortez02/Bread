package Bread;

public class Ciabatta extends Bread{
    double oliveOil;
    String breadName;

    public Ciabatta(double flour, double water, double salt, double yeast, double oliveOil, String breadName) {
        super(flour, water, salt, yeast);
        this.oliveOil = oliveOil;
        this.breadName = breadName;
    }

    public double getOliveOil() {
        return oliveOil;
    }

    public void setOliveOil(double oliveOil) {
        this.oliveOil = oliveOil;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    @Override
    public String toString() {
        return "Ingredients of " + breadName + " are: " + "\n" + getIngredients();
    }
}
