package S191220124.task2.src;

public class SelectSorter implements Sorter {
    private int[] a;
    private String plan = "";

    public void load(int[] a) {
        this.a = a;
    }


    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    @Override
    public void sort() {
        int min=0;
        int minValue=10000000;
        for (int i=0;i<a.length;i++) {
            for (int j = i; j < a.length; j++) {
                if (minValue > a[j]) {
                    min = j;
                    minValue = a[j];
                }
            }
            if (i != min)
                swap(i, min);
            minValue = 10000000;
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}
