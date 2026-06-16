package Sorting;

public class merge {

    public void conqure(int []arr,int st,int mid,int end){
        int []mgArr=new int[end-st+1];

        int idx=st;
        int idy=mid+1;
        int md=0;

        while (idx<=mid && idy<=end) {
            if (arr[idx]>arr[idy]) {
                mgArr[md++]=arr[idy++];
                
            }
            else{
                mgArr[md++]=arr[idx++];
                
            }
            
        }
 
        while (idx<=mid) {
                mgArr[md++]=arr[idx++];
                
        }
        
        
        while (idy<=end) {
                mgArr[md++]=arr[idy++];
               
        }
        

        for(int i=0,j=st;i<mgArr.length;i++,j++){
                arr[j]=mgArr[i];
        }

    }

    public void devide(int []arr,int st,int end){

        int mid=st+(end-st)/2;

        if (st!=end) {
            devide(arr, st, mid);
            devide(arr, mid+1, end);

            conqure(arr,st,mid,end);
        }

    }

    public void sort(int arr[]){
        int st=0;
        int end=arr.length-1;
        devide(arr, st, end);

    }
}
