void main (){
    int n1 = Integer.parseInt(IO.readln("informe um número qualquer"));
    int n2 = Integer.parseInt(IO.readln("informe outro número qualquer"));
    int n3 = Integer.parseInt(IO.readln("informe outro número qualquer"));
    int n4 = Integer.parseInt(IO.readln("informe outro número qualquer"));

    if (n1%2==0 && n1%3==0)
        IO.println(n1 + " é divisível por 2 e 3");
    if (n2%2==0 && n2%3==0)
        IO.println(n2 + " é divisível por 2 e 3");
    if (n3%2==0 && n3%3==0)
        IO.println(n3 + " é divisível por 2 e 3");
    if (n4%2==0 && n4%3==0)
        IO.println(n4 + " é divisível por 2 e 3");

}



