package S191220124.task2.src;

public class Snake {

    private static Snake theSnake;

    public static Snake getTheSnake() {
        if (theSnake == null) {
            theSnake = new Snake();
        }
        return theSnake;
    }

    private Snake() {

    }

    private Sorter sorter;

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    public String lineUp(Line line,Monster[] monsters) {

        String log = new String();

        if (sorter == null) {
            return null;
        }
        Linable[] linables = line.toArray();
        int[] ranks = new int[linables.length];
        for (int i = 0; i < linables.length; i++) {
            ranks[i] = linables[i].getValue();
        }
        sorter.load(ranks);
        sorter.sort();
        System.out.println(sorter.getPlan());
        String[] sortSteps = this.parsePlan(sorter.getPlan());

        for (String step : sortSteps) {
            this.execute(step,monsters);
            log += line.toString();
            log += "\n[frame]\n";
        }

        return log;

    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(String step,Monster[] monsters) {
        //System.out.println(step);
        String[] couple = step.split("<->");
        System.out.printf("%s %s\n",couple[0],couple[1]);
        monsters[Integer.parseInt(couple[0])-1].swapPosition(monsters[Integer.parseInt(couple[1])-1]);
    }

}