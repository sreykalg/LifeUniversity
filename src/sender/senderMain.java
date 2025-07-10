package sender;

public class senderMain{
    public static void main(String[] args) {
        Sender[] senders = {new Facebook(), new Email(), new Twitter()};

        //for-each loop
        for (Sender sender : senders) {
            sender.sendMessage("hello, world!");
        }
    }
}