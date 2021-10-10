package edu.neu.coe.info6205.union_find;

import java.util.Random;
import java.util.Scanner;

public class UF_Client {


    public static int count(int n) {
        //UF_HWQUPC obj = new UF_HWQUPC(num);
        Random random = new Random();
        int l, r;
        UF_HWQUPC entity = new UF_HWQUPC(n, true);
        int count = 0;
        while (entity.components() > 1) {
            l = random.nextInt(n);
            r = l;
            while (r == l) {
                r = random.nextInt(n);
            }
            if (!entity.isConnected(l, r)) {
                //System.out.println("Union: (" +l + ", " + r +")");
                entity.connect(l, r);
            }
            count++;
            //System.out.println("count is- "+ count);
        }
        return count;
    }


    public static void main(String[] args) {

       System.out.println("Please enter integer value for Sites");
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();
      int randomcount=0;
        for (int i = 0; i < 10; i++) {
           // System.out.println(n + " Sites Total Connections: " + count(n));
            randomcount+=count(n);
           // System.out.println("----------");
          // n *= n;
        }
        System.out.println("Random Pairs Generated for N= " + n+ " is: " + randomcount/10);



        }

    }

