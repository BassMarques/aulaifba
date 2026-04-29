void main(){
    System.out.println("esse programa deixará 3 valores em ordem crescente");
    double a = Double.parseDouble(IO.readln("insira aqui o primeiro valor: "));
    double b = Double.parseDouble(IO.readln("insira aqui o segundo valor: "));
    double c = Double.parseDouble(IO.readln("insira aqui o terceiro valor: "));
    double n1;
    double n2;
    double n3;

   if (a>b && a>c)
        n3 = a;
      else{
        if (b>c && b>a)
            n3 = b;
        else 
            n3 = c;}
   if (a<b && a>c)
         n2 = a;
     else
        if (b<a && b>c)
            n2 = b;
        else
            n2 = c;
    if (a<b && a<c)
        n1 = a;
     else 
        if (b<c && b<a)
            n1 = b;
         else 
         n1 = c;
    System.out.println("a ordem será: " + n1 + ", "+n2+", "+n3) ;}