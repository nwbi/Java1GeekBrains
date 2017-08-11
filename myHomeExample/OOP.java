/**
 * Java. My test from GeekBains.ru course 
 * Java 1, teacher Sergey Irupin
 * @author Iurii Leskovetc
 * @version 1.0 dated Aug 11, 2017
 */
 
class OOP {
    
	public static void main(String[] args) {
        String startString = new String("wow");
        
        for (String item : args) {
            //System.out.println(item.compareTo("wow"));            
            if (item.compareToIgnoreCase(startString) == 0) System.out.println("Wow! " + item.compareToIgnoreCase(startString));
            // result of compareTo 0; 
            // result of compareToIgnoreCase 0; 
            //for test enter: java OOP wOw Wow WOW
            }         
	}
}