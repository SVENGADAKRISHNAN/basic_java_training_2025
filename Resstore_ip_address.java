import java.util.*;
public class Resstore_ip_address {
    public static void main(String[] args) {
        //Scanner sc =new Scanner(System.in);
        String input="101023";
        ArrayList<String> arr=new ArrayList<>();//to store multiple ip values
        int start=0;//start is used to help with backtracking to start with the previous checkpoint
        int segment=0;
        String tempo="";///the empty string is to store the iterative letters
        restore_ip(arr,input,tempo,segment,start);
        arr.stream().forEach(s->System.out.println(s));
    }
    public static void restore_ip(ArrayList<String> arr,String input,String tempo,int segment,int start){
        if(segment==4){
            if(start==input.length()){
                arr.add(tempo.substring(0,tempo.length()-1));
            }
            return;
        }
        for(int i=start;i<input.length();i++){
            String current=input.substring(start,i+1);
            if(isValid(current)){
                restore_ip(arr, input, tempo+current+".", segment+1, i+1);
            }
        }
    }
    public static boolean isValid(String current){
        if(current.isEmpty()||
        current.length()> 3 ||
        Integer.parseInt(current)>255||
        (current.startsWith("0") && current.length()>1)){
            return false;
        }
        return true;
    }
}
