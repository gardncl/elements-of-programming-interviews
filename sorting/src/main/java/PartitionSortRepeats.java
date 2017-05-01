import java.util.List;

public class PartitionSortRepeats {

    /*
    14.7

    You are given an array of student objects. Each student
    has an integer-valued age field that is to be treated
    as a key. Rearrange the elements of the array so that
    students of equal age appear together. The order in
    which different ages appear is not important.
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
