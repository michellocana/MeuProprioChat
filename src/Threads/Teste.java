package Threads;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class Teste {
	
	private Socket socket;
	
	public Teste ( Socket s ){
		
		this.socket = s;
		
	}
	
	public void confirma(){
		
		try {
			OutputStream os = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream( os );

			JSONObject transacao = new JSONObject();
			transacao.put( "cod", 0 );
			transacao.put( "nome", "outro" );
			
			dos.writeUTF( transacao.toString() );
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog( null, "N�o foi poss�vel enviar sua solicita��o: " + e.getMessage() );
		}
		
	}

}
