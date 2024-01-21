import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ali Parwiz", " Baktash", "Software Architect", 8160000.00);
        Employee e2 = new Employee("Fatah ", "Rahimi", "Back-end Developer", 2500000.00);
        Student s1 = new Student(" Mustafa", "Kamal Zada ", 4.00);
        Student s2 = new Student("Ahmad Fahim", "Qarizada", 2.5);

        ArrayList<Person> people = new ArrayList<>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);

    }

    public static void printData(Iterable<Person> people)
    {
        for (Person x : people)
        {
            System.out.println(x.toString() + " earns " + x.getPaymentAmount() + " tenge");
        }
    }
}
