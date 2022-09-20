package Bread;

public class Pita extends Bread {
    double sugar;
    double oliveOil;
    String breadName;

    public Pita(double flour, double water, double salt, double yeast, double sugar, double oliveOil,
                String breadName) {
        super(flour, water, salt, yeast);
        this.sugar = sugar;
        this.oliveOil = oliveOil;
        this.breadName = breadName;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
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
