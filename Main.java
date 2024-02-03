public class Main {
    public static void main(String[] args){
        Person harry = new Person("Harry James Potter");
        Person ron = new Person("Ron Weasley");
        Person hermione = new Person("Hermione Granger");

        DynamicArray darr = new DynamicArray();

        darr.add(harry);
        darr.add(ron);
        darr.add(hermione);
        darr.get(0);
        darr.remove(1);
        darr.get(0);
        
        System.out.println("Array indeholder " + darr.size() + " elementer");
    }
}