
// Инкапсуляция (protected поля класса - доступны ТОЛЬКО внутри класса и подклассах)
// Наследование (абстрактный Animal (общие свойства и методы) для класса Lion и Snake)
public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound(); // абстрактный метод для наследования классами и переопределения (полиморфизма)
}
