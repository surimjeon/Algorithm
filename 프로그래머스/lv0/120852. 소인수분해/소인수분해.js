function solution(n) {
    var answer = [];
    let divider = 2; 
    while (n>1) {
        if (n%divider===0) {
            if (!answer.includes(divider)) {
            answer.push(divider)            
        } //중복안되어있으면 추가
        n/=divider; // 중복되어있으면 n을 나누면서 divider로 계속 나누기
    }
        else {
            divider++;
        }
    }
    return answer;
}


// 첫 소수인 2부터 시작해서 2로 나눌 수 있을 때 까지
// 계속 n으로 나누고, 그 다음 수로 올려서 반복하면, 자연스럽게 나누어지는 수는 소수만 해당됩니다.