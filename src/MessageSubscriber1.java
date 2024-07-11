//attention pas importer celui de

public class MessageSubscriber1 implements Observer {
    public void update(Message msg){
        System.out.println("Message subscriber1: " + msg.getMessageContent());
    }

    @Override
    public void upddate() {

    }
}
