public class Palindrome {
    public static void main(String[] args){
            int n=121;
    int a=n;
    int reverse=0;
    while(n>0){
        int r=n%10;
        n=n/10;
        reverse=(reverse*10)+r;
    }
    if(reverse==a){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
}

    }

