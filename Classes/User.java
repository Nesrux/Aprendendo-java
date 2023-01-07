package Classes;

public class User {
	String nome;
	String email;
	
	User(){};
	User(String nome, String email){
		this.email = email;
		this.nome = nome;
	}
	
	/*O método equals, recebe um objeto do tipo objeto
	 * depois verifica se o objeto pode ser "castado"/ usado cast nele para ele virar
	 * um objeto do tipo User
	 * se sim, ele realiza a operação e retorna true
	 * se nao, ele retorna false*/
	public boolean equals(Object objeto) {	
			if(objeto instanceof User) {
				User outro = (User) objeto;
				boolean nomeIgual = outro.nome.equals(this.nome);
				boolean emailIgual = outro.email.equals(this.email);
				return nomeIgual && emailIgual;
			}
			else {
				return false;
			}
	}
//Falta o hashCode
	
	public int hashCode() {
		return this.nome.length();
	}
}
