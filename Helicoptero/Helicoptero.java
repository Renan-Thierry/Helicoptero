//Classe
public class Helicoptero{
//atributos
    private int capacidade, pessoas;
    private boolean ligado;
    private double altitude;
   
//construtor
    public Helicoptero (int capacidade){
      this.capacidade = capacidade;
      this.altitude = 0;
      this.ligado = false;
      this.pessoas = 0;
    }
//metodos
    public int getCapacidade(){
      return capacidade;
    }
    public void setCapacidade(int capacidade){
      this.capacidade = capacidade;
    }
    public boolean getLigado(){
      return ligado;
    }
    public void setLigado(boolean ligado){
      this.ligado = ligado;
    } 
  
    public double getAltitude(){
      return altitude;
    }
    public void setAltitude(double altitude){
      this.altitude = altitude;
    } 
  
     public int getPessoas(){
      return pessoas;
    }
    public void setPessoas(int Pessoas){
      this.pessoas = pessoas;
    } 
    
    public void entrar(){
      if (pessoas < capacidade){
        System.out.println("1 pessoa entrou no Helicoptero");
        this.pessoas ++;
      } else if(pessoas > 5){
        System.out.println("Capacidade maxima de pessoas atingida");
      }
    }
  
    public void sair(){
      if (pessoas > 0){
        System.out.println("1 pessoa saiu do Helicoptero");
        this.pessoas --;
      }else if(pessoas == 0){
        System.out.println("Não existe pessoas no Helicoptero");
      }
    }
    public void ligar(){
      if (ligado == false){
         this.ligado = true;
        System.out.println("O Helicoptero foi ligado\n");
      } 
    }
    public void desligar(){
      if (ligado == true){
        System.out.println("O helicoptero foi desligado");
        this.ligado = false;
      }else if(ligado == false){
        System.out.println("O helicoptero ja está desligado");
      }
    }
    public void decolar(){
      if (altitude == 0 && ligado == true){
        System.out.println("O helicoptero decolou");
        this.altitude ++;
      }else{
        System.out.println("O Helicoptero está desligado");
      }
    }
    public void Aterrissar(){
      if (altitude >= 1){
        System.out.println("O avião está aterrissando");
      }
    }
    
    public String toString(){
      return "Capacidade Maxima: " + capacidade + " Pessoas" + "\nPessoas no Helicoptero: " + pessoas + "\nLigado: " + ligado + "\nAltitude: " + altitude ;
    } 
  }