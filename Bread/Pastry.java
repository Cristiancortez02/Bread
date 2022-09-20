package Bread;

public class Pastry extends Bread{
    private int temp1;
    private int temp2;
    private int minutes;

    public Pastry(double flour, double water, double salt, double yeast, int temp1, int temp2, int minutes) {
        super(flour, water, salt, yeast);
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.minutes = minutes;
    }

    public void mix(){
        System.out.println("1. Mix Flour, water, salt, Baking powder, yeast");
    }

    public void make(){
        System.out.println("2. Make the dough");
    }

    public void bulk(){
        System.out.println("3. Bulk Rise");
    }

    public void stretch(){
        System.out.println("4. Stretch and fold dough");
    }

    public void cut(){
        System.out.println("5. Cut and shape the dough");
    }

    public void rise(){
        System.out.println("6. Second Rise");
    }

    public void preheat(){
        System.out.println("7. Preheat the oven to " + temp2 + " F towards the tail end of the second rise");
    }

    public void spray(){
        System.out.println("8. Spray the loaf with luke warm water");
    }

    public void oven(){
        System.out.println("9. Bake the bread at " + temp1 + "F for "+ minutes + "minutes, until deep golden brown");
    }

    public void remove(){
        System.out.println("10. Remove the bread from the oven");
    }

    public void cool(){
        System.out.println("11. Let bread cool until good to eat");
    }

    public int getTemp1() {
        return temp1;
    }

    public void setTemp1(int temp1) {
        this.temp1 = temp1;
    }

    public int getTemp2() {
        return temp2;
    }

    public void setTemp2(int temp2) {
        this.temp2 = temp2;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String toString(){
        return "A Recipe for " + Bread.class + "are: ";
    }

}
