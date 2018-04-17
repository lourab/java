package ch01.sec08;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[10];
        for (int i = 0; i < names.length / 2; i++) {
            names[i] = "";
        }//对前5个赋空值
        names[0] = "Fred";
        names[1] = names[0];
        System.out.println("names="+Arrays.toString(names));
        //names=[Fred, Fred, , , , null, null, null, null, null]
        
        int[] primes = { 17, 19, 23, 29, 31 };
        primes = new int[] { 2, 3, 5, 7, 11, 13 };
        
        // Enhanced for loop
        int sum = 0;
        for (int n : primes) {
            sum += n;
        }//增强的for循环
        
        System.out.println("sum=" +sum);
        
        // 混叠和复制Aliasing and copying
        int[] numbers = primes;//numbers 和 primes引用同一个数组
        numbers[5] = 42; // 改变primes的值
        System.out.println("primes=" + Arrays.toString(primes));// Arrays.toString()产生数组的字符串表示
        
        primes[5] = 13;
        int[] copiedPrimes = Arrays.copyOf(primes, primes.length);//copyOf()静态方法
        copiedPrimes[5] = 31; // 不改变primes
        System.out.println("primes=" + Arrays.toString(primes));//Arrays.toString(primes)
        System.out.println("copiedPrimes=" + Arrays.toString(copiedPrimes));
        
        System.out.println("primes=" +primes);//输出primes=[I@15db9742，返回的是地址？
    }
}
