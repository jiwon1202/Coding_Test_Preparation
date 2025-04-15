def check(board, char):
    for i in range(3):
        if board[i][0] == board[i][1] == board[i][2] == char: return True
        if board[0][i] == board[1][i] == board[2][i] == char: return True
    if board[0][0] == board[1][1] == board[2][2] == char: return True
    if board[0][2] == board[1][1] == board[2][0] == char: return True
    return False

def solution(board):
    answer = 1
    
    cnt_o = sum(row.count("O") for row in board)
    cnt_x = sum(row.count("X") for row in board)
    
    # x의 개수가 o의 개수보다 많거나 o의 개수가 x의 개수보다 2개 이상 많은 상황
    if cnt_x > cnt_o or cnt_o - cnt_x > 1:
        return 0
    
    # o와 x의 개수가 같은 상황에서 o가 이미 승리한 상황
    if cnt_o == cnt_x and check(board, 'O'):
        return 0
    
    # o의 개수가 x의 개수보다 1개 더 많은 상황에서 x가 이미 승리한 상황
    if cnt_o == cnt_x+1 and check(board, 'X'):
        return 0

    return answer
