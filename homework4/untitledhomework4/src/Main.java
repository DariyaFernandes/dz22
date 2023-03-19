public class Main {
    public static void main(String[] args) {
        int human = 20;
        if (human > 18) {
            System.out.println("Если возраст человека равен " + human + ", то он совершеннолетний");
        }
        int human2 = 16;
        if (human2 < 18) {
            System.out.println("Если возраст человека равен " + human2 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperatyre = 2;
        if (temperatyre < 5) {
            System.out.println("На улице " + temperatyre + " градуса, нужно надеть шапку");
        }
        int temperatyre2 = 8;
        if (temperatyre2 > 5) {
            System.out.println("На улице " + temperatyre2 + " градусов, можно идти без шапки");
        }
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        int speed2 = 50;
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }
        int personality = 3;
        if (personality > 2 && personality < 6) {
            System.out.println("Если возраст человека равен " + personality + ", то ему нужно ходить в детский сад");
        }
        int personality2 = 15;
        if (personality2 > 7 && personality2 < 18) {
            System.out.println("Если возраст человека равен " + personality2 + ", то ему нужно ходить в школу");
        }
        int personality3 = 20;
        if (personality3 > 18 && personality3 < 24) {
            System.out.println("Если возраст человека равен " + personality3 + ", то ему нужно ходить в унверситет");
        }
        int personality4 = 30;
        if (personality4 > 24) {
            System.out.println("Если возраст человека равен " + personality4 + ", то ему нужно ходить на работу");
        }
        int children = 4;
        if (children < 5) {
            System.out.println("Если возраст ребенка равен " + children + ", то ему нельзя кататься на аттракционе");
        }
        int children2 = 7;
        if (children2 > 5 && children2 < 14) {
            System.out.println("Если возраст ребенка равен " + children2 + ", то ему можно кататься на аттракционе в сопровождении");
        }
        int children3 = 16;
        if (children3 > 14) {
            System.out.println("Если возраст ребенка равен " + children3 + ", то ему можно кататься на аттракционе без сопровождения");
        }

    }
}