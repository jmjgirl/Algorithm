import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String stc = scan.nextLine();
        String[] num = stc.split("-");
        int answer = 0;
        for(int i=0; i<num.length; i++) {
            int tmp = plusNum(num[i]);
            if(i==0) {
                answer += tmp;
            }else {
                answer -= tmp;
            }
        }
        /*
        if(num.length==1) {
            String[] tmp = num[0].split("[+]");
            for(int i=0; i<tmp.length; i++) {
                answer += Integer.parseInt(tmp[i]);
            }
        } else {
            answer = Integer.parseInt(num[0]); // 여기서 NumberFormatException?
            for(int i=1; i<num.length; i++) {
                String[] tmp = num[i].split("[+]");
                for(int j=0; j<tmp.length; j++) {
                    answer -= Integer.parseInt(tmp[j]);
                }
            }
        }
         */
        System.out.println(answer);
    }

    static int plusNum (String str){
        int answer = 0;
        String[] tmp = str.split("[+]");
        for(int i=0; i<tmp.length; i++) {
            answer+=Integer.parseInt(tmp[i]);
        }
        return answer;
    }
}