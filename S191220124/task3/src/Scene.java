package S191220124.task3.src;

import S191220124.task3.src.Monster;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Scene {

    public static void main(String[] args) throws IOException {
        final int N=8,M=8;
        final int NUM=N*M;

        Matrix matrix = new Matrix(N,M);
        Monster []monsters=new Monster[NUM];
        Random r=new Random();

        RandomNum randomNum=new RandomNum(NUM);


        for (int i=0;i<NUM;i++)
        {
            int tempR=randomNum.product();
            //System.out.println(tempR);
            Monster m= new Monster(i,255-i*4,128,128);
            monsters[i]=m;
            matrix.put(m,tempR);
        }

        Snake theSnake = Snake.getTheSnake();

        System.out.println("请选择排序方式:1.冒泡排序 2.快速排序 3.选择排序");
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        int x=scanner.nextInt();
        Sorter sorter=null;
        if (x==1)
            sorter = new BubbleSorter();
        else if (x==2)
            sorter =new QuickSorter();
        else if (x==3)
            sorter = new SelectSorter();

        theSnake.setSorter(sorter);

        String log = theSnake.matrixUp(matrix,monsters);

        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();

    }

}

