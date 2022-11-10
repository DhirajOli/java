class constructors {
    int a; string b; boolean c;
    a() {
        a= 100; b= "Dhiraj"; c = false;
    }
    void show() {
        System.out.println(a+ " " +b+" "+c);
    }
}

class a {
    public static void main(String[] args) {
        constructors r = new constructors();
        r.show();
    }
}