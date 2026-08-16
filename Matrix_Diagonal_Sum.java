public class Matrix_Diagonal_Sum {
    public static int check(int[][] mat){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            sum+=mat[i][mat.length-1-i];
        }
        if(mat.length%2!=0){
            return sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] a={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}; //try this {[1,2,3],[4,5,6],[7,8,9]} :)
        int c=check(a);
        System.out.println(c);
    }
}
