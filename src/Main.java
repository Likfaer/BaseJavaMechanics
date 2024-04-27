import java.io.PrintStream;
import java.text.DecimalFormat; // Формат вывода данных (округление)
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый код на Java!");
        System.out.println("Вызов метода BaseMechanics..."); // Основные функции Java
        BaseMechanics();
        System.out.println("==BaseMechanics end==");
        System.out.println("Вызов метода OopMechanics"); // Принципы ООП на Java
        OopMechanics();
        System.out.println("==OopMechanics end==");
        System.out.println("Вызов метода StructuresAndAlgorithms"); // Принципы ООП на Java
        StructuresAndAlgorithms();
        System.out.println("==StructuresAndAlgorithms end==");
        System.out.println("Вызов метода SimpleQueue"); // Принципы ООП на Java
        SimpleQueue();
        System.out.println("==SimpleQueue end==");
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
    public static void StructuresAndAlgorithms() {
        Random random = new Random();
        ArrayList<Double> list = new ArrayList<>(); // Динамический массив (список)
        for (int i = 0; i < 10; i++) {
            list.add(random.nextDouble() * 100);
        }
        SortingAlgorithms.printList(list); // Вывод до сотых (без округления)
        SortingAlgorithms.quickSort(list, 0, list.size() - 1); // Быстрая сортировка
        SortingAlgorithms.printList(list);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число, выше которого выведутся элементы списка:");
        double markedNumber = scanner.nextDouble();
        int resultIndex = SortingAlgorithms.findFirstAbove(list, markedNumber); // бинарный поиск элементов больше определённого числа
        if (resultIndex != -1) {
            System.out.println("Первый элемент больше " + markedNumber + " находится на индексе: " + resultIndex);
            System.out.println("Значение элемента: " + list.get(resultIndex));
            System.out.println("Все элементы больше " + markedNumber + ": ");
            for (int i = resultIndex; i < list.size(); i++) {
                PrintStream printf = System.out.printf("%.2f ", list.get(i));
            }
            System.out.println();
        } else {
            System.out.println("Элементы больше " + markedNumber + " не найдены.");
        }

        System.out.println("Введите колличество чисел Фибоначчи, которое будет выведено:"); //Простейшая рекурсия (числа Фибоначчи)
        double numberFibonacci = scanner.nextInt();
        scanner.close();
        System.out.println("Первые " + numberFibonacci + " чисел Фибоначчи:");
        for (int i = 0; i < numberFibonacci; i++) {
            System.out.print(SortingAlgorithms.fibonacci(i) + " ");
        }
    }
    public static void SimpleQueue() {
        Queue queue = new Queue();
        queue.enqueue(new Person("Владимир", 25));
        queue.enqueue(new Person("Алексей", 30));
        queue.enqueue(new Person("Дмитрий", 20));

        System.out.println("Размер очереди: " + queue.size());
        System.out.println("Первый в очереди: " + queue.peek());
        Person removedPerson = queue.dequeue();
        System.out.println("Вышел из очереди: " + removedPerson);
        System.out.println("Размер очереди после выхода: " + queue.size());
     }
}

