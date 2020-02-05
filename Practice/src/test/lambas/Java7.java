package test.lambas;

import java.util.*;

public class Java7 {
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
        Collections.sort(personList,
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getLastName().compareTo(o2.getLastName());
                    }
                });

        Java7.printAll(personList);

        printCondition(personList, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("S");
            }
        });


    }

    public static void printAll(List<Person> people) {
        for (Person people1 : people) {
            System.out.println(" " + people1);
        }
    }

    public static void printCondition(List<Person> p, Condition condition) {
    for (Person person : p)
    {
        if(condition.test(person))
        {
            System.out.println(person);
        }
    }

    }
}

interface Condition {
    boolean test(Person p);
}