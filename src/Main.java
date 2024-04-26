import java.text.DecimalFormat; // Формат вывода данных (округление)

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый код на Java!");
        System.out.println("Вызов метода BaseMechanics..."); // Основные функции Java
        BaseMechanics();
        System.out.println("==BaseMechanics end==");
        System.out.println("Вызов метода OopMechanics"); // Принципы ООП на Java
        OopMechanics();
        System.out.println("==OopMechanics end==");
    }
    public static void BaseMechanics() {
        System.out.print("Вывод на ");
        System.out.println("одной строчке"); // ln переносит следующую выводимую строку на новую
        /* Комментарий
        В котором можно писать
        В несколько строк */
        int A = 5;
        int B,C;
        System.out.println("A = " + A); // старое A
        A = 10;
        System.out.println("A = " + A); // новое A
        B = 15;
        System.out.println("Сумма - " + A + " + " + B + " = " + (A + B));
        System.out.println("Вычитание - " + A + " + " + B + " = " + (A - B));
        C = A * B;
        System.out.println("Умножение - " + A + " * " + B + " = " + C + " == " + A * B);
        double price = 110.5;
        double weight = 4.5;
        System.out.println("Цена за " + weight + " килограмма = " + price * weight); // адекватный пример умножения
        double megabytes = 130792.75;
        double megabytesPerGigabyte = 1024;
        double gigabytes = megabytes / megabytesPerGigabyte;
        DecimalFormat df = new DecimalFormat("#.##"); //формат округления
        System.out.println(megabytes + " мегабайт - это ~ " + df.format(gigabytes) + " гигабайт (округление до сотых)");
        String hello = "Hello,";
        String name = "Дима!";
        System.out.println(hello + " " + name); // конкатенация строк
    }
    public static void OopMechanics() {
        Lion lion = new Lion("Симба", 3);
        Snake snake = new Snake("Каа", 5);

        ZooKeeper zooKeeperFirst = new ZooKeeper("Маугли");
        zooKeeperFirst.feedAnimal(lion);
        ZooKeeper zooKeeperSecond = new ZooKeeper("Владимир");
        zooKeeperSecond.feedAnimal(snake);
        snake.makeSound();
    }
    //Инкапсуляция: Скрыть детали реализации классов животных и сотрудников зоопарка.
    //Наследование: Использовать общие свойства и методы животных и сотрудников.
    //Полиморфизм: Позволить разным типам животных выполнять действия, такие как издавать звуки, специфичные для их видов.
    //Абстракция: Определить абстрактные классы или интерфейсы для обобщения функций животных и сотрудников.
    //Ассоциация: Связать животных с сотрудниками, которые за ними ухаживают.
}

