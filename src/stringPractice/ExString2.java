// 2.  Use length()
/* to get sum of all string in the array
 Expected output :
    hello:5
    world:5
    life:4
    university:10
    total : 24
*/

package stringPractice;

public class ExString2 {
    public static void main(String[] args){


        String[] arr = {"hello", "world", "life", "university"};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " : " + arr[i].length());
            sum += arr[i].length();
        }
        System.out.println("total :" + sum);
    }
}
