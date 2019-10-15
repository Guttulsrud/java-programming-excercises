public class Stable {

    private String address;
    private String box;
    private String farm;

    //Default constructor
    Stable(){}

    //Constructors
    Stable(String a, String b, String f){
        setLoc(a);
        setBox(b);
        setFarm(b);
    }

    //Setters
    public void setLoc(String l) {
        this.address = l;
    }
    public void setBox(String b) {
        this.box = b;
    }
    public void setFarm(String f) {
        this.farm = f;
    }

    //Getters
    public String getLoc(){
        return address;
    }
    public String getBox(){
        return box;
    }
    public String getFarm(){
        return farm;
    }

    public String toString() {
        return "Address: + " + address + ".\n Box: " + box + ".\n Farm: " + farm + ".";
    }
}
