// 교집합 수/합집합 수, 모두 공집합은 1 (2글자씩 끊어서 원소로 만듬) 
// 공백, 숫자, 특수문자는 버림, 대문자로 변환
import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        //2개씩 끊기
        for (int i=0; i<str1.length()-1; i++) {
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            
            if (first >='a' && first <='z' && 
               second >='a' && second <='z') {
                arr1.add(first+""+second);
            }
        }
        
        for (int i=0; i<str2.length()-1; i++) {
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            
            if (first >='a' && first <='z' && 
               second >='a' && second <='z') {
                arr2.add(first+""+second);
            }
        }
        
        ArrayList<String> set = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();
        
        //합집합 개수 구하기
        for (int i=0; i<arr1.size(); i++) {
            if (arr2.remove(arr1.get(i))) {
                union.add(arr1.get(i));
            }
            set.add(arr1.get(i));
        }
        
        for (int i=0; i<arr2.size(); i++) {
            set.add(arr2.get(i));
        }
        double d=0;
        if (union.size()==0 && set.size()==0) return 65536;
        else  d = (double)union.size()/(double)set.size();
        answer = (int) (d*65536);
        return answer;
    }
}