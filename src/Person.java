public class Person { //Реализация людей для Queue
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() { //Вывод полной информации
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
