import java.util.LinkedList;

public class Queue { //Простая реализация очереди (Первый вошёл - первый вышел)
    private LinkedList<Person> queue;

    public Queue() {
        this.queue = new LinkedList<>(); //Создание связанного листа
    }

    public void enqueue(Person person) { //Добавление в очередь
        queue.addLast(person);
    }
    public Person dequeue() { //Удаление из очереди
        if (isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }
    public Person peek() { //Выбор первого из очереди
        if (isEmpty()) {
            return null;
        }
        return queue.getFirst();
    }
    public boolean isEmpty() { //Проверка на содержание
        return queue.isEmpty();
    }
    public int size() { //Возвращение размера очереди
        return queue.size();
    }
    @Override
    public String toString() { //Вывод всех элементов в очереди (персон в данном случае)
        return "Queue{" +
                "queue=" + queue +
                '}';
    }
}
