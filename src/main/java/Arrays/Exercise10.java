package Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        String[] alphabet = new String[]{"a", "b", "d", "e"};
        String condition = "c";
        boolean hasC = false;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i].equals(condition)) {
                hasC = true;
            }
        }
        if (hasC) {
            System.out.println("the above array has C!");
        } else {
            System.out.println("the above array does not have C!");
        }
    }
}

//alternative: instead of using fori, can use enhanced loop
/*
for(String[] a: alphabet) {
if(a == condition) {
    hasC = true;
        }
}
 */

