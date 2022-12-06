

public class JavaException {
    public static void main(String[] args) {

        try{
            int a = 10,b=0;
            int c = a/b;
            System.out.println("result"+c);


        }catch (ArithmeticException e){
            System.out.println("a number can not be devided by zero ");
        }
        try{
            int num = Integer.parseInt("Edureka");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("number format exception ");
        }
        try{
            int a [] = new int[5];
            a[7]=10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
    }

}
