package S191220124.task3.src;

import java.util.Random;

public class RandomNum {  //生成不重复的随机数
    boolean[] sign;
    Random r;
    int size;
    int time;
    RandomNum(int size)
    {
        this.size=size;
        sign=new boolean[size];
        for (int i=0;i<size;i++)
            sign[i]=false;
        r=new Random();
        time=0;
    }
    int product()
    {
        if (time==size)
            return -1;
        int x=r.nextInt(size);
        while (sign[x]==true)
        {
            x=r.nextInt(size);
        }
        sign[x]=true;
        time++;
        return x;
    }

}
