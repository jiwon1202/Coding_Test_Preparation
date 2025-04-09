# https://school.programmers.co.kr/learn/courses/30/lessons/84512

def solution(word):
    answer = 0
    
    for i, w in enumerate(word):
        weight = ((5 ** (5 - i)) - 1) / 4
        idx = "AEIOU".index(w)
        answer += weight * idx + 1

    return answer 
