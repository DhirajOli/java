//parent class
class MyMath {
//used for main class

//static methods to return the value
static int add(int x, int y) {
        return x + y;
}

static int adds(int x, int y,int z) {
        return x + y + z;
}
//method
        void adds() {
        int b = add(8, 5);
        System.out.println("Integer Value: " + b);
        }

        void addss() {
        int b = adds(8, 5,4);
        System.out.println("Integer Value: " + b);
        }

}
//main class and main methods
public class overloading {
public static void main(String[] args) {
    //object
    MyMath a = new MyMath();
    //output
    a.adds();
    a.addss();
}
}
