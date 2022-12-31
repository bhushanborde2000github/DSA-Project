
	import java.util.*;
	public class Q_3rd_REVERSE_WORDS_IN_A_GIVEN_STRING {


	// Reverse the letters
	// of the word
	static void reverse(char str[],
						int start,
						int end)
	{
	// Temporary variable
	// to store character
	char temp;

	while (start <= end)
	{
		// Swapping the first
		// and last character
		temp = str[start];
		str[start] = str[end];
		str[end] = temp;
		start++;
		end--;
	}
	}
	// Function to reverse words
	static char[] reverseWords(char []s)
	{

	int start = 0;
	for (int end = 0; end < s.length; end++)
	{
	
		if (s[end] == ' ')
		{
		reverse(s, start, end);
		start = end + 1;
		}
	}

	// Reverse the last word
	reverse(s, start, s.length - 1);

	// Reverse the entire String
	reverse(s, 0, s.length - 1);
	return s;
	}

	// Driver Code
	public static void main(String[] args)
	{
	String s = "i like this program very much ";
	char []p = reverseWords(s.toCharArray());
	System.out.print(p);
	}
	}

