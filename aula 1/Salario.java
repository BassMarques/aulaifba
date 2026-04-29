void main(){

Float salario = Float.parseFloat(IO.readln("informe o seu salário: "));
Float percentual = Float.parseFloat(IO.readln("informe o percentual: "));

Float nsalario = salario * (1 + percentual /100);

IO.print("o novo salário será de " + salario + " com " + percentual + "% de aumento é: " + nsalario);
}