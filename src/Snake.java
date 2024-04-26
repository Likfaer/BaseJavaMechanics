public class Snake extends Animal {
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override // Перегрузка метода и назначение собственных "действий"
    // Полиморфизм - вызов одноимённого метода с другим "действием"
    public void makeSound() {
        System.out.println(name + " шипит");
    }
}