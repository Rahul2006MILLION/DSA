public class Two_Furthur_houses_with_different_colors {
    public static int chekc(int[] colors){
        int max=0;
        int left=0;
        int right=colors.length-1;
        int a1=0;
        int a2=0;

        while(colors[left]==colors[right]){
            left+=1;
        }
        a1=right-left;

        left=0;
        right=colors.length-1;

        while(colors[left]==colors[right]){
            right-=1;
        }
        a2=right-left;

        if(a1>a2){
            return a1;
        }
        return a2;
    }
    public static void main(String[] args) {
        int[] s={6,6,6,6,6,6,6,6,6,19,19,6,6};
        int b=chekc(s);
        System.out.println(b);
    }
    
}
