function solution(array, n) {
    var answer = 0;
    let count = {}
    for (arr of array) {
        if (count[arr]===undefined) {
        count[arr]=1}
        else {
            count[arr]+=1
        }
    }
    if (count[n]===undefined) {
        answer=0
    }
    else {
        answer=count[n]
    }
    return answer;
}