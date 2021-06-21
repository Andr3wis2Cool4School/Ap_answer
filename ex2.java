import java.util.ArrayList;


public class ex2 {
    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("P");
        list.add("Q");
        list.add("R");
        list.set(2, "s");
        list.add(2, "T");
        list.add("u");
        System.out.println(list);
    }
    
}
// P Q T s u