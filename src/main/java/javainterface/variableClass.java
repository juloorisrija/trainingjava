package javainterface;

public class variableClass {
    public static void main(String[] args){
    get();
    get(2);
    get(1,4);
    get(16,10,20);
    }
    static void get(int...values){
        if(values.length==0 ){
            System.out.println("welcome to the get method");
        }
        else if(values.length==1){
            System.out.println("add the 10 number "+(values[0]+10));
        } else if (values.length==2) {
            int  avg=(values[0]+values[1])/2;
            System.out.println("avg of the nums is "+avg);
        } else if (values.length==3) {
            int sum=0;
            for(int i=0;i<3;i++){
                 sum=sum+values[i];
            }
            System.out.println("sum of the numbers "+sum);
        }
    }
}
