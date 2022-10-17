public class DividenConquer {
    //  QUESTION : QUICK SORT
    // public static void printArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i] +" ");
    //     }
    //     System.out.println();
    // }
    // public static void quicksort(int arr[], int si,int ei){
    //     if(si >= ei){
    //         return;
    //     }
    //     //kaam
    //     int pidx = partition(arr,si,ei);
    //     quicksort(arr, si, pidx-1);
    //     quicksort(arr, pidx+1, ei);
    // }
    // public static int partition(int arr[], int si,int ei){
    //     int pivot = arr[ei];
    //     int i = si-1;
    //     for(int j=si;j<ei;j++){
    //         if(arr[j] <= pivot){
    //             i++;
    //             // swap
    //             int temp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp;
    //         }
    //     }
    //     i++;
    //     // swap
    //     int temp = arr[i];
    //     arr[i] = pivot ;
    //     arr[ei] = temp;  
    //     return i;
    // }
    // public static void main(String args[]){
    //     int arr[] = {6,3,9,8,2,5,6};
    //     quicksort(arr,0,arr.length-1);
    //     printArr(arr);
    // } 
    // QUESTION : MERGESORT
    
    
// public static void printArr(int arr[]){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i] +" ");
//     }
//     System.out.println();
// }    
// public static void mergeSort(int arr[],int si,int ei){
//     // base case
//     if(si>=ei){
//         return;
//     }
//     int mid = si + (ei-si)/2;
//     mergeSort(arr, si, mid);
//     mergeSort(arr, mid+1, ei);
//     merge(arr,si,ei,mid);
// }
// public static void merge(int arr[], int si,int ei,int mid){
//     int temp[] = new int[ei-si+1];
//     int i = si;
//     int j = mid +1;
//     int k =0;
//     while(i<=mid && j<=ei){
//         if(arr[i] < arr[j]){
//             temp[k] = arr[i];
//             i++;k++;
//         }
//         else{
//             temp[k] = arr[j];
//             j++;k++;
//         }
//     }
//     while(i<=mid){
//         temp[k++] = arr[i++];
//     }
//     while(j<= ei){
//         temp[k++] = arr[j++];
//     }
//     for(k=0,i=si;k<temp.length;k++,i++){
//         arr[i] = temp[k];
//     }
// } 
// public static void main(String args[]){
//     int arr[] = {6,3,9,5,2,8};
//     mergeSort(arr, 0, arr.length-1);
//     printArr(arr);
// }

// SEARCH in ROTATED SORTED ARRAY
    
    
// public static int search(int arr[],int tar,int si, int ei){
//     if(si>ei){
//         return -1;
//     }
//     // kaam
//     // 1. find mid
//     int mid = si +(ei-si)/2;
//     // case found
//     if(arr[mid] == tar){
//         return mid;
//     }
//      // mid line 1
//      if(arr[si] <= arr[mid]){
//     // case a : left
//     if(arr[si] <= tar && tar <= arr[mid]){
//         return search(arr, tar, si, mid-1);
//     }else{
//     // case b : right
//         return search(arr, tar, mid+1, ei);
//     }
//      }
//      //mid line 2
//      else{
//      // case c : right
//      if(arr[mid] <= tar && tar<=arr[ei]){
//      return search(arr, tar, mid+1, ei);
//     }else{
//      return search(arr, tar, si, mid-1);
//     }
// }
// }
// public static void main(String args[]){
//     int arr[] = {4,5,6,7,0,1,2};
//     int tar = 0;
//    System.out.println( search(arr, tar,0,arr.length-1));
    
// }
// }
    
//QUESTION: USE MERGE SORT TO SORT ARRAY OF STRINGS 
    
    
public static String[] mergeSort(String[] arr, int lo,int hi){
    if(lo == hi){
        String[] a ={arr[lo]};
        return a;
    }
    int mid = lo +(hi-lo)/2;
    String[] arr1 = mergeSort(arr, lo,mid);
    String[] arr2 = mergeSort(arr, mid+1, hi);
    String[] arr3 = merge(arr1,arr2);
    return arr3;
}
static String[] merge(String[] arr1,String[] arr2){
    int m = arr1.length;
    int n = arr2.length;
    String[] arr3 = new String[m+n];
    int idx = 0;
    int i = 0;
    int j = 0;
    while(i<m && j<n){
        if(isalphabeticallysmaller(arr1[i],arr2[j])){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }else{
            arr3[idx] = arr2[j];
            j++;idx++;
        }
    }
    while(i<m){
        arr3[idx] =arr1[i];
        i++;idx++;
    }
    while(j<n){
        arr3[idx] = arr2[j];
        j++;idx++;
    }
    return arr3;
} 
static boolean isalphabeticallysmaller(String str1,String str2){
    if(str1.compareTo(str2)<0){
        return true;
    }
    return false;
}
public static void main(String[] args){
    String[] arr ={"sun","moon" ,"earth","mars"};
    String[] a = mergeSort(arr, 0, arr.length-1);
    for(int i=0;i<a.length;i++){
        System.out.print(a[i] +" ");
    }
}
}
