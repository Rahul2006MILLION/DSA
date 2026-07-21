import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimum_Index_Sum_of_Two_List {
    public static List<String> check(String[] list1,String[] list2){
        HashMap<String,Integer> d=new HashMap<>();
        List<String> l=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            if(!d.containsKey(list1[i])){
                d.put(list1[i], i);
            }
        }
        for(int i=0;i<list2.length;i++){
            if(d.containsKey(list2[i])){
                d.put(list2[i], d.get(list2[i])+i);
            }
        }
        int min=100000;
        for (String keys : d.keySet()) {
        boolean found = false;
        for (String s : list2) {
            if (s.equals(keys)) {
                found = true;
                break;
            }
        }
        if (found) {
            int value = d.get(keys);
            if (value < min) {
                min = value;
                l.clear();
                l.add(keys);
            } 
            else if (value == min) {
                l.add(keys);
            }
        }
    }

    return l;
    }
    public static void main(String[] args) {
        String[] l1={"Shogun","Tapioca Express","Burger King","KFC"};
        String[] l2={"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        List<String> a=check(l1, l2);
        System.out.println(a);
    }
    
}
