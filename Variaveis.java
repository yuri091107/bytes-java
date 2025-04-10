import java.util.Scanner;

public class Variaveis {
    public byte armazen1 = Byte.MAX_VALUE;
    public byte armazen11 = Byte.MIN_VALUE;
    public short armazen2 = Short.MAX_VALUE;
    public short armazen22 = Short.MIN_VALUE;
    public int armazen3 = Integer.MAX_VALUE;
    public int armazen33 = Integer.MIN_VALUE;
    public long armazen4 = Long.MAX_VALUE;
    public long armazen44 = Long.MIN_VALUE;
    public Scanner sc = new Scanner(System.in);
    public long valor = sc.nextLong();


    public void Byte() {
        if(valor <= armazen1 || valor == armazen11) {
            System.out.println("Pode ser alocado em byte");
        }
        else if(valor < armazen11) {
            System.out.println("Não atingiu o mínimo da variável");
        }
        else {
            System.out.println("O valor ultrapassou o limite do dado 'byte'");
        }
    }
    
    public void Short() {
        if(valor <= armazen2 || valor == armazen22) {
            System.out.println("Pode ser alocado em 'short' ");
        }
        else if(valor < armazen22) {
            System.out.println("Não atingiu o mínimo da variável");
        }
        else {
            System.out.println("O valor ultrapassou o limite do dado 'short'");
        }
    }
    
    public void Inteiro() {
        if(valor <= armazen3 || valor == armazen33) {
            System.out.println("Pode ser alocado em 'inteiro' ");
        }
        else if(valor < armazen33) {
            System.out.println("Não atingiu o mínimo da variável");
        }
        else {
            System.out.println("O valor ultrapassou o limite do dado 'inteiro'");
        }
    }
    
    public void Long() {
        if(valor <= armazen4 || valor == armazen44) {
            System.out.println("Pode ser alocado em 'long' ");
        }
        else if(valor < armazen44) {
            System.out.println("Não atingiu o mínimo da variável");
        }
        else {
            System.out.println("O valor ultrapassou o limite do dado 'long'");
        }
}
}
