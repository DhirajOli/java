class MyMath {

static int add(int x, int y) {
        return x + y;
}
        void adds() {
        int b = add(8, 5);
        System.out.println("Integer Value: " + b);
        }

}
public class overloading {
public static void main(String[] args) {
    MyMath a = new MyMath();
    a.adds();
}
}
