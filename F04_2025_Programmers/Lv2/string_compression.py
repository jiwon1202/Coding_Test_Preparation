# https://school.programmers.co.kr/learn/courses/30/lessons/60057

def solution(s):
    answer = len(s)
    
    for unit in range(1, len(s) // 2 + 1):
        sentence = ''
        cnt = 1
        
        for i in range(0, len(s), unit):
            current = s[i:i+unit]
            next = s[i+unit:i+unit*2]
            
            if current == next:
                cnt += 1
            elif cnt == 1:
                sentence += current
            else:
                sentence += str(cnt) + current
                cnt = 1
            
        if len(next) > 0:
            sentence += next
        
        answer = min(answer, len(sentence))
        
    return answer 