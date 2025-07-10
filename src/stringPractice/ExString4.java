/* 4. split, join
 Use `split` to separate fruits
 `join` to combine the separated characters into one.
  result
Fruit: apple
Fruit: banana
Fruit: orange
Fruit: grape
apple->banana->orange->grape
* */

package stringPractice;

public class ExString4 {

    public static void main(String[] args) {
        String fruits = "apple,banana,orange,grape";
        // split : separate fruit
        // Join  : combines fruit the separated characters into one

        String[] splitFruit = fruits.split(",");
        for (String split : splitFruit) {
            System.out.println("Fruit : "+ split);
        }

        String joinFruit = String.join("->", splitFruit);
        System.out.println(joinFruit);

    }
}
