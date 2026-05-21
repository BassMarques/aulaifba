void main(){
    int numero = Integer.parseInt(IO.readln("informe um número: "));
    int multi = 1;

    do {
        System.out.printf("%d x %d = %d \n", numero, multi, numero*multi);
        multi++;
    }
    while (multi<=10);
}