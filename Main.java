import java.util.HashSet;

public class Main{
    public static void main(String[] args){
        HashSet<String> myhashSet = new HashSet<String>();

        myhashSet.add("Mouse");
        myhashSet.add("Hard Disk");
        myhashSet.add("Loptop");
        myhashSet.add("Mouse");

        
     System.out.println("This is my size of HashSet " + myhashSet.size());
       

        for(String i : myhashSet){
            System.out.println(i);
        }

        myhashSet.clear();
        System.out.println(myhashSet);
    }
}