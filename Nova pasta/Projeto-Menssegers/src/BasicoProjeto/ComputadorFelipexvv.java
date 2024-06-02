package BasicoProjeto;

import BasicoProjeto.apps.FacebookMessenger;
import BasicoProjeto.apps.MSNMessenger;
import BasicoProjeto.apps.ServicoMensagemInstantanea;
import BasicoProjeto.apps.Telegram;

public class ComputadorFelipexvv {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn")){
			smi = new MSNMessenger();
		}else if(appEscolhido.equals("fbm")){
			smi = new FacebookMessenger();
		}else if(appEscolhido.equals("tlg")){
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		System.out.println("-----------------------");
		System.out.println("MSN");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("FACEBOOK");
		
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		System.out.println("Telegram");
		
		Telegram tlg = new Telegram();
		
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
