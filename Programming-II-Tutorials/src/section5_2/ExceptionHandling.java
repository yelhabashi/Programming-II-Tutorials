package section5_2;

public class ExceptionHandling {

	public static void main(String[] args) {

		int[] arr = new int[10];

		try {
			printElement(arr);
		} catch (Exception e) // Exception is the parent class for all types of exceptions. If you know which
								// exception will occur you can catch it, for instance
								// catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ERROR!! You are trying to access an element outside of the array");
		} finally // Here we write code that we want to happen anyway whether an error occurred or
					// not
		{
			System.out.println("After finally");
		}

		System.out.println("After try and catch"); // Will be printed anyway
	}

	public static void printElement(int[] arr) throws Exception { // When I say "function throws Exception" means that I
																	// am telling the compiler to force anyone who uses
																	// this method to use try and catch clause to handle
																	// possible exceptions

		System.out.println(arr[15]); // Accessing element out of bounds
	}

}
