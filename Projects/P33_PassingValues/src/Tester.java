
/*
 #1: 97.4 b/c passed by value
 #2: 10.001 b/c passed by reference
 #3: 100 b/c passed by reference
 #4: "hello" b/c passed by value
*/


public class Tester {

        public static void main(String[] args) {
            MyClass theObj = new MyClass();
            theObj.gravy = 107.43;

            String s = "hello";

            int[] xray = {1,2,3,4,5};
            double floozy = 97.4;
            myMethod(floozy, theObj, xray, s);

            System.out.println(floozy); //question 1
            System.out.println(theObj.gravy); //question 2
            System.out.println(xray[2]); //question 3
            System.out.println(s); // question 4
        }

        public static void myMethod(double floozy, MyClass anObj, int[] a, String s) {
            floozy = 13.1;
            anObj.gravy =10.001;
            a[2] = 100;
            s = "goodbye";
        }
}
