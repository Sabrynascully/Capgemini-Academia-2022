import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DesafioString {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a Palavra: ");
        String substring = scanner.next();

        System.out.print(anagrams(substring) + " Posibilidades");

}

	
	public  static int anagrams(String substring) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < substring.length(); i++) {
            for (int j = i; j < substring.length(); j++) {
                char[] substrings = substring.substring(i, j + 1).toCharArray();
                Arrays.sort(substrings);
                String novaString = new String(substrings);

                if (map.containsKey(novaString)) {
                    map.put(novaString, map.get(novaString) + 1);
                } else {
                    map.put(novaString, 1);
                }
            }
        }
        int anagram = 0;
        for (String novaString : map.keySet()) {
            int i = map.get(novaString);
            anagram += (i * (i - 1)) / 2;
        }
        return anagram;
    }
}
   
