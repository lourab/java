package ch01.sec07;

import java.util.*;

public class ForDemo {
   public static void main(String[] args) {
      Random generator = new Random();      //随机数产生器
      int count = 20;
      int sum = 0;
      for (int i = 1; i <= count; i++) {
         int next = generator.nextInt(10);//获得0~9的随机数
         sum = sum + next;         
      }//i的作用域到这里结束
      System.out.println("After " + count 
         + " iterations, the sum is " + sum);
   }
}
