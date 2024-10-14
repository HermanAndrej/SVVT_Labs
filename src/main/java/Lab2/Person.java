package Lab2;

public class Person {
    private int age;
    public Person(int age){
        this.age = age;
        if(age < 0) {
            throw new IllegalArgumentException("A person’s age cannot be less than 0");
        }
    }

    public boolean isAdult(){
        return age >= 17;
    }

    public boolean canGoToSchool() {
        return age >= 6;
    }
}
