import java.util.*;
public class longest_possible_substring {
    public static void main(String[] args) {
        String input ="pwwkew";
        
        int max=0,left=0;

        HashMap<Character,Integer> position =new HashMap<>();
        for(int right=0;right<input.length();right++){
            char current=input.charAt(right);
            if(!position.containsKey(current)){
                position.put(current, right);
            }
            else{
                left=Math.max(left, position.get(current)+1);//.get returns the value here index
                position.put(current, right);//this replaces the value and does not create a new memory 
            }
            max=Math.max(max, (right-left)+1);
        }
        System.out.println(max);
    }
}
