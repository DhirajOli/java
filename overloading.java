//parent class
class MyMath {
//used for main class
static int add(int x, int y) {
        return x + y;
}
//method
        void adds() {
        int b = add(8, 5);
        System.out.println("Integer Value: " + b);
        }

}
public class overloading {
public static void main(String[] args) {
    //object
    MyMath a = new MyMath();
    //output
    a.adds();
}
}
