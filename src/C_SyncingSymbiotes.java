import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.TreeSet;

public class C_SyncingSymbiotes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            HashSet<Integer> symbiotes = new HashSet<>();
            symbiotes.add(1);
            String[] nk = br.readLine().split(" ");
            int k = Integer.parseInt(nk[1]);
            for (int j = 0; j < k; j++) {
                String[] uv = br.readLine().split(" ");
                int u = Integer.parseInt(uv[0]);
                int v = Integer.parseInt(uv[1]);
                if(symbiotes.contains(u) || symbiotes.contains(v)){
                    symbiotes.add(u);
                    symbiotes.add(v);
                }
            }
            TreeSet<Integer> sortedSymbiotes = new TreeSet(symbiotes);
            String result="";
            for (Integer s: sortedSymbiotes) {
                result = result.concat(s+" ");
            }
            pw.println(result);
        }
    }
}
