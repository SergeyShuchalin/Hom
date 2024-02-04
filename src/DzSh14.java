public class DzSh14 {
    public static void main(String[] args) {
        int[] mas = {-2, 3, 8, -11, -4, 6};
        int quantity = count(0, 0, mas);
        String text;
        if (quantity % 10 == 1 && quantity != 11) {
            text = " отрицательный элемент";
        } else if (quantity % 10 >= 2 && quantity % 10 <= 4 && quantity != 12 && quantity != 13 && quantity != 14) {
            text = " отрицательных элемента";
        } else {
            text = " отрицательных элементов";
        }
        System.out.println("В массиве " + quantity + text);
    }

    public static int count(int j, int i, int[] arr) {
        if (i == arr.length) {
            return j;
        }
        if (arr[i] < 0) {
            j += 1;
        }

        return count(j, i + 1, arr);
    }

}
