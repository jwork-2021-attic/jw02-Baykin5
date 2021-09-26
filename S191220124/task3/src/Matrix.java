package S191220124.task3.src;


public class Matrix {
    private int N,M;

    public Matrix(int N,int M){
        this.N=N;
        this.M=M;
        this.positions=new Position[N][M];
    }

    private Position[][] positions;

    public void put(Linable linable, int i) {
        int n=i/N;
        int m=i%N;

        if (this.positions[n][m] == null) {
            this.positions[n][m] = new Position(null);
        }
        this.positions[n][m].setLinable(linable);
    }

    public Linable get(int i) {
        int n=i/N;
        int m=i%N;
        if ((i < 0) || (i > positions.length)) {
            return null;
        } else {
            return positions[n][m].linable;
        }
    }

    class Position {

        private Linable linable;

        Position(Linable linable) {
            this.linable = linable;
        }

        public void setLinable(Linable linable) {
            this.linable = linable;
            linable.setPosition(this);
        }

    }

    @Override
    public String toString() {
        String lineString = "\t";
        for (Position []p:positions){
            for (Position q:p)
            {
                lineString += q.linable.toString();
            }
            lineString += '\n';
        }

        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[N*M];
        for (int i = 0; i < N; i++) {
            for (int j=0;j<M;j++)
                linables[i*N+j] = positions[i][j].linable;
        }

        return linables;

    }

}
