import java.util.*;

public class AddTwoNumbersArray {
    public static void main(String[] args) {
        int[] l1 = { 2, 4, 3 };
        int[] l2 = { 5, 6, 4 };

        int[] l1Rev = new int[l1.length];
        int[] l2Rev = new int[l2.length];

        for (int i = 0; i < l1.length; i++) {
            l1Rev[i] = l1[l1.length - 1 - i];
        }

        for (int i = 0; i < l2.length; i++) {
            l2Rev[i] = l2[l2.length - 1 - i];
        }

        int i = 0;
        int l1Num = 0;
        int l2Num = 0;

        while (i < l1Rev.length) {
            l1Num = (l1Num * 10) + l1Rev[i];
            i++;
        }

        i = 0;

        while (i < l2Rev.length) {
            l2Num = (l2Num * 10) + l2Rev[i];
            i++;
        }

        i = 0;

        int sum = l1Num + l2Num;
        List<Integer> list = new ArrayList<Integer>();

        while (i < l2Rev.length) {
            list.add((l2Num % 10) - (l2Num % 10));
            System.out.println(list);
            i++;
        }
    }
}
