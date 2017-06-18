package TemplateMethod;

/**
 * Created by berg on 17/06/17.
 */
public abstract class SortAbstract {

    public final int[] selectionSort(int[] arg) {

        for (int i = 0; i < arg.length - 1; i++) {

            int selected = i;

            for (int j = i + 1; j < arg.length; j++) {

                if (isSelected(arg[j], arg[selected]))
                    selected = j;
            }

            int temp = arg[selected];
            arg[selected] = arg[i];
            arg[i] = temp;
        }

        return arg;
    }

    public abstract boolean isSelected(int arg1, int arg2);
}
