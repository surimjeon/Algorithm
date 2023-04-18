
//장군개미 5의 공격력, 병정개미 3, 일개미 1 ->최소한의 병력
function solution(hp) {
    var answer = 0; //개미 수
    answer+=Math.floor(hp/5)
    hp%=5
    answer+=Math.floor(hp/3)
    hp%=3
    answer+=hp
    return answer;
    
}