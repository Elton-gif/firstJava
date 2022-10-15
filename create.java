public class create {

    public static void main(String[] args) {
        String fullname ,firstname,lastname,space;
        fullname = new String("Decage Latte");
        space = new String("");
        firstname = fullname.substring(0, fullname.indexOf(space));
        lastname = fullname.substring(fullname.indexOf(space)+1,  fullname.length());
        System.out.println("Full name " + fullname);
        System.out.println("First " + firstname);
        System.out.println("Last " + lastname);
       
        

      
        
    }
    
}