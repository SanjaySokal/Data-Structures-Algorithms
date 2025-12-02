public class SumOfAllNumbers {
    public static void main(String[] args) {
        int num = 123456789;
        System.out.println(sum(num));
    }

    public static int sum(int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }

        return sum;
    }
}
