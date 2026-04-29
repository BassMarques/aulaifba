void main(){
  int n1 = Integer.parseInt(IO.readln("digite aqui o primeiro número: "));
  int n2 = Integer.parseInt(IO.readln("digite aqui o segundo número: "));
  int total;
  if (n1>n2)
    IO.println("o resultado será: " + (n1-n2));
else 
    IO.println("o resultado será: " + (n2-n1));
    
}
