public class Boxes2 extends Boxes {
 int weight;

    Boxes2(int l, int w, int h, int weight) {
        super(l,w,h);
        this.weight=weight;
    }

    public static void main(String[] args) {
box(30,20,50);
        Boxes2 boxes2 = new Boxes2(10,30,40,101);
        System.out.println("Box weight contains value height: "+boxes2.h+" lenght:  "+boxes2.l+" width: "+boxes2.w+" weight: "+boxes2.weight);
    }
}
