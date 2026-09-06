public class Number_of_Segments_in_a_String {
    public static int check(String s){
        if (s.trim().isEmpty()) {
            return 0;
        }

        String[] d = s.trim().split("\\s+");
        return d.length;
    }
    public static void main(String[] args) {
        String h="Hello    my    name";
        int v=check(h);
        System.out.println(v);
    }
}
