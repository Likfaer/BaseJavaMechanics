import java.text.DecimalFormat; // Формат вывода данных (округление)

public class Main {
    public static void main(String[] args) {
        System.out.println("Первый код на Java!");
        System.out.println("Вызов метода BaseMechanics...");
        BaseMechanics();
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
}

