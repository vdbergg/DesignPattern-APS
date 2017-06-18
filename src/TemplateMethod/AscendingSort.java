package TemplateMethod;

/**
 * Created by berg on 17/06/17.
 */
public class AscendingSort extends SortAbstract {

    @Override
    public boolean isSelected(int arg1, int arg2) {
        if (arg1 < arg2)
            return true;

        return false;
    }
}
