import java.util.HashSet;

public class HashSetchekerz {
    public static void main(String[] args){
        HashSet<String> set1 = new HashSet<String>();
        HashSet<String> set2 = new HashSet<String>();
         
        set1.add("E1");
        set1.add("B2");
        set1.add("C3");

        set2.add("E5");
        set2.add("G54");
        set2.add("C3");

      set1.retainAll(set2);
       System.out.println("Common elements: " + set1);
    }
    
}
