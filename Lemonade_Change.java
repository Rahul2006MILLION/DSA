public class Lemonade_Change {
    public static boolean check(int[] bills){
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five+=1;
            }
            if(bills[i]==10){
                if(five>=1){
                    five-=1;
                    ten+=1;
                }
                else{
                    return false;
                }
            }
            if(bills[i]==20){
                if(five>=1 && ten>=1){
                    five-=1;
                    ten-=1;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5};
        boolean b=check(a);
        System.out.println(b);

    }
    
}
