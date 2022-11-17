import java.util.ArrayList;

public class ArrayLIST {
    // sort an arrylist in ascending order
    //collections.sort(list)

    //sort an arraylist in descending order
    // collections.sort(list,collections.reversseOrder());


    // swapping in arraylist
public static void swap(ArrayList<Integer>listt, int idx1,int idx2){
    int temp = listt.get(idx1);
    listt.set(idx1,listt.get(idx2));
    listt.set(idx2,temp);
    System.out.println(listt);
}
// find maximum the arraylist
public static void maxnum(ArrayList<Integer>listt){
int max = Integer.MIN_VALUE;
for(int i=0;i<listt.size();i++){
   
    max = Math.max(max,listt.get(i));
}
System.out.println(max);
}
// two dimensional arraylist
// ArrayList<ArrayList<Integer>>listname = new ArrayList<>();

// -> container with maximum water
// brute force O(n^2)
public static int storewater(ArrayLIST<Integer>height){
int maxwater = 0;
for(int i =0;i<height.size();i++){
    for(int j=i+1;j<height.size();j++){
        int ht = Math.min(height.get(i),height.get(j));
        int width = j-i;
        int currwater = ht*width;
        maxwater = math.max(maxwater,currwater);
    }
}
return maxwater;
}
// 2 pointer approach
public static int storwater(ArrayList<Integer>height){
    int maxwater = 0;
    int lp = 0;
    int rp = height.size()-1;
    while(lp<rp){
        // calculate water area
        int ht = math.min(height.get(lp), height.get(rp));
        int width = rp - lp;
        int currwater = ht*width;
        maxwater = Math.max(maxwater, currwater);
        // update pointer
        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;
        }

    }
    return maxwater;
}

// PAIRSUM
// brute force
public static boolean pairsum(ArrayLIST<Integer>list,int target){
    for(int i =0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i) + list.get(j) == target){
                return true;
            }
        }
    }
}

// optimised approach -> 2 pointer approach
public static boolean pairsum(ArrayLIST<Integer>list,int target){
    int lp = 0;
    int rp = list.size()-1;
    while(lp != rp){
// case1 
if(list.get(lp) + list.get(rp) == target){
    return true;
}
// case
if(list.get(lp) + list.get(rp) < target){
    lp++;
}else{
    rp--;
}
    }
    return false;
}

// pair sum2
// find if any pair in a sorted & rotated arraylist has a target sum
public static boolean pairsum2(ArrayLIST<Integer>list,int target){
    int bp = -1;
    for(int i=0;i<list.size();i++){
        if(list.get(i) > list.get(i+1)){
            bp = i;
            break;
        }
    }
    int lp = bp+1;
    int rp = bp;
    while(lp!=rp){
        if(list.get(lp) + list.get(rp) < target){
            lp = (lp+1)% n;
        }else{
            rp = (n + rp -1)% n;
        }
    }
    return false;
}
public static void main(String args[]){
        ArrayList<Integer> listt = new ArrayList<>();
listt.add(2);
listt.add(9);
listt.add(8);
listt.add(5);
listt.add(7);
int  idx1=1,idx2 = 3;
swap(listt, idx1, idx2);
// reverse print
// for(int i = listt.size()-1;i>=0;i--){
//     System.out.print(listt.get(i) +" ");
// }System.out.println();
//
     }
}