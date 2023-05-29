import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
    HashMap<String,Integer> mapp = new HashMap<>();
    //최소 한개는 고르되, 각 key값의 value에서 하나씩해도 되고 안해도 되고,조합의 수는? 
    //이미 그 키에서 가지고 있으면, put(키, 값)
    for (int i=0; i<clothes.length; i++){
        if (mapp.containsKey(clothes[i][1])) {
        mapp.put(clothes[i][1], mapp.get(clothes[i][1])+1);
            }
        else {
            mapp.put(clothes[i][1], 1);
        }
    }
    
    int answer = 1;
    for (String s : mapp.keySet()) {
            answer *= (mapp.get(s)+1); //착용안하는 경우의 수 +1(o/x)
        }
    return answer -1; //모두 착용하지 않는 경우-1
    }
}