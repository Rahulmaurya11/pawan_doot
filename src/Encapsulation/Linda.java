package Encapsulation;
// Encapsulation binding varaible and method in one unit, is called encapsualtion, i.e Hideing data
// declaring variable as private only we can access variable through method , i.e encapsulation
public class Linda {
    private int kg;
    private String Material;
    private String address;

    public void set(int kg ,String Material ,String address){
        this.kg=kg;
        this.Material=Material;
        this.address=address;
    }
    public int  getkg(int kg ){
        return kg;
    }
    public String getMaterial(String material){
        return material;
    }
    public String getAddress(String address){
        return address;
    }

    public static void main(String[] args) {
        Linda p = new Linda();
        p.set(10,"panner","prayagraj , nawabgang");
        System.out.println( p.getAddress(p.address));
        System.out.println(p.getkg(p.kg));
        System.out.println(p.getMaterial(p.Material));
    }

}

