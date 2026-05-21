void main(){
    String continua="S", comodo;
    float largura, comprimento, areaTotal=0;

    while (continua.equalsIgnoreCase("S")){
        comodo= IO.readln("informe o nome do cômodo: ");
        largura = Float.parseFloat(IO.readln("informe a largura do(a) "+ comodo + ": "));
        comprimento = Float.parseFloat(IO.readln("informe o comprimeto largura do(a) "+ comodo+": "));
        areaTotal = areaTotal +largura*comprimento;
        continua = IO.readln("Deseja continuar? (S/N) ");
    }
    IO.println("A área total da residência é: "+ areaTotal);
    }
    
    

