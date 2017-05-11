import java.util.List;

public class PartitionSortRepeats {

    /*
    14.7
    */

    public static void groupByAge(List<Person> people) {

    }

    public static class Person {
        public Integer age;
        public String name;

        public Person(Integer age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
