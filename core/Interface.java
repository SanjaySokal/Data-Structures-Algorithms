public class Interface {
    public static void main(String[] args) {
        B b = new B();

        b.getName();

        System.out.println(b.id);
    }
}

interface A {
    public void getName();

    int id = 1;
}

class B implements A {
    public void getName() {
        System.out.println("Sanjay Sokal");
    }
}
