public class Goat extends Animal implements Feedable {

    //Instance variables
    private String favFood;

    //Default Constructor
    Goat(){}

    //Constructors
    Goat(String n, String g){
        super.setName(n);
        super.setGeneration(g);
    }
    Goat(String n, String g, int a, String f, Stable s) {
        setName(n);
        setGeneration(g);
        setAge(a);
        setFavFood(f);
        setStable(s);
    }

    //Setter
    public void setFavFood(String f) {
        this.favFood = f;
    }

    //Getter
    public String getFavFood(){
        return favFood;
    }

    //Interface methods
    public String feedAnimal (String f) {
        if (f.equals(this.favFood)) {
            return "I like this food";
        } else {
            return "I hate this food";
        }
    }

    //Inherited abstract methods
    public String toString(){
        return "My name is: " + super.getName() + " of generation: " + super.getGeneration() + ". I'm " + super.getAge() + " years old. I like it if you" +
                " give me " + favFood;
    }

}
