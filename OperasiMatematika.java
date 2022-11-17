public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 1000;
        int b = 900;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

//      AUGMENTED  ASSIGNMENT
        int c = 900;
        int d = 800;

        System.out.println(c+=d);
        System.out.println(c-=d);
        System.out.println(c*=d);
        System.out.println(c/=d);
        System.out.println(c%=d);

//        UNARY OPERATOR
        int e = +100;
        int f = -10;

        e++;
        System.out.println(e);

        e--;
        System.out.println(e);

        System.out.println(!true);


    }
}
