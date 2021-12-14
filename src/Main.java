import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        // Оставляем только элементы больше 0
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                tempList.add(intList.get(i));
            }
        }

        // Оставляем только четные элементы
        List<Integer> resultList = new ArrayList<Integer>();
        for(int i = 0; i < tempList.size(); i++) {
            if (tempList.get(i) % 2 == 0) {
                resultList.add(tempList.get(i));
            }
        }

        // Сортировка пузырьком
        for (int i = resultList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                Integer temp;
                if (resultList.get(j) > resultList.get(j + 1)) {
                    temp = resultList.get(j + 1);
                    resultList.set(j + 1, resultList.get(j));
                    resultList.set(j, temp);
                }
            }
        }

        // Вывод элементов
        for(int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
    }
}
