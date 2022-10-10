package Week6HW;
/**Declare two static variables,Declare one static method
 *Call both static variables into the static method inside the print statement
 *  Call the static method into the Main method and Run the programme
 */

public class Class2 {
   static int a = 10;
   static int b = 20;
    public static void main(String[]args){
        myMethod();

    }
    public static void myMethod(){
        System.out.println(a);
        System.out.println(b);
    }
}
