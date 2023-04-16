package class28;

import java.util.ArrayList;

public class ColectionsDemo1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Inna");
        names.add("Mila");
        names.add("Sofia");
        names.add("Rula");
        names.add("Sam");
        if (names.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println(names);
        }
        System.out.println(names.contains("Wida"));
        System.out.println(names.size());
        /*for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Rula")){
                names.remove("Rula");
            }
        }*/

    }
}
