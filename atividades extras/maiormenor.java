void main(){
    int n1 = Integer.parseInt(IO.readln("informe um número qualquer"));
    int n2 = Integer.parseInt(IO.readln("informe outro número qualquer"));
    int n3 = Integer.parseInt(IO.readln("informe outro número qualquer"));
    int n4 = Integer.parseInt(IO.readln("informe outro número qualquer"));
    int n5 = Integer.parseInt(IO.readln("informe outro número qualquer"));
    int maior;
    int menor;

    if (n1>n2 && n1>n3 && n1> n4 && n1>n5)
        maior=n1;
    if (n2>n1 && n2>n3 && n2>n4 && n2>n5)
        maior=n2;
    if (n3>n1 && n3>n2 && n3> n4 && n3>n5)
        maior=n3;
    if (n4>n2 && n4>n3 && n4> n1 && n4>n5)
        maior=n4;
    if (n5>n2 && n5>n3 && n5> n4 && n5>n1)
        maior=n5;

    if (n1<n2 && n1<n3 && n1<n4 && n1<n5)
        menor = n1;
     if (n2<n1 && n2<n3 && n2<n4 && n2<n5)
        menor = n2;
     if (n3<n2 && n3<n1 && n3<n4 && n3<n5)
        menor = n3;
     if (n4<n2 && n4<n3 && n4<n1 && n4<n5)
        menor = n4;
     if (n4<n2 && n4<n3 && n4<n1 && n4<n5)
        menor = n4;

     IO.println("o maior valor lido foi: " + maior);
     IO.println("o menor valor lido foi: " + menor);
    
    

}