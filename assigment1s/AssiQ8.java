package assigment1s;

public class AssiQ8 {

	public static void main(String[] args) {
		int [] a = {1,2,5,3,5,6,2};
		int count=0;
		System.out.println("enter duplicate number");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("occurance ="+a[i]);
					count++;
				}
				//count++;
			}
		}
		System.out.println("total count is = "+count);

	}

}

/*out put:-
enter duplicate number
occurance =2,
occurance =5,
total count is = 2
*/
