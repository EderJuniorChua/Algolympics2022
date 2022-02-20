import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class J_SongsTranscendAcrossNebulas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] an = new int[n];
            int nMax = 1;
            String[] san = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                an[j] = Integer.parseInt(san[j]);
                if(nMax<an[j]) nMax = an[j];
            }
            int m = Integer.parseInt(br.readLine());
            int[] am = new int[m];
            int mMax = 1;
            String[] sam = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                am[j] = Integer.parseInt(sam[j]);
                if(mMax<am[j]) mMax = am[j];
            }
            int maxL;
            int minL;
            int[] maxA;
            int[] minA;
            if(m>=n){
                maxL = m;
                minL = n;
                maxA = am;
                minA = an;
            } else {
                maxL = n;
                minL = m;
                maxA = an;
                minA = am;
            }
            int max = 1;
            if(maxL%minL==0){
                int[] aX = new int[maxL];
                System.arraycopy(minA,0, aX,0, minL);
                System.arraycopy(minA,0, aX, minL, maxL-minL);
                for (int j = 0; j < maxL; j++) {
                    int sum = maxA[j]+aX[j];
                    if(max<sum) max=sum;
                }
            } else {
                max = nMax + mMax;
            }
            pw.println(max);
            pw.flush();
        }
        pw.close();
    }
}
