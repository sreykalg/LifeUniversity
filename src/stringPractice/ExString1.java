// 1. use startsWith()
/*
// use startsWith() to check if the url start with https://
    // test https://lifeun.edu.kh

 */
package stringPractice;

public class ExString1 {
    public static void main(String[] args){

        String url = "https://lifeun.edu.kh/";
        if(url.startsWith("https://")){
            System.out.println("Yes, it starts with https://");
        }
        else
        {
            System.out.println("no, it doesn't start with https://");
        }
    }

}
