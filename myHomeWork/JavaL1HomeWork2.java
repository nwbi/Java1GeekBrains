/**
 * Java. Level 1. Lesson 2. Example of homework
 * GeekBrains course
 * @author Iurii Leskovetc
 * @version 1.0 dated Jul 31, 2017
 */
 
//import java.util.*;
 
class JavaL1HomeWork2{

    public static void main(String[] args){
        int[] massiv = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        
        printMassiv(massiv);
        //System.out.println(Arrays.toString(massiv)); //variant 2 with import java.util.*;     
        
        changeArray(massiv);        
        printMassiv(massiv); 

        int[] massSys = new int[8];
        fill(massSys); 
        printMassiv(massSys);
        
        int[] massNumbers = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        printMassiv(massNumbers);
        dbl(massNumbers);
        printMassiv(massNumbers);
                
        int size = 10;
        int[][] square = new int[size][size];
        printMassiv2D(square);
        cross(square);
        printMassiv2D(square);
        
        System.out.println("������������ �������� � �������: " + findMax(massNumbers) + "\n");
        System.out.println("����������� �������� � �������: " + findMin(massNumbers) + "\n");
        
        int[] massivNull = { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0 };
        printMassiv(massNumbers);
        System.out.println("�������� �������: " + chekMass(massNumbers) + "\n");
        //System.out.println("�������� �������: " + chekMass(massivNull) + "\n");
        
        moveMass(massNumbers, 2);
         
    }
    
    /**
     * 1. ������ ������������� ������, ��������� �� ��������� 0 � 1. 
     * ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
     * � ������� ����� � ������� �������� 0 �� 1, 1 �� 0; 
     */     
    static void changeArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
            }
        }
        
    /**
     * ������ ����������� ������� �� �����.
     */  
    static void printMassiv(int[] mass){
        System.out.println("Print massiv:");
        for(int i : mass) System.out.print(i + " ");
        System.out.println("\n");
    }
    
    /**
     * 2. ������� ������������� ������ �� 8 ����� �����.
     * � ������� ����� ��������� ��� ����������
     * 0 3 6 9 12 15 18 21;
     */
    static void fill(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
    }
    /**
     * 3. ������ ������ int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
     * ������ �� ���� ������, � �����, ������� ������ 6, �������� �� 2.
     */
        static void dbl(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] = array[i] * 2;
        }
    }
    
    /**
     * 4. ������� ���������� ��������� �������������
     * ������ (���������� ����� � �������� ����������),
     * � � ������� �����(-��) ��������� ��� ������������ �������� ���������;
     */
        static void cross (int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
    }

    /**
     * ���������������� ������� �� �����.
     */  
    static void printMassiv2D(int[][] squareMass){ 
        System.out.println("Print massiv 2D:");
            for (int i = 0; i < squareMass.length; i++) {
            for (int j = 0; j < squareMass[i].length; j++) {
                System.out.print(squareMass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n"); 
    }
    /**
     * 5.** ������ ���������� ������ � ����� � ���
     * ����������� � ������������ ��������;
     */
    static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    
    /**
     * 6 ** �������� �����, � ������� ���������� �� ������ ���������� ������������� ������, 
     * ����� ������ ������� true ���� � ������� ���� �����, � ������� ����� ����� 
     * � ������ ����� ������� �����. �������: checkBalance([1, 1, 1, || 2, 1]) > true, 
     * checkBalance ([2, 1, 1, 2, 1]) > false, checkBalance ([10, || 10]) > true, 
     * ������� �������� ��������� ||, ��� ������� � ������ �� ������. 
     */
    static boolean chekMass(int[] array){
        int testMass = 0;
        int sum1 = 0, sum2 = 0;
        int sizeDiv = array.length / 2;
        System.out.println("sizeDiv: " + sizeDiv);
        System.out.println("array.length: " + array.length);
        
        for(int i : array) testMass += i;
             
        if (testMass == 0) return false;
        
        for (int i = 0; i < sizeDiv; i++) {
            sum1 += array[i]; 
            System.out.println("for in sym1: " + sum1);             
        }
        
        System.out.println("sym1: " + sum1);
        
        for (int i = array.length - 1; i >= sizeDiv; i--) {
            sum2 += array[i];
            System.out.println("for in sym2: " + sum2);            
        }

        System.out.println("sym2: " + sum2);
        
        if (sum1 == sum2) return true;
        
        return false;
    } 
    
    /**
     * 7 **** �������� �����, �������� �� ���� �������� ���������� ������ � ����� n 
     * (����� ���� �������������, ��� �������������), ��� ���� ����� ������ 
     * �������� ��� �������� ������� �� n �������. 
     * ��� ���������� ������ ������ ������������ ���������������� ���������. 
     */
    static int[] moveMass(int[] array, int n){
        return array;
    }
 
}