public class Lion extends Animal {

    //Default constructor
    Lion(){};

    //Constructors
    Lion(String n, String g) {
        super.setName(n);
        super.setGeneration(g);
    }
    Lion(String n, String g, int a) {
        super.setName(n);
        super.setGeneration(g);
        super.setAge(a);
    }


    public String toString(){
        return "My name is: " + super.getName() + " of generation: " + super.getGeneration() + ". I'm " + super.getAge() + " years old.";
    }
}
