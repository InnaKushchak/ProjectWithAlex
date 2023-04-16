package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Inna");
        names.add("Mila");
        names.add("Sofia");
        names.add("Rula");
        names.add("Sam");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

