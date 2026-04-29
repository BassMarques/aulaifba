void main(){
    float nota1 = Float.parseFloat(IO.readln("Informe a seguir a nota da primeira unidade: "));
    float nota2 = Float.parseFloat(IO.readln("Informe a seguir a nota da segunda unidade: "));
    float nota3 = Float.parseFloat(IO.readln("Informe a seguir a nota da terceira unidade: "));
    float media = (nota1 + nota2 + nota3)/3;

    if (media>=7)
        IO.println("aprovado com média: "+ media);
    else
        IO.println("Reprovado com média: "+ media);
}