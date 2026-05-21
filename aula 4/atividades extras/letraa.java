void main (){
    var A = new int[5][3];
    var B = new int[5][3];
    

    for (int lin=0;lin<5;lin++)
        for(int col=0;col<3;col++)
           A[lin][col]=Integer.parseInt(IO.readln("Digite A["+ (lin+1)+"]["+(col+1)+"]: "));
    for (int lin=0;lin<5;lin++)
        for(int col=0;col<3;col++)
            System.out.printf("5%d", A[lin][col]);
        IO.println();

}