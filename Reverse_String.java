public class Reverse_String {
    public static char[] check(char[] s){
        int left=0;
        int right=s.length-1;
        char temp;
        while(left<right){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left+=1;
            right-=1;
        }
        return s;
    }
    public static void main(String[] args) {
        char[] a={'R','a','h','u','l'};
        char[] t=check(a);
        System.out.println(t);
    }
    
}
