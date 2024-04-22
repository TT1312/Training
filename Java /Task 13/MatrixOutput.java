package com.company.wiproPracticeQuestion;

import java.util.Scanner;

public class MatrixOutput {
    private int rows;
    private int columns;
    private int[][]matrix;
    public MatrixOutput(int rows,int columns) {
        this.rows=rows;
        this.columns=columns;
        this.matrix=new int[rows][columns];
    }
    public void fillMatrix(int[][]elements)
    {
        if(elements.length!=rows||elements.length!=columns) {
            System.out.println("give values according to the length");
            return;
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++) {
                matrix[i][j]=elements[i][j];

            }
        }
    }
    public void printMatrix() {
        for(int i=0;i<rows;i++) {
            for(int j=0;j<columns;j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int i=s.nextInt();
        System.out.println("Enter number of columns");
        int j=s.nextInt();
        MatrixOutput display=new MatrixOutput(i,j);

        int[][]elments= new int[i][j];
        System.out.println("Enter matrix");
        for(int k=0;k<i;k++)
        {
            for(int l=0;l<j;l++) {
                elments[k][l]=s.nextInt();

            }
        }
        display.fillMatrix(elments);
        display.printMatrix();

    }

}
