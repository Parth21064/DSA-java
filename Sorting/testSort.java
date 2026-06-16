package Sorting;

public class testSort {

   static void printArr(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        bubble bbl=new bubble();
        selection scl=new selection();
        incertion inc=new incertion();


        merge mrg=new merge();
        quick qck=new quick();
        

        int []arr={2,43,22,76,12,-5,0,13};

        printArr(arr);

        // bbl.sort(arr);
        inc.sort(arr);

        printArr(arr);

    }
}
