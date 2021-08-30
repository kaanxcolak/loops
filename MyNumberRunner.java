package kaan.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);

		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sumUptoN " + sum);

		int sumOfDivisor = number.sumOfDivisor();
		System.out.println("sumOfDivisor " + sumOfDivisor);

		number.printNumberTriangle();

	}

}
