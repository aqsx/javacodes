import java.util.Scanner;
public class PAN_Digit
{
public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        long num;
        num = sc.nextLong();
        long digit, pos, part1, part2;
        for ( digit = (int)Math.log10(num)+1==10?0:10; digit <=9; digit++)
        {
                System.out.println("HI");
                pos =1;
                while ((num >= pos)&& (digit != ( num/pos)%10))
                        pos*=10;
                if ( pos > num)
                        break;
                part1 = num/pos;
                part2 = num % pos;
                part1/=10;
                num = part1 * pos + part2;
        }
        if ((digit ==10)&& ( num==0))
                System.out.println("PAN DIGIT");
        else 
                System.out.println("NOT PAN DIGIT");
        

}
}