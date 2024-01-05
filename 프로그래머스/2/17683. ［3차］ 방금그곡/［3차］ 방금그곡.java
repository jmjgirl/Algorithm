import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        ArrayList<ArrayList<String>> arrMusicinfos = new ArrayList<>();
        m = replaceString(m);
        
        // musicinfos를 split
        
        for(int i=0; i<musicinfos.length; i++) {
            String[] split = musicinfos[i].split(",");
            ArrayList<String> arr = new ArrayList<>();
            for(int j=0; j<split.length; j++) {
                arr.add(split[j]);
            }
            arrMusicinfos.add(arr);
        }
        
        
        String[] startTime = new String[2];
        String[] endTime = new String[2];
        int max = 0;
        for(int i=0; i<arrMusicinfos.size(); i++) {
            ArrayList<String> arr = arrMusicinfos.get(i);
            startTime = arr.get(0).split(":");
            endTime = arr.get(1).split(":");
            int startMinutes = Integer.parseInt(startTime[0]) * 60 + Integer.parseInt(startTime[1]);
            int endMinutes = Integer.parseInt(endTime[0]) * 60 + Integer.parseInt(endTime[1]);
            int minutes = endMinutes - startMinutes;
            String content = replaceString(arr.get(3));
            
            //if(minutes > content.length()) {
                int contentLength = content.length();
                content = content.repeat(minutes/contentLength)
                    + content.substring(0, minutes % contentLength);
                if(content.contains(m)) {
                    if(minutes > max) {
                       max = minutes;
                       answer = arr.get(2);
                    }
                } 
            //}
            
            // 노래 재생 기간이 m의 길이 보다 짧다면
            /*
            if(m.length() > minutes) break;
            else {
                int contentLength = content.length();
                content = content.repeat(minutes/contentLength)
                    + content.substring(0, minutes % contentLength);
                if(content.contains(m)) {
                    if(minutes > max) {
                       max = minutes;
                       answer = arr.get(2);
                    }
                }
                // System.out.println(content);
            }*/
            
        }

        if(answer.length() == 0) return "(None)";
        return answer;
    }
    
    public String replaceString(String str) {
        return str.replaceAll("A#","H")
                  .replaceAll("C#","I")
                  .replaceAll("D#","J")
                  .replaceAll("F#","K")
                  .replaceAll("G#","L");
    }
}