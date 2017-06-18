package TemplateMethod;

public class Main {

    public static void main(String[] args) {

        int[] arg = {10, 34, 2, 56, 7, 67, 88, 42};

        SortAbstract sortAbstract = new AscendingSort();
        arg = sortAbstract.selectionSort(arg);

        for (int i : arg) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
