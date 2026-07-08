import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    public static int[] check(int[] num1,int[] num2){
        HashSet<Integer> seen=new HashSet<>();
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<num1.length;i++){
            seen.add(num1[i]);
        }
        for(int i=0;i<num2.length;i++){
            if(seen.contains(num2[i])){
                s.add(num2[i]);
            }
        }
        int[] arr=new int[s.size()];
        int j=0;
        for(int num:s){
            arr[j]=num;
            j++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,1};
        int b[]={1,2};
        int c[]=check(a, b);
        for(int z:c){
            System.out.println(z);
        }
    }

    }
