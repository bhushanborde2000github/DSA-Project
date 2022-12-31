
public class Q_1st_EQUILIBRIUM_POINT	{  
	//function to find the equilibrium index  
	static int eqbmindex(int array[], int n)  
	{  
	int i, j;  
	
	int lsum, rsum;  
	for (i = 0; i < n; ++i)   
	{  
	lsum = 0;  
	
	for (j = 0; j < i; j++)  
	lsum = lsum + array[j];  
	rsum = 0;  

	for (j = i + 1; j < n; j++)  
	rsum = rsum + array[j];  

	if (lsum == rsum)  
	return i;  
	}  
	return -1;  
	}  
	public static void main(String args[])  
	{  
	int array[] = {1, 3, 5, 2, 2};  
	int arraysize = array.length;  
	System.out.print("Equilibrium Index is: ");  
	System.out.println(eqbmindex(array, arraysize));  
	}  
	}  