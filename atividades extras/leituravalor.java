void main(){
    double numero = Double.parseDouble(IO.readln("informe aqui o número: "));
    
    if (numero<0){
        numero = (numero* -1);
    IO.println("o módulo será: " + numero);}
    else
        IO.println("o módulo será: " + numero);
}

