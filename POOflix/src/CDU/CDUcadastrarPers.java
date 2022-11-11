package CDU;

import domain.*; 
import UI.FormPersonagem;
public class CDUcadastrarPers extends CDU{
	private Personagem person;
	private FormPersonagem formPerson;
	
	public CDUcadastrarPers(FormPersonagem formPerson) {
		this.formPerson=formPerson;
		this.formPerson.setPers(this);
		
	}
	
	public void exec() {
		formPerson.exibe();
	}
	
	
	public String getPerf(int idPerf){
		//return bd.getPerf(idPerf);
		return "1";
	}
	
	
    public void salvarPersonagem() {
        int id = formPerson.getId();
        String nome = formPerson.getNome();

        person = new Personagem(id,nome);

        //bd.salvarSerie(serie);
        System.out.println("Salvando no banco de dados.." + person);
    }
}