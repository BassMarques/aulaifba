void main (){ 
    int numero = Integer.parseInt(IO.readln("informe um núemro para multiplicá-lo: "));
    int multi = 1;

    while (multi<=10){
        System.out.printf("%d x %d = %d\n", numero, multi, numero*multi);
        multi++;
    }
}