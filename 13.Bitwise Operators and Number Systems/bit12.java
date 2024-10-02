//Reset ith bit
// if it is 1 then turn into 0
//If it is 0 then turn into 1

// first we have to find the bit 
// For example number is 10110110 and we want 5th bit. then we simply do and 1000 with this numbers.
// here there is 4 or (5-1) zeroes we need after 1 and we can get by left shift operator. 1<<4 or 1<<5-1
// so in general 1<<n-1
//and then we have to perform ans>>n-1



//Then we have to think about reset there is two posibilities bit either can be 1 or 0

//if ith bit is 1 then we have to set it zero
// for this we have to 
// For example number is 10110110 and we want to set zero in 5th bit. then we simply do and 11101111 with this numbers.
// here there is 4 or (5-1) 1 we need after 0 and we can get by taken complement of left shift operator. ~1<<4 or ~1<<5-1
// so in general ~1<<n-1

//if ith bit is 0 then we have to set it one
// For example number is 10110110 and we want to set 4th bit. then we simply do OR 100 with this numbers.
// here there is 3 or (4-1) zeroes we need after 1 and we can get by left shift operator. 1<<4 or 1<<5-1
// so in general 1<<n-1




import java.util.*;
public class bit12{

        public static void main(String[] args)
          {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                int i = sc.nextInt();
                
                int x = findbit(num , i);
                System.out.println(x);

                if(x==1)
                {
                   // set zero
                   int z = ~(1<<(i-1));
                   System.out.println(num & z);
                }
                else{
                    //set one
                    int p = 1<<(i-1);
                     System.out.println(num | p);
                }
                
                
          }
        public static int findbit(int num,int i)
        {
           
           int m = 1<<(i-1);
           return (num & m)>>(i-1);
        }
}