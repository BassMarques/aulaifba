void main(){
    Float n1 = Float.parseFloat(IO.readln("informe aqui a sua primeira nota: "));
    Float n2 = Float.parseFloat(IO.readln("informe aqui a sua segunda nota: "));
    Float n3 = Float.parseFloat(IO.readln("informe aqui a sua terceira nota: "));
    Float n4 = Float.parseFloat(IO.readln("informe aqui a sua quarta nota: "));
    Float media = (n1+n2+n3+n4)/4;

    if (media >= 5)
        System.out.printf("o aluno foi aprovado com média: "+ media);
    else 
        System.out.printf("o aluno foi reprovado com média: " + media);
}