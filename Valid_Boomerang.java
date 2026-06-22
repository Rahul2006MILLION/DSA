public class Valid_Boomerang {
    public static boolean check(int[][] arr){
        return (arr[1][1]-arr[0][1]) * (arr[2][0]-arr[0][0])!=
        (arr[2][1]-arr[0][1]) * (arr[1][0]-arr[0][0]);
    }
    public static void main(String[] args){
    int[][] a={{1,1},{2,2},{3,3}};
    boolean b=check(a);
    System.out.println(b);
}
}

