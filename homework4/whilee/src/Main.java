public class Main {
    public static void main(String[] args) {
        int total = 2459000;
        int difSum = 15000;
        int deposit = 0;
        int counter = 0;


        while (deposit <= total) {
            deposit += difSum;
            counter++;
            System.out.println("Месяц " + counter + " сумма накоплений равна " + deposit + " рублей");
        }
    }
        private static void task2 () {
            int i = 1;
            while (i <= 10) {
                System.out.println(1);
                i++;
            }

            System.out.println();

            for (int i = 10; i > 0; i--) {
                ;
            }
            {
                System.out.println(i + " ");
            }
        }
}