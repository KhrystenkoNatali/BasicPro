package app;

public class PersonArray {
    private int capacity = 4;  // размер внутреннего массива
    private int size = 0;       // сколько в нем реально элементов
    private Person[] array;

    public PersonArray() {
        this.array = new Person[capacity];
    }

    public void add(Person p){
        if(size>= array.length){
            enlarge();
        }
        array[size] = p;
        size++;
    }

    private void enlarge() {
        /*
        1. создать новый массив большего размера
        2. скопировать все элементы из исходного массива в новый
        3. перекинуть array на новый массив
         */
        Person[] newArray = new Person[array.length*2];

        for (int i = 0; i <array.length ; i++) {
            newArray[i] = array[i];
        }

        array = newArray;

    }

    public Person get(int index){
        if (index>=0 && index <size){
            return array[index];
        }
        return null;
    }

    public int size(){
        return size;
    }

    public String toString(){
        String res = "";
        for (int i = 0; i < size; i++) {
            res+= array[i] + System.lineSeparator(); // "\n"
        }
        return res;
    }

    public String toStringReal(){
        String res = "";
        for (int i = 0; i < array.length; i++) {
            res+= array[i] + System.lineSeparator(); // "\n"
        }
        return res;
    }
}
