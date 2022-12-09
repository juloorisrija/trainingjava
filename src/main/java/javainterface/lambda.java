package javainterface;

import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.IntConsumer;
import java.util.function.Supplier;

public class lambda {
    public static void main(String[] args){
        lambdaInterface lb= (a,b) ->{
            if(a>b){
                return a;
            }
            else{
                return b;
            }
        };
        BiPredicate<Integer,Integer> bi=(x,y)-> x>y;
        System.out.println("if x>y then it  returns true "+bi.test(16,8));
        Supplier<Double> anyNum = ()-> Math.random();
        System.out.println("floor of the number is "+anyNum.get());
        System.out.println("comparing the two numbers "+lb.compare(10,5));

    }


}
