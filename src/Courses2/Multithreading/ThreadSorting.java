package Courses2.Multithreading;

/**
 * Created by Admin on 07.07.2017.
 */
public class ThreadSorting implements Runnable {
    private int [] array;
    private int begine;
    private int end;
    private int index;
    private Thread thr;
    private boolean stop = false;

    public ThreadSorting(int[] array, int begine, int end, int index, Thread thr, boolean stop) {
        this.array = array;
        this.begine = begine;
        this.end = end;
        this.index = index;
        this.thr = thr;
        this.stop = stop;
    }

    public ThreadSorting(int[] array, int begin, int end) {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getBegine() {
        return begine;
    }

    public void setBegine(int begine) {
        this.begine = begine;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Thread getThr() {
        return thr;
    }

    public void setThr(Thread thr) {
        this.thr = thr;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
    public int peekElement(){
        return array [index];
    }
    public int poolElement(){
        int temp = array[index];
        return temp;
    }
    

    @Override
    public void run() {
        int temp;
        for (int i = begine; i <end ; i++) {
            int k = i-1;
            temp = array[i];
           for (; k >= begine && array[k] > temp ;){
               array [k +1] = array [k];
               array [k] = temp;
               k--;
            }
        }

    }
    public void chec(){
        this.index ++;
        if( this.index >= this.end){
            this.stop = true;
        }
    }

    public static void sort(int[] array2, int i) {
    }
}
