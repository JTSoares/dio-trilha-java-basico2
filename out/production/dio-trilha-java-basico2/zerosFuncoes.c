/*
    Trabalho Zero de Funções - Métodos Numéricos

    Alunos:
    - Daniel Teles de Oliveira
    - João Victor Torres Soares
    - Rubens Maranesi Rodrigues 
 */

 #include<stdio.h>
 #include<math.h>

 //Prototipo das Funcoes
 double funcao(double x);
 double valorMedio(double a, double b); //Recebe o valor dos dois intervalos e calcula o valor medio dos dois 
 double calcularErro(double a, double b); //Calcula o erro 

 int main(){
    //********************Metodo da Bissecao***************************
    double a; 
    double b;
    double erro;
    double x_meio;

    printf("Iter |    a     |    b     |   x_meio  |  f(x_meio)  |  Erro max\n");
    printf("---------------------------------------------------------------\n");

    if (funcao(a) * funcao(b) < 0){

        while (calcularErro(a, b) > erro){
            x_meio = valorMedio(a, b); 
                        
        }
        
    }
    else{
        printf("O teorema de Bolzano não é aplicável nesse intervalo.\n"); //Teorema de Bolzano nao se aplica
    }
    
 }

 double funcao(double x){
    return pow(x, 2); 
 }

 double valorMedio(double a, double b){
    return (a+b) / 2;
 }

 double calcularErro(double a, double b){
    return (b-a) / 2; 
 } //Calcula o erro 