///**
//*Subject \Publisher \Observable de javaUtil

public interface Subject {
 public void attach(Observer o );
 void detach();
 public  void notifyUpdate(Message msg);
 //transmet mess aux autres observeurs. (a update())
 //pas de final ici. car on va devoir reecrrire la méthode.

}
//on a cree des observers - qui sont des subscribers
//et MessagePubliser
