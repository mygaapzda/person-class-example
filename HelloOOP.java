public class HelloOOP {
    public static void main(String[] args) {
        Person person = new Person("mygmarsuren", 21);
        person.greet();
    }
}

class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("hi " + name + " bn");
    }

    public int getAge() {
        return age;
    }
}
