public abstract class Animal {
    private String name;
    private String generation;
    private int age;
    private Stable stable;

    //Default constructor
    Animal(){}

    Animal(String n, String g, int a){
        setName(n);
        setGeneration(g);
        setAge(a);
    }
    Animal(String n, String g, int a, Stable s) {
        setName(n);
        setGeneration(g);
        setAge(a);
        setStable(s);
    }

    //Setters
    public void setName(String s) {
        this.name = s;
    }
    public void setGeneration(String g) {
        this.generation = g;
    }
    public void setAge(int a) {
        this.age = a;
    }
    public void setStable(Stable s) {
        this.stable = s;
    }

    //Getters
    public String getName() {
        return name;
    }
    public String getGeneration() {
        return generation;
    }
    public int getAge() {
        return age;
    }
    public Stable getStable() {
        return this.stable;
    }

    //Abstract methods
    public abstract String toString();
}
