public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задание №1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int j : arr) {
            sum += j;
        }
        System.out.println();
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задание №2");
        int[] arr = generateRandomArray();
        int minSpendings = arr[0];
        int maxSpendings = 0;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int j : arr) {
            if (minSpendings > j) {
                minSpendings = j;
            }
            if (maxSpendings < j) {
                maxSpendings = j;
            }
        }
        System.out.println();
        System.out.println("Максимальная сумма трат за день составила " + maxSpendings + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSpendings + " рублей");
    }

    public static void task3() {
        System.out.println("Задание №3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int j : arr) {
            sum += j;
        }
        double averageSpedings = sum / arr.length;
        System.out.println();
        System.out.println("Средняя сумма трат за месяц составила " + averageSpedings + " рублей");
    }


    public static void task4() {
        System.out.println("Задание №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}