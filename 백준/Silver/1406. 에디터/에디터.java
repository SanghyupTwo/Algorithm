import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ListIterator;
import java.util.StringTokenizer;

// 에디터
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String init = br.readLine();
        LinkedList<Character> L = new LinkedList<>();
        for (char c : init.toCharArray()) {
            L.add(c);
        }

        ListIterator<Character> cursor = L.listIterator(L.size());

        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char op = st.nextToken().charAt(0);
            if (op == 'P') {
                char add = st.nextToken().charAt(0);
                cursor.add(add);
            } else if (op == 'L') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
            } else if (op == 'D') {
                if (cursor.hasNext()) {
                    cursor.next();
                }
            } else if (op == 'B') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : L) {
            result.append(c);
        }
        bw.write(result.toString() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
