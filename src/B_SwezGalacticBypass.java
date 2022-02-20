import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class B_SwezGalacticBypass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int r = Integer.parseInt(br.readLine().split(" ")[0]);
            pw.println(noSpace(r, br)? "DIPLOMACY!":"FIREWORKS!");
        }

    }
    static boolean noSpace(int r, BufferedReader br) throws IOException{
        boolean noSpace = true;
        for (int j = 0; j < r; j++) {
            String s = br.readLine();
            if(!s.contains(".")) noSpace = false;
        }
        return noSpace;
    }
}
