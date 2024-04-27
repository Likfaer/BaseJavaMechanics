import java.util.ArrayList;
//Быстрая сортировка, Вывод листа в формате x.xx, Числа Фибоначчи
public class SortingAlgorithms {
    public static void quickSort(ArrayList<Double> list, int low, int high) { // Алгоритм быстрой сортировки
        if (low < high) {
            int pivotIndex = partition(list, low, high);
            quickSort(list, low, pivotIndex - 1); // Рекурсивный вызов для левой части
            quickSort(list, pivotIndex + 1, high); // Рекурсивный вызов для правой части
        }
    }
    private static int partition(ArrayList<Double> list, int low, int high) { // Разделение списка на части относительно pivotIndex (опорного элемента)
        Double pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                Double temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        Double temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }
    public static void printList(ArrayList<Double> list) { // Вывод элементов в формате x.xx
        for (Double value : list) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }
    public static int findFirstAbove(ArrayList<Double> list, double threshold) {
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) <= threshold) {
                low = mid + 1;
            } else {
                if (mid == 0 || list.get(mid - 1) <= threshold) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1; // если нет элементов больше нужного
    }
    public static int fibonacci(int n) { //Рекурсия (Фибоначчи)
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
