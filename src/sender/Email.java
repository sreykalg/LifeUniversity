package sender;

public class Email implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email : " + message);
    }
}
