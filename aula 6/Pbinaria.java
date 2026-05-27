void main(){
    var num = new int[10];
    int pesq, aux, ini, fim, meio = 0;
    boolean achou;

    for(int cont=0;cont<num.length;cont++)
        num[cont] = Integer.parseInt(IO.readln("Digite o " + (cont+1) + " numero: "));
    for(int i=0; i<num.length; i++)
        for(int j;i+1;j<num.length;j++)
        if (num[i]> num[j]){
            aux = num[i];
            
        }
}