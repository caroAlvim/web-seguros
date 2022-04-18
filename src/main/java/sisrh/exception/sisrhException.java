package sisrh.exception;
import javax.xml.ws.WebFault;
@WebFault(name = "SISRH")

public class sisrhException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public sisrhException(String mensagem) {
		super(mensagem);
	}
}
