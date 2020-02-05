package test.lambas;

import java.util.*;

public class Java8 {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Simran", "Singh", 29));
        personList.add(new Person("Sahib", "Singh", 19));
        personList.add(new Person("Lalit", "Mago", 32));
//        personList = Arrays.asList(
//                new Person("Simran", "Singh", 29),
//                new Person("Simran", "Singh", 29),
//                new Person("Simran", "Singh", 29)
//        );
//
        //1st step
        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //2nd step
        Java8.printCondition(personList, p -> true);

        //3rd step
        printCondition(personList, c -> c.getFirstName().startsWith("L"));
        printWithoutCondition(personList);
    }


    public static void printCondition(List<Person> p, Condition condition) {

        for (Person person : p) {
            if (condition.test(person)) {
                System.out.println(person);
            }
        }

    }

    public static void printWithoutCondition(List<Person> p) {
        p.stream()
                .filter(c -> c.getFirstName().startsWith("L"))
                .forEach(System.out::println);
    }
}

