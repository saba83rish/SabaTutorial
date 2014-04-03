package org.saba.tutorial;

/**
 * @author ShabbuDhee
 *
 */
public class DecToBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//decToBinary(45);
		binaryToDec(11);
	}
	
	public static void decToBinary(int number) {
		
		int binary[] = new int[20];
		int index=0;
		while(number>0){
			binary[index]=number%2;
			number = number/2;
			System.out.println("number"+number);
			System.out.println("index"+index);
			index++;
		}
		for(int i=index-1;i>=0;i--){
			System.out.println(binary[i]);
		}
	}
	
	public static void binaryToDec(int binary){
		int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                System.out.println("tmp"+tmp);
                decimal += tmp*Math.pow(2, power);
                System.out.println("decimal"+decimal);
                binary = binary/10;
                System.out.println("binary"+binary);
                power++;
            }
        }
        System.out.println(decimal);
	}

}
