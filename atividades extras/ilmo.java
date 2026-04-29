void main(){
    String nome = IO.readln("informe o nome do destinatário: (M/F) ");
    String sexo = IO.readln("informe o sexo do destinatário: (M/F) ");
    
    switch (sexo) {
        case "M" :
            IO.println("Ilmo senhor "+ nome +", seja bem vindo!");
            break;
        case "F" :
        IO.println("Ilmo senhora "+ nome +", seja bem vinda!");
            break; 
        }
}