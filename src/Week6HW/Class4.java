package Week6HW;

/**Declare two instance and two static variables.
 *Declare two instance and two static variables.Declare two instance and two static variables.
 * Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 */
public class Class4 {
    int a = 10;
    int b = 20;
    static String name = "Savitri";
    static String company = "Prime";

    public static void main(String[]args){
        Class4 class4 = new Class4();
        class4.myMethod1();
        myMethod2();
    }
    public void myMethod1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(company);
    }
    public static void myMethod2(){
        Class4 obj = new Class4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(name);
        System.out.println(company);


    }

}
