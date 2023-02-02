import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
        int one = 101;
        int two = 4;
        int three = 101;
        if(one > two){
            if (one > three){
                System.out.println("Максимальное число " + one);
            }else if(three>one){
                System.out.println("Максимальное число " + three);
            } else{
                System.out.println("Числа " + one + " и " + three + " равны");
            }
            if(two > one) {
                if (two > three) {
                    System.out.println("Максимальное число " + two);
                } else if (three > two) {
                    System.out.println("Максимальное число " + three);
                } else {
                    System.out.println("Числа " + two + " и " + three + " равны");
                    }
            } else {
                if (one > three){
                    System.out.println("Максимальное число " + one);
                }else if (three < one){
                    System.out.println("Максимальное число " + three);
                } else{
                    System.out.println("Все 3 числа равны");
                }
            }
        }
    }

    public static void task6() {
        int places = 102;
        int seatCount = 60;
        int otherCount = places - seatCount;

        int seatUsed = 23;
        int otherUsed = 17;
        if (seatUsed < seatCount) {
            System.out.println("Есть еще " + (seatCount - seatUsed) + " сидячих мест");
        }
        if (seatUsed == seatCount) {
            System.out.println("Сидячих мест нет");
        }
        if (otherUsed < otherCount){
        System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест");
    }
        if (otherUsed == otherCount){
            System.out.println("Сидячих мест нет");
        }

}


    public static void task5() {
        int age = 5;
        boolean so = age >= 5 && age <= 14;
        boolean norm = age >= 14;
        if (age >= 5){
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционах");
        }
        if(so){
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционах в сопровождении взрослого. Если взрослого нет, кататься нельзя");
        }
        if(norm){
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционах");
        }

    }

    public static void task4() {
        int age = 9;
        boolean school = age >= 7 && age <= 18;
        boolean uni = age >= 18 && age <= 24;
        boolean job = age >= 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if (school) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (uni){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if (job){
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }

    public static void task3() {
        int speed = 10;
        if (speed >= 60){
            System.out.println("Придется заплатить штраф");
        }else{
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task1() {
        int age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " то он совершеннолетний");
        } else {
            System.out.println("Не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        int t = 10;
        if (t <= 5){
            System.out.println("На улице холодно нужно надеть шапку");
        } else{
            System.out.println("Можно идти без шапки");
        }

    }
}