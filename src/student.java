class student{
    int roll_no=15;
    String name = "robin";
    boolean married ;
    student(int roll_no,String name,boolean married){

        this.name=name;
        this.roll_no=roll_no;
        this.married=married;

    }


    public static void main(String[] args) {

        student stud1 = new student(10,"martin",true);
        System.out.println("Name : "+stud1.name+" \n roll no :  "+stud1.roll_no+"\n Married: "+stud1.married);

    }

}