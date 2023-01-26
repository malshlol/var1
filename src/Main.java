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
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstWeight = 78.2;
        System.out.println(firstWeight);
        var secondWeight = 82.7;
        System.out.println(secondWeight);
        var commonWeight = firstWeight + secondWeight;
        System.out.println("общий вес бойцов " + commonWeight + " кг");
        var differenceWeight = secondWeight - firstWeight;
        System.out.println("разница в весе бойцов " + differenceWeight + " кг");


    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstWeight = 78.2;
        System.out.println(firstWeight);
        var secondWeight = 82.7;
        System.out.println(secondWeight);
        var commonWeight = firstWeight + secondWeight;
        System.out.println("общий вес бойцов " + commonWeight + " кг");
        var differenceWeight = secondWeight - firstWeight;
        System.out.println("разница в весе бойцов " + differenceWeight + " кг");
        var twoDifferenceWeight = (secondWeight - firstWeight) % commonWeight;
        System.out.println("разница в весе бойцов " + twoDifferenceWeight + " кг");
    }
    public static void task8() {
        System.out.println("Задача 8");
        var commonTime = 640;
        System.out.println("часы работы " + commonTime);
        var hour = 8;
        System.out.println(hour);
        var oneTime = commonTime / hour;
        System.out.println("Всего работников в компании — " + oneTime + " человек");
        var howPeople = 94;
        System.out.println(howPeople);
        var commonPeople = oneTime + howPeople;
        System.out.println(commonPeople);
        var newOneTime = commonPeople / hour;
        System.out.println("Если в компании работает 174 человек, то всего " + newOneTime + " часов работы может быть поделено между сотрудниками");
    }
}