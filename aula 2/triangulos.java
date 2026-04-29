void main (){
    IO.println("Informe os 3 lados do triângulo");
    int ladoa = Integer.parseInt(IO.readln("Lado A: "));
    int ladob = Integer.parseInt(IO.readln("Lado B: "));
    int ladoc = Integer.parseInt(IO.readln("Lado C: "));

    if ((ladoa<ladob+ladoc && ladob<ladoc+ladoa && ladoc<ladoa+ladob)){  

    if (ladoa == ladob && ladob == ladoc)
     IO.println ("o triângulo é equilátero");
     else
        if (ladoa == ladob || ladoc == ladob || ladoc == ladoa)
           IO.println("o triângulo é isóceles");
        else
         if (ladoa != ladob && ladoc != ladob && ladoc!=ladoa)
           IO.println("o triângulo é escaleno");
}
   else
    IO.println("Isso não é um triângulo");
}