package br.com.CoisasUteis;

public class Gerador_senha {
	private String senha = "";

	public Gerador_senha() {
		
		String[] carct ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		setSenha(carct);
		System.out.println(getSenha());
		
		}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String[] carct) {
		for (int x=0; x<10; x++){
		     int j = (int) (Math.random()*carct.length);
		     this.senha += carct[j];
		}

	}
}
