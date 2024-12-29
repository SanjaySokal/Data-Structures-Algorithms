public class StringLearn {
    public static void main(String[] args) {
        String fname = "Sanjay";
        String lname = "Sokal";

        String name = fname.concat(" ").concat(lname);

        System.out.println(name);

        System.out.println(fname.substring(0, 6));

        System.out.println(name.codePointAt(1));
    }
}
