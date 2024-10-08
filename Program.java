//var 20
//task1. Remainder from division ->
//C5 = 0 
//C7 = 6 -->  matrix type - float
//C11 = 9

public class Program {
    public static void main(String[] args) 
    {
        try{
            float[][] matrixArray = {
                {2.53f, 3.77f},
                {4.23f, 5.56f},
                {7.45f, 2.03f}
            } ;
            
            //scalar multiplication output
            matrixArray = scalarMultiplication(matrixArray, 2 ); // changing matrix array into modified one to use further in C11
            System.out.println("\nScalar multiplication C5\n");
            for(int i = 0; i<matrixArray.length; i++){
                for(int j = 0; j<matrixArray[i].length; j++)
                {
                    System.out.print(matrixArray[i][j] + "\t");
                }
                System.out.println();
            }

            //averahe column number output
            System.out.println("\nAverage columns number C11\n");
            for(int i =0; i< avgColumnNumber (matrixArray).length;i++)
            {
                System.out.format("Column number %d average is %f\n", i+1, avgColumnNumber(matrixArray)[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds - " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("Error: Null value encountered - " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Error: Arithmetic error - " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    //C5 = 0 
    public static float[][] scalarMultiplication(float[][] matrix, int CONSTANT)
    {
        try{
            for(int i=0; i<matrix.length; i++)
            {
                for(int j=0;  j<matrix[i].length;j++)
                {
                    matrix[i][j] = matrix[i][j]*CONSTANT;
                }
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        return matrix;
        
    }

    //C11 = 9
    public static float[] avgColumnNumber(float[][] matrix) 
    {
        
            float[] avgColumnNumber = new float[matrix[0].length];
        try{
            for(int i = 0; i<matrix.length;i++)
            {
                for(int j = 0; j<matrix[i].length; j++)
                {
                    avgColumnNumber[j] +=matrix[i][j];
                    if(i==matrix.length-1)
                    {
                        avgColumnNumber[j] = avgColumnNumber[j]/matrix.length;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Error in calculating column averages: " + e.getMessage());
        }
        return  avgColumnNumber;
    }

}
