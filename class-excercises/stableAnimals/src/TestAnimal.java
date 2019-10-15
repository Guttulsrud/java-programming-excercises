public class TestAnimal {

    public static void main(String[] args) {
        Stable s = new Stable();
        Goat g = new Goat("Cool", "Goath", 22, "sushi", s);
        Lion l = new Lion("Lion", "Supreme", 501);

        System.out.println(g.toString());
        System.out.println(l.toString());
        System.out.println(g.feedAnimal("sushi"));
        System.out.println(g.feedAnimal("not ushis"));

    }
}

