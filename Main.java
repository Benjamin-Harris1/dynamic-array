import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Person harry = new Person("Harry James Potter");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");
        Person snape = new Person("Severus Snape");
        Person draco = new Person("Draco Malfoy");
        Person voldemort = new Person("Voldemort");
        Person albus = new Person("Albus Dumbledore");
        Person luna = new Person("Luna Lovegood");
        Person hagrid = new Person("Rubeus Hagrid");
        Person sirius = new Person("Sirius Black");
        Person bella = new Person("Bellatrix Lestrange");

        DynamicArray<Person> darr = new DynamicArray<Person>();
        DynamicArray<LocalDate> datoer = new DynamicArray<LocalDate>();
        LocalDate today = LocalDate.now();
        datoer.add(today);
        datoer.get(0);

        darr.add(hermione);
        darr.add(snape);
        darr.add(draco);
        darr.add(voldemort);
        darr.add(albus);
        darr.add(luna);
        darr.add(hagrid);
        darr.add(sirius);
        darr.add(bella);
        System.out.println("Elementer: " + darr.size() + ", Kapacitet: " + darr.getCapacity());

        darr.add(harry);
        darr.add(ron);
        System.out.println("Elementer: " + darr.size() + ", Kapacitet: " + darr.getCapacity());

        darr.remove();
        darr.remove(4);
        System.out.println("Elementer: " + darr.size() + ", Kapacitet: " + darr.getCapacity());
        darr.get(6);

        darr.clear();
        System.out.println("Elementer: " + darr.size() + ", Kapacitet: " + darr.getCapacity());
    }
}