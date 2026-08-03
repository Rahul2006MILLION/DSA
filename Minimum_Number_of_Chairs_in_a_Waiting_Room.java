public class Minimum_Number_of_Chairs_in_a_Waiting_Room {
    public static int check(String s){
        int best=0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                curr++;
                if(curr>best){
                    best=curr;
                }
            }
            else if(s.charAt(i)=='L'){
                curr--;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        String f="ELELEEL";
        int d=check(f);
        System.out.println(d);

    }
    
}
