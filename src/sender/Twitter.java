package sender;

public class Twitter implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Twiiter: " + message);
    }
}
