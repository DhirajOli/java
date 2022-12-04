//parent class
class shapes {
void shape() {
    System.out.println("This is the Shape");
}
}
//1st inheritance
class rectangle extends shapes {
    //created a method
void methodz() {
        System.out.println("This is rectangle");
    }
}
//2nd inheritated class
class circle extends shapes {
    //created a method
    void method() {
        System.out.println("This is cirlcle");
    }
}

//Main class and Main method
public class shape {
    public static void main(String[] args) {
        //created an object
        circle a = new circle();
        rectangle b = new rectangle();
        shapes c = new shapes();
        //called method with object_name.methodname
        a.method();
        b.methodz();
        c.shape();
    }
}