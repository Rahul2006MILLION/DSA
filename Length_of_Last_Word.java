public class Length_of_Last_Word {
    public static int check(String s){
        String[] d=s.split(" ");
        return d[d.length-1].length();
    }
    public static void main(String[] args) {
        String g="   fly me   to   the moon  ";
        int h=check(g);
        System.out.println(h);
    }
    
}
