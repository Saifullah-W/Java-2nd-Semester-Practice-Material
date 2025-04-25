package function;

public class Diagonal1stAndLastRowAndColumn {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Print the diagonal element");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==j){
                System.out.print(matrix[i][j]+" ");}
            }
        }

        System.out.println("\n Reverse of a matrix is ");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i+j==matrix.length-1){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

        System.out.println("\n first row of a matrix");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==0){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

        System.out.println("\n Last row of a matrix");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i==3){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

        System.out.println("\n First column of a matrix");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(j==0){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

        System.out.println("\n Last column of a matrix");
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(j==3){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
