void main(){
 double resposta = 1;
 double base = Double.parseDouble(IO.readln("informe aqui sua base: "));
 double expoente = Double.parseDouble(IO.readln("informe aqui sua expoente: "));

if (expoente == 0 )
    IO.println(base + " elevado a "+ expoente + " é igual a " + resposta);
else
    IO.println(base + " elevado a "+ expoente + " é igual a " + (Math.pow(base, expoente)));

}
