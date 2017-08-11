/**
 * Java. Level 1. Lesson 1. Example of homework
 * GeekBrains course
 * @author Iurii Leskovetc
 * @version 1.0 dated Jul 31, 2017
 */

class JavaL1HomeWork1{
    
    /**
     * 1. Создать проект java и прописать метод main(); 
     */
    
    public static void main(String[] args){        
        createVariable();    
        
        System.out.println("calculate - " + calculate(3.3f, -4.67f, 500.0f, 77.1f));
        
        System.out.println("chekSum 1 + 9 - " + chekSum(1, 9));
        System.out.println("chekSum 1 + 30 - " + chekSum(1, 30));
        
        chekNum(0);
        chekNum(-23);
        
        System.out.println("number 0: " + chekNumBool(0)); 
        System.out.println("number -23: " + chekNumBool(-23)); 	
        
        namePrint("Vasya");
        
        checkLeapYear(2017); // not div 4  
        checkLeapYear(1900); // div 4 but div 100
        checkLeapYear(1996); // div 4 and not div 100
        checkLeapYear(2000); // div 400
   
 }
 
    /**
     * 2. Создать и проинициализировать переменные типов
     *    byte, short, int, long, float, double, char, boolean, string
     */
    static void createVariable() { 
        byte bite8 = 127;   // -128 to 127 or 2^8
		short s16 = 32767; //-32768 to 32767 or 2^16
		int i32 = 2147483647; // -2147483648 to 2147483647 or 2^32
		long l64 = 9223372036854775807L;  //L -9223372036854775808 to 9223372036854775807 or 2^64
		float f32 = 12.123456789f; // f, from 1.4E-45 to 3.4028235E+38, 32 bit
		double d64 = 12.123456789012345678901234567890; // from 4.9E-324 to 1.7976931348623157E+308, 64 bit
		boolean bool = true; //  true or false
		char ch1 = 65535; // 0 to '\uffff' or 65,535
		char ch2 = '\uffff'; // 0 to '\uffff' or 65,535
        String javaString = "Простота\n" 
        + "Безопасность\n" 
        + "Переносимость\n"
        + "Характер ООП\n" 
        + "Надежность\n" 
        + "Многопоточность\n" 
        + "Архитектурная независимость\n" 
        + "Интерпретируемость и высокая производительность";
        
        System.out.println("byte 127 - " + bite8);
        System.out.println("short 32767 - " + s16);
        System.out.println("int 2147483647 - " + i32);
        System.out.println("long 9223372036854775807L - " + l64);
        System.out.format("float 12.123456789f - " + "%2.9f\n", f32); //result 12,123456955
        System.out.format("double 2.123456789012345678901234567890 - " + "%2.30g\n", d64); //result 12,1234567890123460000000000000
        System.out.println("boolean true - " + bool);
        System.out.println("char 65535 - " + ch1);
        System.out.println("char \uffff - " + ch2);
        System.out.println("String: - " + javaString);
    }
 
    /**
     * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий
     *    результат, где a, b, c, d – входные параметры этого метода
     */
    static float calculate(float a, float b, float c, float d){
        if (d == 0) return 0;
        return a * (b + (c / d));
	}
    
    /**
     * 4. Написать метод, принимающий на вход два числа, и проверяющий что их
     *    сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
     *    true, в противном случае – false
     */
    static boolean chekSum(int a, int b){        
        int sum = a + b;
        if(sum >= 10 && sum <=20) return true;
        else return false;

        //return ((a + b >= 10) && (a + b <= 20));		
	}
    
    /**
     * 5. Написать метод, которому в качестве параметра передается целое число,
     *    метод должен напечатать в консоль положительное ли число передали,
     *    или отрицательное. Замечание: ноль считаем положительным числом
     */
    static void chekNum(int number){
		if (number >= 0) System.out.println("number: " + number + " is not negative");
		else System.out.println("number: " + number + " is negative");
        
        //System.out.println(number + " is " + ((number < 0)? "Negitive" : "Positive"));
	}
    
    /**
     * 6. Написать метод, которому в качестве параметра передается целое число,
     *    метод должен вернуть true, если число отрицательное
     */
    static boolean chekNumBool(int number){
        if (number >= 0) return true;
        else return false;
        
        //return number < 0;
	}
    
    /**
     * 7. Написать метод, которому в качестве параметра передается строка,
     *    обозначающая имя, метод должен вывести в консоль сообщение
     *    «Привет, указанное_имя!»
     */
    static void namePrint(String name){
        System.out.println("Привет, " + name + "!"); 
	}
    
    /**
     * 8* Написать метод, который определяет является ли год високосным, и
     *    выводит сообщение в консоль. Каждый 4-й год является високосным,
     *    кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    static void checkLeapYear(int year){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0 ){
            System.out.println("Год: " + year + " високосный (year is a leap)");
        }
        else System.out.println("Год: " + year + " не високосный (year isn't a leap)");
	}
}