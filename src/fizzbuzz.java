
public class fizzbuzz {
	
	public String[] fizzBuzzList(int number)
	{
		String aux[];
		aux = new String[number];
		for(int i = 0; i < number; i++)
		{
			aux[i]=fizzBuzz(i);
        }
		return aux;
    }
	
	public String fizzBuzz(int number)
	{
		String response ="";
		if (number % 3 != 0 && number % 5 != 0)
		{
			response=String.valueOf(number);                    
		}
		else
		{
			if(number % 3 == 0)
			{
				response=response+"Fizz";
			}
			if(number % 5 == 0)
			{
				response=response+"Buzz";
			}
		}
		return response;
	}
	
}
