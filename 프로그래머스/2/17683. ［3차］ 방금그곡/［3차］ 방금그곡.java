import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        //ArrayList<ArrayList<String>> arrMusicinfos = new ArrayList<>();
        m = replaceString(m);
        
        // musicinfos를 split
        /*
        for(int i=0; i<musicinfos.length; i++) {
            String[] split = musicinfos[i].split(",");
            ArrayList<String> arr = new ArrayList<>();
            for(int j=0; j<split.length; j++) {
                arr.add(split[j]);
            }
            arrMusicinfos.add(arr);
        }
        */
        
        
        String[] startTime = new String[2];
        String[] endTime = new String[2];
        int max = 0; // 재생 시간이 가장 긴
        
        for(int i=0; i<musicinfos.length; i++) {
            //ArrayList<String> arr = arrMusicinfos.get(i);
            String[] service = musicinfos[i].split(",");
            startTime = service[0].split(":");
            endTime = service[1].split(":");
            int startMinutes = Integer.parseInt(startTime[0]) * 60 + Integer.parseInt(startTime[1]);
            int endMinutes = Integer.parseInt(endTime[0]) * 60 + Integer.parseInt(endTime[1]);
            int minutes = endMinutes - startMinutes;
            String title = service[2];
            String content = replaceString(service[3]);
            
            int contentLength = content.length();
            content = content.repeat(minutes/contentLength) + content.substring(0, minutes % contentLength);
            if(content.contains(m)) {
                if(minutes > max) {
                    max = minutes;
                    answer = title;
                }
            } 
            
        }

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