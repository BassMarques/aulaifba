void main (){
    Double a = Double.parseDouble(IO.readln("insira aqui a primeira variável(A): ")); 
    Double b = Double.parseDouble(IO.readln("insira aqui a segunda variável(B): ")); 
    Double c = Double.parseDouble(IO.readln("insira aqui a terceira variável(C): ")); 
     if (a ==0)
        System.out.println("A não pode ser 0");
    else {
        double delta = Math.pow(b, 2) - (4*a*c);
         if (delta<0) {
            System.out.println("as raízes não são reais pois o delta é negativo");}
            else
             if (delta == 0){
                double x = -b/(2*a);
                System.out.println("delta = 0, apenas uma raiz real, x = " + x);}
                 else {
                    double x1 = (-b + Math.sqrt(delta))/(2*a);
                    double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("As raízes são "+ x1 + " e " + x2);
             }
         }
        }