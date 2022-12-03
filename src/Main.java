import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш возраст:");
        int age = sc.nextInt();
        sc.close();
        if (age >=18) {
            System.out.println("Ура, Вам есть 18 лет!");
        }
        if (age<18) {
            System.out.println("Вы еще несовершеннолетний! Подождите немного.");
        }

        System.out.println("Задание 1.2");
        if (age<7) {
            System.out.println("Ребенок еще не ходит в школу.");
        }
        if (age>=7 && age<18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age>=18 && age<24) {
            System.out.println("Человек закончил школу и ходит в университет.");
        }
        if (age>=24) {
            System.out.println("Человек закончил университет и ходит на работк.");
        }
        System.out.println("Задание 1.3");
        int capacity = 102;
        int seatC = 60;
        int standC = capacity - seatC;

        int seatU = 60;
        int standU = 21;
        if (seatU<seatC) {
            System.out.println("Свободные сидячие места " + (seatC - seatU));
        }
        if (standU<standC) {
            System.out.println("Свободные стоячие места " + (standC - standU));
        }
        if (seatU==seatC) {
            System.out.println("Свободные сидячие места нет.");
        }
        if (standU==standC) {
            System.out.println("Свободные стоячие места нет.");
        }
        System.out.println("Задание 2.1");

        if (age >=18) {
            System.out.println("Ура, Вам есть 18 лет!");
        } else {
            System.out.println("Вы еще несовершеннолетний! Подождите немного.");
        }
        System.out.println("Задание 2.2");
        if (age<7) {
            System.out.println("Ребенок еще не ходит в школу.");
        }
        else if (age>=7 && age<18) {
            System.out.println("Ребенок ходит в школу.");
        }
        else if (age>=18 && age<24) {
            System.out.println("Человек закончил школу и ходит в университет.");
        }
        else if (age>=24) {
            System.out.println("Человек закончил университет и ходит на работк.");
        }
        System.out.println("Задание 2.3");
        int capacity1 = 102;
        int seatC1 = 60;
        int standC1 = capacity1 - seatC1;

        int seatU1 = 23;
        int standU1 = 42;
        if (seatU1<seatC1) {
            System.out.println("Свободные сидячие места " + (seatC1 - seatU1));
        } else {
            System.out.println("Свободные сидячие места нет.");
        }
        if (standU1<standC1) {
            System.out.println("Свободные стоячие места " + (standC1 - standU1));
        } else {
            System.out.println("Свободные стоячие места нет.");
        }

        System.out.println("Задание 3.1");

        if (age >=2 && age <= 0) {
            System.out.println("Если возраст ребенка " + age + ", то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в школу");
        }  else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить в университет");
        }  else if (age > 24) {
            System.out.println("Если возраст человека " + age + ", то ему нужно ходить на работу");
        }

        System.out.println("Задание 3.2");

        if (age < 5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Ребенок может кататься в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age >= 14 ) {
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }

        System.out.println("Задание 3.3");
        int one = 1;
        int two = 100;
        int three = 10;
        if (one>two) {
            if (one>=three) {
                System.out.println("Максимальное число: " + one);
            } else {
                System.out.println("Максимальное число: " + three);
            }
        } else if (two>one) {
            if (two>=three) {
                System.out.println("Максимальное число: " + two);
            } else  {
                System.out.println("Максимальное число: " + three );
            }
        } else {
            if (one>three) {
                System.out.println("Максимальное число: " + one);
            } else if (three>one) {
                System.out.println("Максимальное число: " + three );
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}