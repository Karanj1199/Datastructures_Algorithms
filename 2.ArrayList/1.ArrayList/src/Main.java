import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> stringList = new ArrayList<String>();

        //Insertion
        stringList.add("A");
        stringList.add("B");
        stringList.add(2,"C");
        System.out.println(stringList);

        //Access
        System.out.println(stringList.get(2));

        //Traversal
        System.out.println("For Loop");
        for(int i=0;i<stringList.size();i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("For-Each Loop");
        for(String letter: stringList) {
            System.out.println(letter);
        }

        System.out.println("Iterator");
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Searching
        for(String letter:stringList) {
            if(letter.equals("F")){
                System.out.println("The element is found");
                break;
            }
        }

        int index = stringList.indexOf("C");
        System.out.println("The element is found a t index " + index);

        //Remove
        stringList.remove("1");
        stringList.remove("C");
        System.out.println(stringList);

    }
}