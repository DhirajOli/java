class Constructors {
    //Local Variables
    String fname;
    String lname;
   
    public Constructors(String fn, String ln) {
        fname = fn;
        lname = ln;
    }



    public static void main(String[] args) {
        //Inside Constructors(parameters) we have passed string.
        Constructors r = new Constructors("Dhiraj","Oli");
        //Printing Value
        System.out.println(r.fname + " " + r.lname);
    }
}
