package leralunoreverso;

import java.io.*;
import java.util.ArrayList;

public class LerEscreverAluno {

    JDBc con = new JDBc();

    public ArrayList<Aluno> listaA = new ArrayList<>();
    public String diretorio;
    public String diretorioE;

    public LerEscreverAluno() {
        this.diretorio = "C:\\Users\\ifsp\\Desktop\\Alunos.txt";
        this.diretorioE = "C:\\Users\\ifsp\\Desktop\\AlunosResultado.txt";
    }

    public void lerAluno() throws Exception {

        //Classes de Suporte        
        Aluno a = new Aluno();

        //Classes para leitura
        File file = new File(diretorio);
        BufferedReader br = new BufferedReader(new FileReader(file));

        //Lendo o arquivo
        String st;
        while ((st = br.readLine()) != null) {
            String[] linhas = st.split(";");

            for (int i = 0; i < linhas.length; i++) {
                String[] parts = linhas[i].split("\\|");
                Aluno b = new Aluno();
                a.matricula = parts[0];
                a.nome = parts[1];
                a.disciplina = parts[2];
                a.nota1 = parts[3];
                a.nota2 = parts[4];
                a.fazerFicha();
                a = b;
                listaA.add(b);
            }
        }
        br.close();
    }

    public void escreverAluno() throws Exception {
        //Classes para escrita
        File filenew = new File(diretorioE);
        filenew.createNewFile();
        FileWriter fw = new FileWriter(filenew);
        Aluno a;

        int index = 0;

        //Escrevendo o arquivo
        for (int i = 0; i < listaA.size(); i++) {
            a = listaA.get(index);
            fw.write(a.matricula + " | " + a.media + " | " + a.situacao + " ; ");
            index++;
        }
        fw.close();

    }

    public void atualizaAluno(String matricula, String nome, String disciplina, String nota1, String nota2, int index) {
        listaA.get(index).matricula = matricula;
        listaA.get(index).nome = nome;
        listaA.get(index).disciplina = disciplina;
        listaA.get(index).nota1 = nota1;
        listaA.get(index).nota2 = nota2;
        listaA.get(index).fazerFicha();
    }

    public void criarAluno(String matricula, String nome, String disciplina, String nota1, String nota2) {
        Aluno a = new Aluno();

        a.matricula = matricula;
        a.nome = nome;
        a.disciplina = disciplina;
        a.nota1 = nota1;
        a.nota2 = nota2;
        a.fazerFicha();
        listaA.add(a);
    }

}
