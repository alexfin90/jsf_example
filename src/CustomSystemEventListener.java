import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructApplicationEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class CustomSystemEventListener implements SystemEventListener {
   @Override
   public void processEvent(SystemEvent event) throws 
      AbortProcessingException {
      if(event instanceof PostConstructApplicationEvent){
      System.out.println("Ciao");
      }      
   }

@Override
public boolean isListenerForSource(Object arg0) {
	// TODO Auto-generated method stub
	return false;
}
}