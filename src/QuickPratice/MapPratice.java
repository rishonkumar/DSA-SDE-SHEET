package QuickPratice;


import java.util.List;

/*
 Use map() when you want to:

Transform each element in a stream (e.g., convert String to Integer)

Extract a property from an object (e.g., get user.getName() from a List<User>)

Apply a function to each element (e.g., convert to uppercase, square a number)

Change the type of stream (e.g., Stream<String> → Stream<Integer>)

✔ map() transforms each element in a stream into another form.
✔ It does not modify the original stream but creates a new one.
✔ Works well with method references (String::toUpperCase).
✔ Can be chained with other stream operations (filter, flatMap, etc.).
✔ Useful for data extraction & transformation (e.g., List<Person> → List<String> names).
 */
public class MapPratice {


    public static void main(String[] args) {

        List<String>names = List.of("alice", "bob", "caat");

        List<String>upperNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperNames);



        List<String> words = List.of("apple", "banana", "cherry");
        List<Integer>length = words.stream().map(String::length).toList();
        System.out.println(length);

        List<Person>people = List.of(new Person("Rishon", 23), new Person("Rizon", 34));

        List<String>getName = people.stream().map(person -> person.name()).toList();
        people.stream().map(Person::age);

        List<String> sentences = List.of(
                "hello world",
                "java streams",
                "map function"
        );
        List<String>firstNames = sentences.stream().map(s -> s.split(" ")[0]).toList();
        System.out.println(firstNames);

        List<String> wordss = List.of("  hello  ", "  world  ", "  java  ");
        wordss.stream().map(String::trim).map(String::toUpperCase).toList();


    }


}

record Person(String name, int age) {}

