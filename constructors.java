class Constructors {
    String fname;
    String lname;
   
    public Constructors(String fn, String ln) {
        fname = fn;
        lname = ln;
    }



    public static void main(String[] args) {
        Constructors r = new Constructors("Dhiraj","Oli");
        System.out.println(r.fname + " " + r.lname);
    }
}
