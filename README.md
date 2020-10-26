# Pawn Chess

A special chess board of n×m will have pawns placed across it in a random manner. Your objective is to find the minimum number of moves such that all the pawns end up in the farthest possible row.

Note: The chess board is shown such that you are sitting towards the bottom side of the n×m board, facing the board. Thus the side farthest from you is the top most side of the array. In other words, the final position of the board should be such that the pawns cannot go to any row above the one in which they are already present.

## Input Format

The first line of input will have 2 numbers , n and m. The next n lines of input will have m numbers. The m numbers will either be 0 or 1. 0 represents no pawn and 1 represents a pawn.

## Constraints

0 < n, m < 1000

## Output Format

One integer giving the answer of the minimum number of moves needed to get all the pawns till the farthest row possible

## Sample Input 0

4 3
0 0 0 
1 0 0
1 1 1
1 0 1

## Sample Output 0

9

## Explanation 0

Final form of board where all pawns have reached the farthest row possible will be :

1 1 1

1 0 1

1 0 0

0 0 0

It takes 9 moves to go from the input to this final board. Thus the answer is 9
