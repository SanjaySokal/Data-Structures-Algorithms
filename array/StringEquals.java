public class StringEquals {
    public static void main(String[] args) {
        String s1 = new String("Sanjay");
        String s2 = new String("Sanjay");
        // s1 = s1 + " Sokal";
        // s1 = s1.concat(" Sokal ").repeat(2).trim();

        // System.out.println(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
