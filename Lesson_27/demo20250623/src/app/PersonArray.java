package app;

public class PersonArray {
    private Person[] arr;

    public PersonArray(Person[] arr) {
        this.arr = arr;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i]+"\n";
        }
        return result;
    }

    public Person getOldest(){
        Person oldest = arr[0];
        for (int i=0; i<arr.length; i++){
            if(oldest.getAge() < arr[i].getAge() ){
                oldest = arr[i];
            }
        }
        return oldest;

    }

}
