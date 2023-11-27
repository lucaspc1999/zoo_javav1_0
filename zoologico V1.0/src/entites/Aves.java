package entites;

public class Aves extends Animal{
    private String corDoBico;
    private int qntDeOvos;

    public Aves (String nome, String especie, String corPredomiante,String sexo, String corDoBico, int qntDeOvos){
        super( nome, especie, corPredomiante, sexo);
        this.corDoBico=corDoBico;
        this.qntDeOvos=qntDeOvos;
    }

    public String getCorDoBico() {
        return corDoBico;
    }
    public int getQntDeOvos() {
        return qntDeOvos;
    }
}
