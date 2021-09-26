package S191220124.task3.src;

public class QuickSorter implements Sorter {
    private int[] a;
    private String plan = "";

    public void load(int[] a) {
        this.a = a;
    }

    public void QuickSorter() {

    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    int Partition(int l, int r)
    {
        int split_point = l;
        int pivot= a[l];
        for (int i = l; i <= r; i++)
            if (a[i] < pivot)
            {
                split_point++;
                if (split_point!=i)
                    swap(split_point,i);
            }
        if (split_point!=l)
        {
            swap(l,split_point);
        }

        return split_point;
    }
    void helpSort(int l, int r)
    {
        if (l < r)
        {
            int pivot = Partition( l, r);
            helpSort( l, pivot - 1);
            helpSort(pivot + 1, r);
        }
    }

    @Override
    public void sort() {
        helpSort(0,a.length-1);
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}