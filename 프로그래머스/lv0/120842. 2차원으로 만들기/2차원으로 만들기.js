// 2차원배열, 
function solution(num_list, n) {
    var answer = [];
    for (let j=0; j<num_list.length; j+=n) {
    let item = []
        for (let i=j; i<j+n; i++) {
            item.push(num_list[i])
        }
        answer.push(item)
    }
    return answer;
}