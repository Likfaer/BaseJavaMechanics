public class ZooKeeper {
    private String name;

    // Инкапсуляция - приватный конструктор (public - для создания экзепляров, но не изменим, т.к. для этого не существует метода get/set)
    public ZooKeeper(String name) {
        this.name = name;
    }

    // Инкапсуляция - ограничение доступа к методам (может быть вызван, но не даёт прямого доступа к данным этого класса)
    // Ассоциация объектов ZooKeeper с объектами Animal
    public void feedAnimal(Animal animal) {
        System.out.println(name + " is feeding " + animal.name);
    }
}