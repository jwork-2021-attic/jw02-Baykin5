package S191220124.task3.src;

import S191220124.task3.src.Matrix.Position;

public class Monster implements Linable {  //不能用枚举类 妖怪太多枚举不过来

    private final int r;
    private final int g;
    private final int b;
    private int ordinal;

    private Position position;
    

    Monster(int ordinal,int r, int g, int b) {
        this.ordinal=ordinal;
        this.r = r;
        this.g = g;
        this.b = b;
    }


    public int rank() {
        return this.ordinal + 1;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rank() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

}
