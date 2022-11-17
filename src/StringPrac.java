public class StringPrac {
    public static void main(String[] args) {
        // String is an object .
        // An array of character works same as java string .
        //string class methods are compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(),
        // substring() etc.


        String s = "java_1-pro";
        int n=7;//number of count loop will iterate
        int n1 = 0;
        int n2=1;
        System.out.print("fibbonaciie series "+n1+" ");
        System.out.print(n2);
        for(int i=2;i<n;i++){
            int n3= n2+n1;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);

        }

    }
    }