import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Helicoptero h1 = new Helicoptero(5);
    int opcao = 0;
    while(opcao != 7 ){
    System.out.println("\n======= Status do Helicoptero =======\n");
    System.out.println(h1.toString());
    System.out.println("\n=====================================\n");
    System.out.println("=============== MENU ================\n");
    System.out.println("1 - Adicionar pessoa");
    System.out.println("2 - Remover pessoa ");
    System.out.println("3 - Decolar Helicoptero ");
    System.out.println("4 - Aterrissar Helicoptero ");
    System.out.println("5 - Desligar Helicoptero ");
    System.out.println("6 - Ligar Helicoptero ");
    System.out.println("7 - Sair \n");

   Scanner teclado = new Scanner(System.in);
   System.out.print("Sua opção: ");
    int pessoas = teclado.nextInt();
    if(pessoas == 1){
      System.out.println("================ MENU ===============\n");
      h1.entrar();
      System.out.println("\n=====================================\n");
    }
    if(pessoas == 2){
      System.out.println("================ MENU ===============\n");
      h1.sair();
      System.out.println("\n=====================================\n");
    }
    if(pessoas == 3){
      System.out.println("================ MENU ===============\n");
      h1.decolar();
      System.out.println("\n=====================================\n");
    } 
    if(pessoas == 4){
      System.out.println("================ MENU ===============\n");
      h1.Aterrissar();
      System.out.println("\n=====================================\n");
    } 
    if(pessoas == 5){
      System.out.println("================ MENU ===============\n");
      h1.desligar();
      System.out.println("\n=====================================\n");
    }
    if(pessoas == 6){
      System.out.println("================ MENU ===============\n");
      h1.ligar();
      System.out.println("\n=====================================\n");
    }
    if(pessoas == 7){
      System.out.println("================ MENU ===============\n");
      System.out.println("Saindo do Programa...");
      System.out.println("\n=====================================\n");
      break;
    }
    if(pessoas > 7){
      System.out.println("================ MENU ===============\n");
      System.out.println("Nao existe essa opção, tente novamente!!!");
      System.out.println("\n=====================================\n");
    }
  }
}
}

