// 빈칸 . 파일은 # -> 드래그한 거리가 최소가 되도록 선택하기
class Solution {
    public int[] solution(String[] wallpaper) {
        boolean[][] mapp = new boolean[wallpaper.length][wallpaper[0].length()];
        int lux = 100, luy = 100, rdx = 0, rdy=0;
        
        for (int i=0; i<wallpaper.length; i++) {
            String temp = wallpaper[i];
            for (int j=0; j<wallpaper[0].length(); j++) {
                if (temp.charAt(j)=='#') {
                    mapp[i][j]=true;
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        
        int[] answer = new int[]{lux, luy, rdx+1, rdy+1};
        
        
        return answer;
    }
}