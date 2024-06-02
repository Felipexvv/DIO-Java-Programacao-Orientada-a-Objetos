package BasicoProjeto.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviado Mensagem pelo MSN Messenger");
		
	}

	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN Messenger");
		
	}

}
