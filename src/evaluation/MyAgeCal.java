
package evaluation;

import java.time.LocalDate;

public class MyAgeCal
{

	public static void main(String[] args)
	{
		 int birthYear = 1994;
	     int nowYear = LocalDate.now().getYear();
	     int myAge = nowYear-birthYear;
	     System.out.println("내 나이는 "+ myAge+"살 입니다.");

	}

}

