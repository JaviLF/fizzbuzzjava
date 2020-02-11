
public class Program {
	public static void main(String[] args)
	{
		int number=100;
		fizzbuzz fb= new fizzbuzz();
		String listaFizzBuzz[] = fb.fizzBuzzList(number);
		for(int i=0;i<number;i++)
		{
			System.out.println(listaFizzBuzz[i]);
		}
    }	
}
