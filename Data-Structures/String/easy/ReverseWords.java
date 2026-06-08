import java.util.*;

class ReverseWords {
    // Brute Force
    // Time Complexity: O(N),We traverse the string once to collect words (O(N)) and
    // once more to reverse and join them (O(N)). Hence total time is O(N).

    // Space Complexity: O(N),We store all words in a separate list/array, requiring
    // extra space proportional to the number of characters.
    public String reverseWords(String s) {

        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else if (sb.length() > 0) {
                list.add(sb.toString());
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            list.add(sb.toString());
        }

        Collections.reverse(list);

        return String.join(" ", list);
    }

    public String reverseWords2(String s) {

        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            // Extract the word
            String word = s.substring(i + 1, end + 1);

            // Add space before appending if result is not empty
            if (sb.length() > 0) {
                sb.append(" ");
            }

            // Append word
            sb.append(word);
        }

        return sb.toString();
    }
}

// Driver code
class Main {
    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();
        String s = " amazing coding skills ";
        System.out.println(obj.reverseWords(s));
    }
}
