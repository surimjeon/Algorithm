// 기억멜로디 ABCDEFG / ["12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"]
// 여러개인 경우, 재생시간 긴순, 먼저 입력된 음악 제목(나중에 비교)
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "(None)";
        //음악시간 순으로 반복됨, 항상 0부터 시작
        int max_time = 0;
        m = change(m);
        for (int i=0; i<musicinfos.length; i++) {
            String[] temp = musicinfos[i].split(",");
            int time = cal(temp[0], temp[1]); //반복시간 구하기

            String title = temp[2];
            String melody = change(temp[3]);
            
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<time; j++) {
                sb.append(melody.charAt(j%melody.length()));
            }
            //이 문자열에 m이 들어가있는지 보고, maxtime갱신해주자
            String base = sb.toString();
            
            if (base.indexOf(m)!=-1) {
                if (max_time < time) {
                    answer = title;
                    max_time = time;
                }
            }
            
        }
        return answer;
    }
    public int cal(String s, String e) {
        String[] start = s.split(":");
        String[] end = e.split(":");
        return Integer.parseInt(end[1])-Integer.parseInt(start[1])
        +60*(Integer.parseInt(end[0])-Integer.parseInt(start[0]));   
    }
    public String change(String s) {
        s = s.replaceAll("C#", "H");
        s = s.replaceAll("D#", "I");
        s = s.replaceAll("F#", "J");
        s = s.replaceAll("G#", "K");
        s = s.replaceAll("A#", "L");
        s = s.replaceAll("B#", "L");
        return s;
    }
    
    
}