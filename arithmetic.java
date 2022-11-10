//Method Overloading
class arithmetic {
    //1st method
    void add() {
        int a=10,b=20,c;
        c=a+b;
        System.out.println(c);
    }
    //2nd method
    void add(int x,int y) {
        int c;
        c= x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        arithmetic a = new arithmetic();
        //1st method/function
        a.add();
        //2nd method/function
        a.add(20,20);
    }
}