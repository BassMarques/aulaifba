void main (){
    Float n1 = Float.parseFloat(IO.readln("informe aqui a primeira nota: "));
    Float n2 = Float.parseFloat(IO.readln("informe aqui a segunda nota: "));
    Float n3 = Float.parseFloat(IO.readln("informe aqui a terceira nota: "));

    Float media = (n1 + n2 +n3)/3;

    IO.println("a média será: " + media);
}