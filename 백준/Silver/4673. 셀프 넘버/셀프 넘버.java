
public class Main {

    public static void main(String[] args) throws Exception{
       //생성자 = 각 자리+ 숫자하면 n이 나오게 되는 수
        //10000보다 작거나 같은 생성자가 없는 넘버를 하나씩 출력하기
        int[] arr= new int[10001];
        for (int i=1; i<=10000; i++) {
            int answer=i;
            String temp = Integer.toString(i);
            for (int j=0; j<temp.length(); j++) {
                int a = temp.charAt(j)-'0';
                answer+=a;
            }
            if (answer<=10000){
            arr[answer]++;}
        }
        for (int i=1; i<10001; i++) {
            if (arr[i]==0) {
                System.out.println(i);
            }
        }

   }

}

