package UI;

public class FormAtor extends Form{
    
    private String id;
    private String nome;
    private String nacionalidade;
    private String idPerformance;
    private CDUcadasrearAtor cduAt;
    public void setcdu(CDUcadastrarAtor cduAt){
        this.cduAt = cduAt; 
    }

    public void exibe(){
        Console c = System.console();
        boolean termina = false;
        String continuar;     
        boolean leator = true;
        boolean leepisodio = false;  
        String idAtor = null;

        System.out.println("Cadastrando atores:")

        while(!termina){

            if(leator){
                idAtor = c.readLine("Qual o ator?(id):");
                //conferir se ator ja existe....
            }
            if(idAtor){
                id = c.readLine("@" + id + ">ID: ");
                numEP = c.readLine("@"+nomeserie+">Nº do Episodio:");
                temporada = c.readLine("@" + nomeserie + ">Temporada: ");
                titulo = c.readLine("@" + nomeserie + ">Titulo: ");
                resumo = c.readLine("@" + nomeserie + ">Resumo: ");

                continuar = c.readLine("(S)erie (E)pisodio (T)erminar): ");

                if(continuar.toLowerCase().equals("s")){
                    leserie = true;
                    leepisodio = false;
                    termina = false;                    
                }
                else
                    if(continuar.toLowerCase().equals("e")){
                        // salvar episodio no banco de dados.
                        cduce.salvarEpisodio(); // EM OBRAS.
                        leserie = false;
                        leepisodio = true;
                        termina = false;                    
                    }
                    else
                       termina = true;
            } // if(episodio)
            }
        }
    }

}
