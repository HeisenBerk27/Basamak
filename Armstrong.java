package dongu;
import java.util.Scanner;
public class Armstrong 
{

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		int a = 1643, basamakSayisi =0, tempa = a, basamakDegeri, toplam =0;
		
		while(tempa!=0)
		{
			tempa = tempa /10;
			basamakSayisi++;
			System.out.println(basamakSayisi);
		}
		
		tempa = a;
		
		while(tempa!=0)
		{
			basamakDegeri = tempa % 10;
			tempa /= 10;
			toplam = toplam + basamakDegeri;
			System.out.println(basamakDegeri);
		}
		System.out.println(toplam);
	}
	
	
}
