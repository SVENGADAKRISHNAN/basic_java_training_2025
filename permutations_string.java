import java.util.ArrayList;

public class permutations_string {
    public static void main(String[] args) {
        //we use depth first approach

        String input = "abc";

        ArrayList<String> result = new ArrayList<String>();
        permutation(input, "", result);
        System.out.println("Perms are \n"+ result);


    }

    public static void permutation(String str, String perm, ArrayList<String> result) {
        if(str.isEmpty())
            result.add(perm);
        for (int i = 0; i < str.length(); i++) {
            String curr = ""+str.charAt(i); // b in a'b'c
            // removing b from a'b'c
            String remainingStr = str.substring(0, i) + str.substring(i+1);

            permutation(remainingStr, perm + curr , result);
        }
    }
}
