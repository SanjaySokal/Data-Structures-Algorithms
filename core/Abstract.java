public class Abstract {
    public static void main(String[] args) {
        B b = new B();

        b.id(0);

        System.out.println(b.id);
    }
}

abstract class A {
    abstract void getName();

    int id = 1;

    public void id(int id) {
        this.id = id;
    }

    public void getEmail() {
        System.out.println("sokalsanjay@gmail.com");
    }
}

class B extends A {
    void getName() {
        System.out.println("Sanjay Sokal");
    }
}
