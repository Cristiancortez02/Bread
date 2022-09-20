package Bread;

public class BreadTester {
    public static void main(String[] args) {
        Pita p1 = new Pita(2.5,1.0,1.5,1.5,1.0,0.5,"Pita");
        System.out.println(p1);
        p1.bake();
        Ciabatta c1 = new Ciabatta(1.0,0.3,1.5,0.125,1,"Ciabatta");
        System.out.println(c1);
        c1.bake();
        Baguette b1 = new Baguette(1,0.5,2,0.0625,0.5,"Baguette");
        System.out.println(b1);
        b1.bake();
        Sourdough s1 = new Sourdough(2.5,0.5,1.5,1.5,1.5,"Sourdough");
        System.out.println(s1);
        s1.bake();
        System.out.println(Pastry.class);
    }
}
