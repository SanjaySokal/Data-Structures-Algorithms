public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 12, 24, 11, 56, 55, 34, 65, 87, 78, 45 };
        Sorting s = new Sorting();
        arr = s.sort(arr, "desc");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public int[] sort(int[] arr, String direction) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                boolean condition;
                if (direction.equals("asc")) {
                    condition = arr[i] < arr[j];
                } else {
                    condition = arr[i] > arr[j];
                }

                if (condition) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
