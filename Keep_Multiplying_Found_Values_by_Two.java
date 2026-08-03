import java.util.HashSet;

public class Keep_Multiplying_Found_Values_by_Two {
    public static int check(int[] nums,int original){
        HashSet<Integer> s=new HashSet<>();
        for(int num: nums){
            s.add(num);
        }
        while(s.contains(original)){
            for(int i=0;i<nums.length;i++){
                if(original==nums[i]){
                    original=original*2;
                }
            }
        }
        return original;
    }
    public static void main(String[] args) {
        int[] a={5,3,6,1,12};
        int og=3;
        int c=check(a, og);
        System.out.println(c);
    }
    
}
