package sender;

public class Facebook implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Facebook: " + message);
    }
}
