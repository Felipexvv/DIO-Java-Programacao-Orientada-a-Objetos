package BasicoProjeto.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviado Mensagem pelo Facebook Messenger");
		
	}

	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Facebook Messenger");
		
	}

}
