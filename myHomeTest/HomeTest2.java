/**
 * Java. Test from Igor Mazurok
 * https://habrahabr.ru/post/211747/
 * @author Iurii Leskovetc
 * @version 1.0 dated Aug 03, 2017
 */
 
     /**
     *  n    | One time, msc | Two time, msc 
     * 12000 | 288.261926    | 3618.870332
     * 8000  | 129.43683     | 1306.946214
     * 2000  | 23.858283     | 41.569679
     * 1200  | 12.374262     | 11.976679 был вариант 13.202382
     *  200  | 1.190051      | 0.768159 был вариант 1.251633
     *   20  | 0.011884      | 0.009184 был вариант 0.016206
     *    8  | 0.003241      | 0.003241
     */

import java.util.Arrays;

class HomeTest2{
	public static void main(String[] args){
	
	int n1 = 12000;
    int n2 = 12000;
    int g1[][] = new int[n1][n1];
    int g2[][] = new int[n2][n2];
    long st1, en1;
    long st2, en2;
    
    //one
    st1 = System.nanoTime();   
    for(int i = 0; i < n1; i++) {
        for(int j = 0; j < n1; j++) {
            g1[i][j] = i + j;
        }
    }    
    en1 = System.nanoTime();
     //two
    st2 = System.nanoTime();    
    for(int i = 0; i < n2; i++) {
        g2[i][i] = i + i;
        for(int j = 0; j < i; j++) {            
            g2[j][i] = g2[i][j] = i + j;
        }
    }
    en2 = System.nanoTime();
    
    System.out.println("\nOne time " + (en1 - st1)/1000000.d + " msc");   
    System.out.println("\nTwo time " + (en2 - st2)/1000000.d + " msc");

     
    
     /**
     * ¬ывод массивa на экран
     * import java.util.Arrays;
     */
     
    //for(int i = 0; i < n; i++)
    //System.out.println(Arrays.toString(g2[i]));

     /**
     * ¬ывод по тесту - последовательный перебор в VJM
     * с присвоением значени€ в массиве быстрее, чем выборочные "оптимизированные". 
     */

	}
}	