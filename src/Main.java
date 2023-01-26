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
    public static void task1 () {

        System.out.println("Задача 1");
        byte perem = 125 ;
        short perem1 = 1027;
        int perem2 = 474164127;
        long pere2 = 423423L;
        float perem3 = 3.2F;
        double perem4 = 3.2312;

        System.out.println("Значение переменой perem c типом bite " + perem);
        System.out.println("Значение переменой perem1 c типом short " + perem1);
        System.out.println("Значение переменой perem2 c типом int " + perem2);
        System.out.println("Значение переменой pere2 c типом long " + pere2);
        System.out.println("Значение переменой perem3 c типом float " + perem3);
        System.out.println("Значение переменой perem4 c типом double " + perem4);

    }

    public static void task2 () {

        System.out.println("Задача 2");
float drob = 27.2f;
long dlin = 987_678_965_549L;
short number = 569;
double dubleNum = 2.786;
short number1 = -159;
int number2 = 27897;
byte number3 = 67;

    }

    public static void task3 () {

        System.out.println("Задача 3");
byte class1 = 23;
byte class2 = 27;
byte class3 = 30;
int papers = 480;
        int paper = papers / (class1 + class2 + class3) ;
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги ");
    }
    public static void task4 () {

        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int botlesMinets = bottles / minutes ;
        int machine1 = 20 * botlesMinets;
        int machine2 = machine1 * 3 * 24;
        int machine3 = machine2 * 3 ;
        int machine4 = machine3 * 10;

        System.out.println("За 20 минут машина произвела " + machine1 + " штук бутылок");
        System.out.println("За день машина произвела " + machine2 + " штук бутылок");
        System.out.println("За три дня машина произвела " + machine3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + machine4 + " штук бутылок");
    }
public static void task5(){

        System.out.println("Задача 5");
        byte white = 2;
        byte broun = 4;
        byte totalPaint = 120;
        int totalClasses = totalPaint / (broun + white);
      int whitePaint = (white * totalClasses);
    int brounPaint =  (totalPaint - whitePaint) ;
    System.out.println("В школе где " + totalClasses + " классов нужно " + whitePaint + " банок белой краски и " + brounPaint + " банок коричневой краски" );
}

public static void task6() {
        System.out.println("Задача 6");
        long banana = 5 * 80;
        long milk = 200 / 100 * 105;
        long icecream = 2 * 100;
        long egs = 4 * 70;
        long breakfast = banana + milk + icecream + egs ;
        float kg = breakfast / 1000f;
        System.out.println("Вес завтрака в граммах " + breakfast + " гр " + ",а в килограммах " + kg + " кг" );

}

public static void task7() {
        System.out.println("Задача 7");
        int weight = 7 * 1000;
        int min = weight / 250;
        int max = weight / 500;
        int average = (min + max) / 2;
System.out.println("Если боец будет худеть на 250 грамм в день, то ему потребуется " + min + " дней ,а асли на 500,"
        + " то " + max + " дней");

System.out.println("В среднем бойцу потребуется " + average + " день для похудения");

}
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int den = 83690;
        int kris = 76230;
        float procent = 1.1f;
        float newMasha = masha * procent;
        float newDen = den * procent;
        float newKris = kris * procent;
            float raznMasha = (newMasha - masha) * 12;
            float raznDen = (newDen - den) * 12;
            float raznKris = (newKris - kris) * 12;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + raznMasha + " рублей.");
        System.out.println("Денис теперь получает " + newDen + " рублей. Годовой доход вырос на " + raznDen + " рублей.");
        System.out.println("Кристина теперь получает " + newKris + " рублей. Годовой доход вырос на " + raznKris + " рублей.");



    }
}