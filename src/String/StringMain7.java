package String;

public class StringMain7 {

    public static void main(String[] args) {
        ValueAdd valueAdd = new ValueAdd();
        int result = valueAdd.add(1).add(2).add(3).getValue();
        System.out.println("valueAdd.getValue() = " + result);
    }
}
// result
/*
valueAdd.getValue() = 6
*/