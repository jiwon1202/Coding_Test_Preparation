def solution(targets):
    targets.sort(key=lambda x: x[1])
    
    count = 0  
    last_shot = -1

    for s, e in targets:
        if not (s < last_shot < e):
            last_shot = e - 0.000001  
            count += 1

    return count