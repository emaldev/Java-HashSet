import java.util.HashSet;
public class SpillingWorde {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<String>();

        String  sentence = "Java is fun and programming in Java is very fun";
        String[] words = sentence.split(" ");

        names.add("Java");
        names.add("fun");
        names.add("worke");
        names.add("my");
        names.add("book");

        for(String w: words){
            names.add(w);
        }

        for(String i : names){
            System.out.println(i);
        }

        System.out.println(names.size());
    }
    
}
