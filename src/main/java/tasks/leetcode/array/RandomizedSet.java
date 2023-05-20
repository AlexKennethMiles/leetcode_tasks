package tasks.leetcode.array;

import java.util.*;

/**
 * Суть алгоритма в использовании связки HashMap и ArrayList:
 * HashMap - для связи значение->индекс в массиве,
 * ArrayList - для связи индекс->значение (val).
 * Значения заносятся как ключи HashMap, так как
 * keySet - набор уникальных значений (ключей).
 */
class RandomizedSet {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> arr = new ArrayList<>();
    Random rand = new Random(); // Нужна для работы метода getRandom()

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) { // Если значение уже есть в HashMap
            return false; // Не можем добавить
        }
        map.put(val, arr.size()); // Иначе добавляем значение как ключ и связываем с индексом массива
        arr.add(val); // Добавляем в массив значение (arr.size()++)
        return true; // Добавление успешно
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) { // Если элемента нет в HashMap keySet
            return false; // Не можем удалить
        }
        int index = map.get(val); // Получаем индекс искомого значения из HashMap
        if (index != arr.size() - 1) { // Если индекс не хвостовой
            int tailVal = arr.get(arr.size() - 1); //
            int currVal = arr.get(index);
            arr.set(index, tailVal);
            arr.remove(arr.size() - 1);
            map.remove(currVal);
            map.put(tailVal, index);
        } else { // Если индекс хвостовой
            arr.remove(index); // Просто удаляем из массива последний элемент
            map.remove(val); // И удаляем пару ключ-значение по val
        }
        return true; // Удаление успешно
    }

    public int getRandom() { // При вызове гарантируется хотя бы один элемент в наборе
        if (arr.size() == 1) { // Если только один элемент, то
            return arr.get(0); // только один вариант возврата
        } // Иначе
        return arr.get(rand.nextInt(arr.size())); // Считаем случайное значение и получаем элемент массива
    }
}
