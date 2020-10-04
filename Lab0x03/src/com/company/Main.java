package com.company;
import java.lang.management.*;



public class Main {
    public static int threeSum(int[] a){

        //This is bad with On^3 thanks book

        int N = a.length;
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                for(int k = j + 1; k < N; k++){
                    if(a[i] + a[j] + a[k] == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int threeSumTwo(int[] a){

        //This is broken On^2
        int N = a.length;
        int count = 0;
        for(int i = 0; i < N; i++){
            int currentTarget = 0 - a[i];
            for(int j = i + 1; j < N; j++){
                if(i < currentTarget - a[j]){
                    final Integer[] integers = {a[i], a[j], currentTarget - a[j]};
                }
                else {
                    final int i1 = a[j];
                }
            }
        }

        return  count;
    }


    public static void main(String[] args) {
        long timeStampBefore = getCpuTime();
        long timeStampAfter = getCpuTime();
        long timeMeasureForNothing = timeStampAfter - timeStampBefore;
        System.out.println(timeMeasureForNothing);

        timeStampBefore = getCpuTime();

        int a[] = {-1, 2, -1, -4, 5};
        //System.out.print(threeSum(a));
        System.out.printf("\n");
        int num = 5000;

        for(int x = 0; x < num; x++){
            for (int N = 1; N < num; N += N) {
                int size = N;               // This will make the array any random size
                int[] list = new int[size];
                for (int k = 0; k < size; k++) {
                    int n = (int) (Math.random() * -9 + 1);
                    list[k] = n;
                    //System.out.println(list[i] + " ");
                    //System.out.printf("%d \t ",list[k]);
                    //System.out.printf("\n");
                }
                System.out.printf("Checking: %d \n",threeSum(list));
                //System.out.printf("Checking: %d \n",threeSumTwo(list));
                timeStampAfter = getCpuTime();
                long timeMeasureForPrintln = timeStampAfter - timeStampBefore;
                System.out.println(timeMeasureForPrintln);




            }
            x *= x;
            //System.out.printf("Checking: %d \n",x);
        }
        timeStampAfter = getCpuTime();
        long timeMeasureForPrintln = timeStampAfter - timeStampBefore;
        System.out.println(timeMeasureForPrintln);
    }
    public static long getCpuTime( ) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean( );
        return bean.isCurrentThreadCpuTimeSupported( ) ?
                bean.getCurrentThreadCpuTime( ) : 0L;
    }
}
