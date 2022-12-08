public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for(int i = 0; i <= 10; i = i + 1){
            System.out.println(i);
        }
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i = i-1){
            System.out.println(i);
        }
        System.out.println("Задание 3");
        for (int i = 0; i <=17; i= i + 2){
            System.out.println(i);
        }
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i=i-1) {
            System.out.println(i);
        }
        System.out.println("Задание 5");
        for (int i = 1904; i < 2095; i = i + 4){
            System.out.println( i + " год является високосным");
        }
        System.out.println("Задание 6");
        for (int i = 7; i <=98; i= i + 7) {
            System.out.println(i);
        }
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i= i * 2){
            System.out.println(i);
        }
        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i  + ", сумма накопления равна " + total + " рублей");
        }
        System.out.println("Всего накопленно" + total);

        System.out.println("Задание 9");
        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i  + ", сумма накопления равна " + total1 + " рублей");
        }
        System.out.println("Всего накопленно" + total1);

        System.out.println("Задание 10");
        int n1 = 2;
        for (int i = 2; i<=10; i++){
            n1 = n1 + 2;
            System.out.println("2 * " + i + " = " + n1);
        }

    }
}