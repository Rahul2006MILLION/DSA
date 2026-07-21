public class Count_Negative_Numbers_in_Sorted_Matrix {
    public static int check(int[][] grid){
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<0){
                    c+=1;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int a[][]={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int b=check(a);
        System.out.println(b);
    }
    
}
