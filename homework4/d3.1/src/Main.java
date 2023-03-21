public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для ANDROID по ссылке");
        }
        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0){
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(+ year + " является високосным");
            } else {
                System.out.println(+ year + " не является високосным");
            }
            int deliveryDistance = 95;
            int deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;

            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
            int monthNomber = 14;
            switch (monthNomber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Неккоректный месяц: " + monthNomber);

            }
        }


        }
}