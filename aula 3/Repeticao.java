void main (){
    int numero = Integer.parseInt(IO.readln("Insira um número aqui: "));

    for (int multi  =1; multi <=10; multi++)
        System.out.printf("%d x %d = %d \n", numero, multi, numero*multi);
}