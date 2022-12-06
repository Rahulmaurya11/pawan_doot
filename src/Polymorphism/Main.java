package Polymorphism;

public class Main {
    public static void main(String[] args) {
        cirle c= new cirle();
        c.area();
        Triangle t = new Triangle();
        t.area(10 ,20);
        t.area();
        Rectangle r= new Rectangle();
      int j=  r.area(50,30,40);
        System.out.println(j);
        r.main();

    }



    }
