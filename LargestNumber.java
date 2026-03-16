// LargestNumber
public class LargestNumber{

public static void main(String[]args){

int [] arr = {10,22,3,40};
  int max = arr[0];
for(int i=1;i<arr.length;i++){
 if(arr[i]>max)
{
 max = arr[i];
}

}
   System.out.println("LargestNumber: " + max);


}

}