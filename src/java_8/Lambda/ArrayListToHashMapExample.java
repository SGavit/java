package java_8.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person{
    int id;
    String name;

    //Constructor
    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //Getter
    public int getId()
    {
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return id +" = "+ name;
    }
}
public class ArrayListToHashMapExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice"));
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Charlie"));

        Map<Integer,String> personMap = people.stream().collect(Collectors.toMap(Person::getId, Person::getName,(existing, replacement)->existing));

        personMap.forEach((id,name)->System.out.println(id + " => "+ name));
    }
}
