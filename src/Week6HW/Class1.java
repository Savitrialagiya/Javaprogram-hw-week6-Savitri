package Week6HW;
/**instance variables,one instance method,
 * Call both instance variables into the instance method inside the print statement
 * Call the above instance method into the Main method and Run the programme.
 */
public class Class1 {
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.method1();

    }
    //instance method
    public void method1(){
        System.out.println(a);
        System.out.println(b);
    }
}
