void main(){
    Float n1 = Float.parseFloat(IO.readln("informe aqui a sua primeira nota: "));
    Float n2 = Float.parseFloat(IO.readln("informe aqui a sua segunda nota: "));
    Float n3 = Float.parseFloat(IO.readln("informe aqui a sua terceira nota: "));
    Float n4 = Float.parseFloat(IO.readln("informe aqui a sua quarta nota: "));
    Float media = (n1+n2+n3+n4)/4;
    if (media<7){
        Float exame = Float.parseFloat(IO.readln("o aluno terá que fazer exame, insira aqui a nota do exame: "));
        Float nmedia = (exame + media)/2;
        if (nmedia >= 5)
            System.out.println("o aluno foi aprovado com média " + nmedia);
        else 
            System.out.println("o aluno foi reprovado");
}
   else 
    System.out.println("o aluno foi aprovado com média " + media);

        
}