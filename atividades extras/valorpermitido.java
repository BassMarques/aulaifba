void main(){
    int numero = Integer.parseInt(IO.readln("informe aqui um número entre 1 e 9: "));

    if (numero>=1 && numero <=9)
        IO.println(numero + " está na faixa permitida");
    else
        IO.println(numero + " está fora da faixa permitida");
}