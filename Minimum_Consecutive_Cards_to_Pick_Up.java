import java.util.HashSet;

public class Minimum_Consecutive_Cards_to_Pick_Up {

    public static int check(int[] cards){
        int left=0;
        int cur_distance=0;
        int min_dist=cards.length;
        HashSet<Integer> seen=new HashSet<>();
        for(int right=0;right<cards.length;right++){
            while(seen.contains(cards[right])){
                cur_distance=(right-left)+1;
                min_dist=Math.min(cur_distance,min_dist);

                seen.remove(cards[left]);
                left++;
            }
            seen.add(cards[right]);
        }
        if(seen.size()==cards.length){
            return -1;
        }
        return min_dist;
    }
    public static void main(String[] args) {
        int[] u={3,4,2,3,4,7};
        int d=check(u);
        System.out.println(d);
        }
    
}
