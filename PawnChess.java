import java.util.*;

class PawnChess{
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[][]arr = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        
        int steps = 0;
        
        for(int i=0; i<m; i++){
            int temp = arr[0][i];
            
            for(int j=1; j<n; j++){
                if(arr[j][i] == 1){
                    steps += j-temp;
                    temp++;
                }
            }
        }
        
        System.out.println(steps);
    }
}
