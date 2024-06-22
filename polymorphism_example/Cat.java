package polymorphism_example;

public class Cat extends Animal{
    private String litterPreference;

    public Cat(String name, int age) {
        super(name, age);
    }

    // Set litter brand preference
    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    // Get litter brand pereference
    public String getLitterPreference() {
        return this.litterPreference;
    }
}

