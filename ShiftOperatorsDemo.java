public class ShiftOperatorsDemo {
    public static void main(String[] args) {
       
        int num = 16;

        
        System.out.println("Original number: " + num);
        
        
        int leftShiftResult = num << 1;
        System.out.println("Left shift by 1: " + leftShiftResult);
        
       
        leftShiftResult = num << 2;
        System.out.println("Left shift by 2: " + leftShiftResult);
        
      
        
       
        int rightShiftResult = num >> 1;
        System.out.println("\nRight shift by 1: " + rightShiftResult);
        
      
        rightShiftResult = num >> 2;
        System.out.println("Right shift by 2: " + rightShiftResult);
    }
}