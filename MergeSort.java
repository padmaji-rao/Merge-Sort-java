import java.util.Scanner;

class MergeSort {

    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = ip.nextInt();

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr["+i+"] :" );
            arr[i] = ip.nextInt();
        }

        mergeSort(arr, 0, n - 1,n);

        System.out.print("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void mergeSort(int[] arr, int low, int high,int n){
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            mergeSort(arr,low,mid,n);
            mergeSort(arr,mid+1,high,n);
            merge(arr,low,mid,high,n);
        }

    }

    static void merge(int[] arr,int low,int mid,int high,int n){
        int i,j,k,h;
        int b[]=new int[n];
        i=low;
        j=mid+1;
        k=low;
        while((i<=mid)&&(j<=high))
        {
            if(arr[i]<arr[j])
            {
                b[k]=arr[i];
                i++;
            }
            else
            {
                b[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            for(h=j;h<=high;h++)
            {
                b[k]=arr[h];
                k++;
            }
        }
        else
        {
            for(h=i;h<=mid;h++)
            {
                b[k]=arr[h];
                k++;
            }
        }
        for(h=low;h<=high;h++)
        {	
        arr[h]=b[h];
        }
    }

    
}