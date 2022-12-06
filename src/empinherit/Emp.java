package empinherit;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {

        this.id = id;
        this.name = name;
        this.address = address;

    }

    void display() {
        System.out.println("emp id : "+id + "\n Emp Name : " + name);
        System.out.println("City: "+address.city + " Address: " + address.state + "Country: " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("thane", "maharashtra", "india");
        Address address2 = new Address("prayagraj", "uttar pradesh", "india");
        Emp e1 = new Emp(101, " nitin ", address1);
        Emp e2 = new Emp(102," rohit ",address2);
        e1.display();
        e2.display();

    }

}
