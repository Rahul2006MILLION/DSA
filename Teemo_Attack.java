public class Teemo_Attack {
    public static int check(int[] timeSeries,int duration){
        //[1,4,5] dur=2
        //loop till 4
        //subtract [i+1] - [i]
        //and take minimum between the subratced and duration
        //Append total
        //finally for the last element add the duration
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int a=Math.min((timeSeries[i+1]-timeSeries[i]), duration);
            total+=a;
        }
        return total+duration;
    }

    public static void main(String[] args) {
        int[] ti={1,4,5};
        int du=2;
        int c=check(ti, du);
        System.out.println(c);
    }
    
}
