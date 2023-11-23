package k213883_lab5;
import java.util.*;

public class K213883_Q5 
{
    public static void main(String[] args) 
    {
        HashSet<Object> hashset = new HashSet<>();
        hashset.add("Vanila");
        hashset.add("Chocolate");
        hashset.add(50);
        hashset.add(70);
        hashset.add(20);

        Iterator<Object> itr = hashset.iterator();
        System.out.println("HashSet Elements:");
        
        while (itr.hasNext()) 
        {
            System.out.println(itr.next());
        }

        ArrayList<Object> list = new ArrayList<>();
        list.add("Mango");
        list.add("Orange");
        list.add(200);
        list.add(175);
        list.add(520);

        Iterator<Object> itList = list.iterator();
        System.out.println("\nArrayList Elements:");
        
        while (itList.hasNext()) 
        {
            System.out.println(itList.next());
        }
    }
}
