function solution(array, height) {
    var answer = 0;
    for (he of array) {
        if (he>height) {
            answer+=1;
        }
    }
    return answer;
}