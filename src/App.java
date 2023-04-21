import java.util.Scanner;

class Main {
  /*  Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7 */
  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // declaração da variáveis 
    int     consM  = 58;
    double  consF  = 44.7;
    double  consM2 = 72.7;
    double  consF2 = 62.1;
    

    // informe a altura
    String textoUm = "Informe sua altura: ";
    System.out.print(textoUm);
    double altura = input.nextDouble();
    
    // informe se é homem ou mulher
    String textoDois = "Você é homem ou mulher? ";
    System.out.println(textoDois);
    String sexo = input.next();

    //calcule e mostre o resulte se h ou se m
    if (sexo.equals("homem"))
    {
      Double calcM = (consM2 * altura) - consM;
      System.out.println("Seu peso ideal é: " + calcM + "Kg. ");
    
    } else if (sexo.equals("mulher")) 
    {
      Double calcF = (consF2 * altura) - consF;
      System.out.println("Seu peso ideal é: " + calcF + "Kg. ");
    }
    input.close();
  }
}





