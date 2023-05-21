import java.rmi.Remote;
import java.rmiregistry.RemoteException;
public interface ChatService extends Remote {
void sendMessage(String message) throws RemoteException;
String receiveMessage() throws RemoteException;
}