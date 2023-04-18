function solution(quiz) {
    var answer = [];
    for (q of quiz) {
        var lst = q.split(' ')
        if (lst[1] === '-') {
            if (Number(lst[4]) == Number(lst[0]) - Number(lst[2])) {
                answer.push("O")
            }
            else {
                answer.push("X")
            } }
        else if (lst[1] === '+') {
            if (Number(lst[4]) == Number(lst[0]) + Number(lst[2])) {
                answer.push("O")
            }
            else {
                answer.push("X")
            } }
}
    return answer;
}