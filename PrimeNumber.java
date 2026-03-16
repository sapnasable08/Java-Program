// PrimeNumber
public class PrimeNumber
{
 public static void main(String[] args){

   int num=20;
    Boolean is prime = true;
for(int i=2;i<=num/2;i++)
 {
  if(num% i==0){
    isPrime = false;
break;

}
if(isPrime) {
System.out.println("primeNumber");
}
else{
System.out.println("Not Prime");
}

}


}


}