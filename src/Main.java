public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Message m = new Message("hello");
        //si le message est statique,
        //
        Observer s1 = new MessageSubscriber1(); //interface observe=> a
        MessageSubscriber1 s2 = new MessageSubscriber1(); //ceux qui souscrivd o msg = les observers
        MessageSubscriber1 s3 = new MessageSubscriber1();
        MessageSubscriber1 s4 = new MessageSubscriber1();
        MessagePublisher1 p1 = new MessagePublisher1();
        MessagePublisher1 p1_1= new MessagePublisher1();
        p1.attach(s1); //attacher 1 observer
        p1.attach(s2);
       // p1.detach(s2); exemplesi s2 pas notifié
        //le p1 va notifier les autres avec un messagee
        p1.notifyUpdate(new Message("premier message"));
        //le s2 s'inscrit au flux de message, au publisher p1
        //observable c une liste des observers
        System.out.println("nb observateurs - "+p1.getNumObservers());
        p1_1.attach(s2);
        p1_1.notifyUpdate(new Message("premier message du diffuseur 2"));
    }
}