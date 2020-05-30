/*
 * File: 2DArrayDemo.java
 * Author: Eric Haynes
 * Date: February 16, 2020,
 * Purpose: This program demonstrates how to create
 * and populate a 2D array in Java
 */

// Import statements

public class ArrayDemo{
public static void main(String[]args){

// Define constant array size
final int rowsInt=5;
final int columnsInt=10;


        //Display Welcome Message
        System.out.println("Welcome to the 2D Array Demo");

        // Create an array of doubles 2 D
        double[][]precip2D=new double[rowsInt][columnsInt];

        // Assign random values
        for(int i=0;i<rowsInt; i++){
        for(int j=0;j<columnsInt; j++){
        precip2D[i][j]=Double.parseDouble(String.format("%.2f",Math.random()*10));
        }
        }

        // Print the results for each cell in a table 5 x 10
        // Printing order displaying columns and rows
        for(int j=0;j<columnsInt; j++){
        for(int i=0;i<rowsInt; i++){
        System.out.print(precip2D[i][j] + "\t");
        }
        System.out.println(" ");
        }
        }
        }