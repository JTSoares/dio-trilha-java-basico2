public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"João", "Daniel", "Pedro", "Rubens"}; //Array de alunos

        for (int i = 0; i < alunos.length ; i++) { //alunos.length (tamanho)
            System.out.println(" Indice: " + i +"\nAluno:" + alunos[i]);
        }

        //Há também essa forma
        for (String aluno: alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }
    }

    
}
