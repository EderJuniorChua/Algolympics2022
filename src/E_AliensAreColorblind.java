import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class E_AliensAreColorblind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] rc = br.readLine().split(" ");
            int r = Integer.parseInt(rc[0]);
            int c = Integer.parseInt(rc[1]);
            char[][] nft = new char[r][c];
            //Daniel - B
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    char pixel = (char)br.read();
                    if(pixel=='B') nft[j][k]=pixel;
                }
                br.readLine();
            }
            br.readLine();
            //Honda - G
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    char pixel = (char)br.read();
                    if(pixel=='G') nft[j][k]=pixel;
                }
                br.readLine();
            }
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    if(nft[j][k]==0) nft[j][k]='R';
                    pw.print(nft[j][k]);
                }
                pw.println();
            }
            pw.println();
        }

    }

}
