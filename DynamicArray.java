public class DynamicArray{

    private Person[] array;
    private int size;
    private int growSize;

    public DynamicArray(){
        array = new Person[10];
        size = 0;
        growSize = 10;
    }
    
    public void add(Person object){
        if (size == array.length) {
            grow();
        }
        array[size] = object;
        size++;
        //printArray();
    }
    
    public int size(){
        return size;
    }

    public void remove(int index){
        if (index >= 0 && index < size){
            for (int i = index; i < size - 1; i++){
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            printArray();
        } else {
            System.out.println("Ugyldigt indeks: " + index);
        }
    }

    public void clear(){
        size = 0;
        array = new Person[10];
    }

    public Person get(int index){
        if (index >= 0 && index < size) {
            System.out.println("Indeks " + index + ": "+ array[index]);
            return array[index];
        } else {
            System.out.println("Ugyldigt indeks: " + index);
            return null;
        }
    }
    public void set(int index, Person object){
        if (index >= 0 && index < size) {
            array[index] = object;
            System.out.println("Indsat " + object + " på " + index );
        } else {
            System.out.println("Ugyldigt indeks: " + index);
        }
    }

    private void grow(){
        Person[] newArray = new Person[array.length + growSize];

        for (int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void printArray(){
        System.out.println("Array indhold:");
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }
}