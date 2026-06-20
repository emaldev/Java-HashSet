import java.util.HashSet;
public class NameHashset {
    public static void main(String[] args){
        HashSet<String> names = new HashSet<String>();

        names.add("Qader");
        names.add("Emal");
        names.add("Milad");
        names.add("Asef");
        names.add("Emal");
        names.add("Enita");
        names.add("Sahar");
        names.add("Sara");
        names.add("Alma");

        for(String i : names){
            System.out.println(i);
        }
        if(names.contains("Emal")){
            System.out.println("Emal is in the list.");
        }
        System.out.println("This is my size HashSet." + names.size());
    }
    
}
