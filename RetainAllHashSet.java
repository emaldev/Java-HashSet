import java.util.HashSet;
public class RetainAllHashSet {
    public static void main(String[] args){
        HashSet<String> p1 = new HashSet<String>();
        HashSet<String> p2 = new HashSet<String>();

        p1.add("A12");
        p1.add("B2");
        p1.add("B52");
        p1.add("E12");

        p2.add("A12");
        p2.add("P45");
        p2.add("B52");
        p2.add("G65");
        p2.add("E12");

        for(String p : p1){

            System.out.println(p);
        }
        for(String i : p2){
            System.out.println(i);
        }
        p1.retainAll(p2);
        System.out.println(p1);
    }
    
}
