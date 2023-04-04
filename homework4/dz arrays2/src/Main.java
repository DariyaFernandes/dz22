import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString((arr)));
        task1(arr);
        task2(arr);
        task3(arr);
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        task4(reverseFullName);


    }
    public static int[] generateRandomArray() {
        java.util.Random random;
        random = new java.util.Random();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(int [] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

    }

    public static void task2(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max){
                max = i;
            }
            
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила" + max + " рублей");


    }
    public static void task3(int[] arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        double avgSum = (double) sum / arr.length;
        System.out.println("Средняя сумма  трат за месяц составила " + avgSum + " рублей");

    }
    public static void task4(char[] reverseFullName) {
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            
        }
        System.out.println();

    }
}
