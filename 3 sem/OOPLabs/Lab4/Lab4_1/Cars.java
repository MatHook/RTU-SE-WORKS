package OOPLabs.Lab4.Lab4_1;

public class Cars implements Nameable {
    private String name;

    String getName() {
        return name;
    }

    Cars(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Name is: " + name);
    }
}
