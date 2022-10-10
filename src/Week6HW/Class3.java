package Week6HW;

/**one instance and one static variable.
 *Declare one instance method,Declare one static method
 * Call both instance and static variables into both instance and static methods inside the
 * print statement
 *  Call both instance and static methods into the Main method and run the programme
 */

public class Class3 {
    int a = 10;
    static String name = "Savitri Alagiya";

    public static void main(String[] args) {
        Class3 class3 = new Class3();
        class3.myMethod1();
        myMethod2();

    }

    public void myMethod1() {
        System.out.println(a);
        System.out.println(name);
    }

    public static void myMethod2() {
        Class3 obj = new Class3();
        System.out.println(obj.a);
        System.out.println(name);

    }

}
