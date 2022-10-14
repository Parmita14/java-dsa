import java.time.LocalDate;

// recursion is a method of solving a computational problem where the solutions depends on solutions
// to smaller instances of the same problem.
public class recursionbasics2{
    // public static void printdec(int n){
    //     if(n == 1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n +" ");
    //     printdec(n-1);
    // }
    // public static void main(String args[]){
    //     printdec(5);
    // }
    // stackoverflow 
    // if you don't have base case,recursion will act like infinte loop.Memory will be full ,it is known as stackoverflow.

    // factorial
    // public static int fact(int n){
    //     if(n == 0 || n==1){
    //         return 1;
    //     }
    //     int fnm1 = fact(n-1);
    //     int fn = n * fnm1;
    //     return fn;
    // }
    // public static void main(String args[]){
    //     System.out.println(fact(5));
    // }
   // sum of n number
//    public static int sum(int n){
//     if(n == 1){
//         return 1;
//     }
//     int snm1 = sum(n-1);
//     int sum = n + snm1;
//     return sum;
//    } 
//    public static void main(String args[]){
//     System.out.println(sum(10));
//    }

// Fibonacci (sum)
// public static int fibo(int n){
//     if(n ==0 || n==1){
//         return n;
//     }
//     int fibn = fibo(n-1) + fibo(n-2);
//     return fibn;
// }
// public static void main(String args[]) {
//     System.out.println(fibo(8));    
// }

// public static boolean isSort(int arr[] , int n){
//     if(n == arr.length-1){
//         return true;
//     }
//     if(arr[n] > arr[n+1]){
//         return false;
//     }
    
//     return isSort(arr, n+1);
// }
// public static void main(String args[]){
//     int arr[] = {1,2,8,4,5};
//    System.out.println( isSort(arr, 0));
// }

// give index of first occurence
// public static int fOcc(int arr[] , int key,int i) {
//     if(i == arr.length){
//         return -1;
//     }
//     if(arr[i] == key){
//         return i;
//     }
//     return fOcc(arr, key, i+1);
// }
// public static void main(String args[]){
//         int arr[] = {1,2,8,4,5};
//         System.out.println( fOcc(arr,8, 0));
//      }
// Give the index of last occurence of key
// public static int LOcc(int arr[], int key,int i){
//     if(i == arr.length){
//         return -1;
//     }
//  int isfound = LOcc(arr, key, i+1);
//  if(isfound == -1 && arr[i] == key){
//     return i;
//  }
//  return isfound;
// }
// public static void main(String args[]){
//          int arr[] = {1,2,8,4,5,8,7,9};
//              System.out.println( LOcc(arr,8, 0));
//     }
// print x^n T.C O(n)
// public static int powr(int x, int n){
//     if(n == 0){
//         return 1;
//     }
//     int xnm1 = powr(x, n-1);
//     int xn = x* xnm1;
//     return xn;
// }
// public static void main(String args[]){
//     System.out.println(powr(2, 5));
// }
// print x^n T.C O(logn)
// public static int powr(int x,int n){
//     if(n ==0){
//         return 1;
//     }
//     int halfpower = powr(x, n/2);
// if(n % 2 != 0){
//     int xn = x*halfpower*halfpower;
//     return xn;
// }

//     int xn = halfpower*halfpower;

// return xn;
// }
// public static void main(String args[]){
//     System.out.println(powr(2, 5));
// }
// tilling problem
// public static int tillingproblem(int n){
//     if(n==0|| n==1){
//         return 1;
//     }
//     int vertical = tillingproblem(n-1);
//     int horizontal = tillingproblem(n-2);
//     int totalways = vertical + horizontal;
//     return totalways;
// }
// public static void main(String args[]){
//     System.out.println(tillingproblem(4));
// }

// removeDuplicate in a string
// public static void removeDuplicate(String str ,int idx,StringBuilder newstr,boolean map[]){
//     if(idx == str.length()){
//         System.out.println(newstr);
//         return;
//     }
//     char currchar = str.charAt(idx);
//     if(map[currchar- 'a']== true){
//         removeDuplicate(str, idx+1, newstr, map);
//     }else{
//         map[currchar -'a'] = true;
//         removeDuplicate(str, idx+1, newstr.append(currchar), map);
//     }
// }
// public static void main(String args[]){
//     String str = "appnnacollege";
//     removeDuplicate(str, 0, new stringBuilder(" "),new boolean[26]);
// }
//  pairing friends

// public static int friendspairing(int n){
//     if(n==1||n==2){
//         return n;
//     }
//     // single
//     int fnm1 = friendspairing(n-1);
//     // paired
//     int fnm2 = friendspairing(n-2);
//     int pairways = (n-1) * fnm2;
//     int totalways = fnm1 + pairways;
//     return totalways;
// }
// public static void main(String args[]){
//     System.out.println(friendspairing(6));
// }

// binary string problem
// print all binary string of size n without consecutive ones

// all occurences
// public static void occurence(int arr[] , int key , int i){
//     // base case
//     if(i == arr.length)
//     {
//         return;
//     }
//     // kaam
//     if(arr[i] == key){
//         System.out.print(i+" ");
//     }
//     occurence(arr, key, i+1);
// }
// public static void main(String args[]){
//     int arr[] ={3,2,4,5,6,2,7,2,2};
//     int key =2;
//     occurence(arr, key, 0);
    
// }
//public static void numtoword(int n){
//     //base case
//     if(n==0){
//         return;
//     }
//    int lastd = n % 10;
//    switch(lastd){
//     case 0 :
//     System.out.print("zero ");
//     break;
//     case 1 :
//     System.out.print("one ");
//     break;
//     case 2 :
//     System.out.print("two ");
//     break;
//     case 3 :
//     System.out.print("three ");
//    break;
//     case 4 :
//     System.out.print("four ");
//    break;
//     case 5 :
//     System.out.print("five ");
//    break;
//     case 6 :
//     System.out.print("six ");
//    break;
//     case 7 :
//     System.out.print("seven ");
//    break;
//     case 8 :
//     System.out.print("eight ");
//    break;
//     case 9 :
//     System.out.print("nine ");
//    break;
// }
//    numtoword(n/10);
// }
//  String digits[] = {"zero","one","two","three","four","five","six","seven","eigth","nine"};
// if(n ==0){
//     return;
// }
// int lastd = n%10;
// numtoword(n/10);
// System.out.print(digits[lastd] +" ");
// }
// public static void main(String args[]){
//     numtoword(1947);
// }
// public static int length(String str){
    
//    if(str.length() == 0){
//     return 0;
//    }
//    return length(str.substring(1)) + 1;
// }
// public static void main(String args[]){
//     String str = "apple";
//     System.out.println(length(str));
// }

}

