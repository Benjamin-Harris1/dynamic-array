public class Main {
    public static void main(String[] args){
        Person harry = new Person("Harry James Potter");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");
        Person snape = new Person("Severus Snape");
        Person draco = new Person("Draco Malfoy");
        Person remus = new Person("Remus John Lupin");

        DynamicArray darr = new DynamicArray();

        darr.add(harry);
        darr.add(ron);
        darr.add(hermione);
        darr.add(snape);
        darr.add(draco);
        darr.add(remus);
        darr.get(30);
        darr.add(draco);
        darr.get(31);
        darr.remove(1);
        
        System.out.println("Array indeholder " + darr.size() + " elementer");
        darr.clear();

        int numberOfElementsToAdd = 25;

        for (int i = 0; i < numberOfElementsToAdd; i++) {
            darr.add(new Person("Person " + i));
            System.out.println("Tilføjet: Person " + i);
        }


        System.out.println("Array indeholder " + darr.size() + " elementer");
    }
}