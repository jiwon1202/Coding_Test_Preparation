# https://school.programmers.co.kr/learn/courses/30/lessons/178870

def solution(sequence, k):
    answer = []
    total = 0
    s = 0
    e = 0
    
    for e, num in enumerate(sequence):
        total += num
        
        while total >= k:
            if total == k:
                if not answer or answer[1] - answer[0] > e - s:
                    answer = [s,e]
                break
                
            total -= sequence[s]
            s += 1
        
    return answer