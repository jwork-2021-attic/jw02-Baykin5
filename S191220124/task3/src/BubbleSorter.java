package S191220124.task3.src;

public class BubbleSorter implements Sorter {
    private int[] a;
    private String plan = "";

    public void load(int[] a) {
        this.a = a;
    }

    public void bubbleSort() {

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
        boolean sorted = false;
        //for (int i=0;i<a.length;i++)
            //System.out.println(a[i]);
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    @Override
    public String getPlan() {
        return this.plan;
    }

}