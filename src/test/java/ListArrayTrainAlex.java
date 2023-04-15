import java.util.ArrayList;
import java.util.List;

public class ListArrayTrainAlex {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Toyota");
        list.add("Lexus");
        list.add("Mustang");
        list.add("Ford");
        System.out.println(list);

        List <Integer> numbers= new ArrayList<>();
        numbers.add(14);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
        Employee<String> emp=new Employee<>("Artur",1000);
        Employee<String> emp1=new Employee<>("v",2000);
        List<Employee<String>> employees =new ArrayList<>();
        employees.add(emp);
        employees.add(emp1);


    }
}
