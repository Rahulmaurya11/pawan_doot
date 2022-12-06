import java.io.PrintWriter;

public class javaException1 {
    public static void main(String[] args) {
try {
    int a =10,b=0;
    int c= a/b;
}catch (ArithmeticException e){
    System.out.println("please make sure denominator should not be zero");
}finally {
    System.out.println(" code keep on running ` ");
}
    }
}

