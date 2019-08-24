package leralunoreverso;


public class Aluno {

    public String matricula;
    public String nome;
    public String disciplina;
    public String nota1;
    public String nota2;
    public float media;
    public String situacao;

    public void calculoMedia() {
        float resultado;
        resultado = (Float.parseFloat(nota1) + Float.parseFloat(nota2)) / 2;
        this.media = resultado;
    }

    public void situacao() {
        calculoMedia();
        if (media < 4) {
            situacao = "Reprovado";
        } else if (media < 6) {
            situacao = "Recuperação";
        } else if (media >= 6) {
            situacao = "Aprovado";
        }
    }

    public void fazerFicha() {
        calculoMedia();
        situacao();
    }

}
