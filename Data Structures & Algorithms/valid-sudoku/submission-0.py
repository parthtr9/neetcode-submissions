class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        seen = set()
        for i in range(9):
            for j in range(9):
                number = board[i][j]
                if number == '.':
                    continue
                row = (i, number)
                col = (number, j)
                txt = (i//3, j//3,number)
                
                if row in seen or col in seen or txt in seen:
                    return False
                seen.add(row)
                seen.add(col)
                seen.add(txt)
        return True


            

        