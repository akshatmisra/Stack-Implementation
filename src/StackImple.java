import java.util.Scanner;

public class StackImple {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = sc.nextInt();
        char [] str = new char[s.length()];
        str = s.toCharArray();
        
        StringBuilder max = new StringBuilder();
        for(int j = 0 ; j< len; j++)
        {
            max.append(str[j]);
        }
        //System.out.println(max.toString());
        StringBuilder min = new StringBuilder();
        for(int j = 0 ; j< len; j++)
        {
            min.append(str[j]);
        }
        //System.out.println(min.toString());
        
        for(int i = 1 ; i< str.length - len +1;i++)
        {
            StringBuilder next = new StringBuilder();
            for(int j = i ; j< i+len; j++)
            {
                next.append(str[j]);
            }
            System.out.println(next.toString());
            if(next.toString().compareTo(max.toString()) > 0)
                max = next;
            
            if(next.toString().compareTo(min.toString()) < 0)
            {
                min = next;
                
            }
        }
        
        System.out.println(min.toString());
        System.out.println(max.toString());
        sc.close();
		
    }
	

}
