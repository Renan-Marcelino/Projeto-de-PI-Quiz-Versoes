import java.util.InputMismatchException;
import java.util.Scanner;
class Quiz_V1_1{
  public static void main(String[] args)throws InterruptedException{
  Scanner Quiz = new Scanner(System.in);
    
  //↓↓↓ Variaveis das respostas corretas ↓↓↓
    
  int[] alternativa = {0,1,2,3,4};     
   
  //↓↓↓ Variavel do ranking  ↓↓↓
    
  int ranking = 0;
  int rankingDois = 0;
  int bonus = 0;
  int perda = 0;
    
  //↓↓↓ Variavel de pontuação  ↓↓↓ 
    
  int penalidade = 0;
  int pontosBonus = 0;
  int xp1 = 0;
  int xp = 0;   
  int pontos;
  int TotalDePontos; 
  int pontosFinal = 0;
  String clearConsole;
           
//↓↓↓ Variavel do menu principal ↓↓↓
    
  String nome = "nome";
  String continuar;
  int[] Respostas = {0,1,2,3,4};
  int RespostaDoJogador = 0;
  int respDoJogador = 0;
  int resposta1 = 3;
  int resposta2 = 2;
  int sair = 1;
  int cont = 2;
  int sairDoJogo = 5;

//↓↓↓ MENU DO JOGO ↓↓↓
do {
do {

System.out.println("◢====================◣");
System.out.println("‖                    ‖");
System.out.println("‖ Quiz das Estelas⭐ ‖");
System.out.println("‖                    ‖");
System.out.println("‖=====▶  MENU  ◀=====‖");
System.out.println("‖                    ‖");
System.out.println("‖   1 - Jogar    🎮  ‖");
System.out.println("‖                    ‖");
System.out.println("‖   2 - Intruções 📝 ‖");
System.out.println("‖                    ‖");
System.out.println("‖   3 - Creditos 🧾  ‖");
System.out.println("‖                    ‖");
System.out.println("‖   4 - Sair   ❌    ‖");
System.out.println("‖                    ‖");
System.out.println("◥====================◤");
Thread.sleep(800);
System.out.print("Digite sua resposta: ");
  
sair --;
  try{
    RespostaDoJogador = Quiz.nextInt();
  }catch(InputMismatchException e){
    Thread.sleep(800);    
  }
  
Quiz.nextLine();
  
switch (RespostaDoJogador){
  case 1:
    System.out.println("\nOk Vamos Jogar!!!");
    Thread.sleep(800);
    
    
    if (sair == 0 || cont == 2){
      System.out.println("\nMas Antes me diga seu nome para acrescentar ao ranking:\n ");}
    break;
    
  case 2:
    System.out.println("\nSeu Objetivo é concluir o jogo acertando o maior número");
    System.out.println("de perguntas e acumulando a maior pontuação possivel ");
    System.out.println("para estar em primeiro do ranking.");
    Thread.sleep(800);
    System.out.println("\nPara isso você deve escolher sabiamente as repostas corretas  ");
    System.out.println("das questões, basta digitar um número de 1 a 4");
    System.out.println("após cada questão e torcer para estar correto!\n");
    Thread.sleep(800);
    System.out.println("\nAgora que ja sabe como jogar, VAMOS PARA O JOGOOO!!!\n");
    Thread.sleep(800);
    System.out.println("Mas Antes me diga seu nome para acrescentar ao ranking: \n");
    nome = Quiz.nextLine();
    Thread.sleep(800);
    System.out.printf("\nMuito Prazer %s! Eu me chamo ENIAC, e vou te auxiliar agora vamos para as perguntas\n", nome);
    System.out.println("\n1 - Sim! Vamos começar \n2 - Não, Voltar ao menu.\n");
    sair = Quiz.nextInt();
    break;
    
  case 3:
    System.out.println("\nOs Criadores do Jogo Quiz das Estrelas São: \nAlexandre Romão\nGabriel Barbosa \nPatrick Pereira \nRenan Marcelino \nWesley Pina");
    sair = 2;
    System.out.print("\nVoltando ao Menu");
    System.out.print(".");
    Thread.sleep(800);
    System.out.print(".");
    Thread.sleep(800);
    System.out.print(".");
    Thread.sleep(800);
    System.out.print(".\n\n\n");
    Thread.sleep(800);
    break;  
  case 4:
    System.out.println("Fim De Jogo!!!");
    sair = 4;
      break;
    
  default:
    System.out.println("\n\nO dado digitado não é valido por favor \ndigite novamente de acordo com os paramtros de 1 até 4:\n\n");
    sair = 2;
    break;
}  
}while(sair == 2);
    
    if(nome == "nome"){
    nome = Quiz.nextLine();
    Thread.sleep(300);
    System.out.printf("\nMuito Prazer %s! Eu me chamo ENIAC, e vou te auxiliar agora vamos para as perguntas\n", nome);}
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    Thread.sleep(300);
  //Wesley Inicio ↓↓↓  
    
  //↓↓↓  Enunciado pergunta 1 ↓↓↓
  do { 
    for(int i = 0; i < 1*30; i++) {
      System.out.print("\n");}
    cont --;
    System.out.println("\n===============");
    System.out.println("Questão 1:");
    Thread.sleep(600);
    System.out.println("\nQual destas obras arquitetônicas brasileiras é uma das Sete Maravilhas do Mundo Moderno?\n");
    Thread.sleep(300);
  //↓↓↓ Primeira Resposta ↓↓↓
    System.out.println("1) Elevador Lacerda");
    System.out.println("2) Cristo Redentor");
    System.out.println("3) Estação da Luz");
    System.out.println("4) Palácio da Alvorada\n");
    System.out.print("\nDigite sua resposta: ");
    
    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }
    Thread.sleep(300);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    
    if (respDoJogador == alternativa[2]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 10 pontos!");
      pontos = xp1 += 10; TotalDePontos = pontos; 
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima");
    }
        
  //codigo para o ranking     
    ranking = xp1;
    
  //↓↓↓Enunciado pergunta 2 ↓↓↓
  do { 
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 2:");
    Thread.sleep(300);
    System.out.println("\nO que a palavra legend significa em português?\n");
    Thread.sleep(2000);
  //↓↓↓ Segunda Resposta ↓↓↓
    System.out.println("1) Legenda");
    System.out.println("2) História4)");
    System.out.println("3) Lenda");
    System.out.println("4) Legendário\n");
    System.out.print("\nDigite sua resposta: ");
    
    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }
    Thread.sleep(300);
    if (respDoJogador > 4 || respDoJogador < 1 ) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;

    }
  }while (cont >1);
    
    if (respDoJogador == alternativa[3]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 10 pontos!");
      pontos = xp1 += 10; TotalDePontos = pontos; 
      
    }else{
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima");
    }

  //codigo para o ranking     
    ranking = xp1;
    
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    Thread.sleep(300);
    System.out.println("\n█▒▒▒▒▒▒▒▒▒\n20%");
  // codigo para contunuar o quiz.
    
    continuar = Quiz.nextLine();   
    
  //Codigo Renan / Inicio ↓↓↓
    
  //↓↓↓ Enunciado pergunta 3 ↓↓↓
  do { 
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 3:\n");
    System.out.println("Qual alternativa completa as lacunas corretamente?\n");
    Thread.sleep(300);
    System.out.println("O comando ___________.out.println serve para mostrar algo na tela.");
    System.out.println("O comando import java._______.Scanner; serve para importar biblioteca Scanner.");
    System.out.println("E os comandos .NextLine; .NextInt; servem para _________ e _________.\n");
    Thread.sleep(2000);

  //↓↓↓ Resposta 3 ↓↓↓
    
    System.out.println("1) System; Util ; Ler um Número inteiro; Ler uma String.");
    System.out.println("2) Scanner ; Else ; Ler um Número inteiro ; Ler Um Número quebrado.");
    System.out.println("3) System ; Util ; Ler uma String ; Ler Um Número inteiro.");
    System.out.println("4) Scanner ; Util ; Ler um Número quebrado ; Ler uma String.\n");
    System.out.print("\nDigite sua resposta: ");
    
    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }
    Thread.sleep(300);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if (respDoJogador == alternativa[3]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 30 pontos!");
      pontos = xp1 += 30;
      TotalDePontos = pontos; 
    }
    else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima");
    }

  //codigo para o ranking     
    ranking = xp1;
    
  //↓↓↓  Enunciado pergunta 4↓↓↓
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 4:\n"); 
    Thread.sleep(300);
    System.out.println("Qual o menor País do mundo?\n");
    Thread.sleep(300);
  //↓↓↓ Resposta 4↓↓↓
    
    System.out.println("1) Afeganistão");
    System.out.println("2) Indonésia");
    System.out.println("3) Vaticano");
    System.out.println("4) Lituania\n");
    System.out.print("\nDigite sua resposta: ");

    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }      
    
    Thread.sleep(300);
    
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if(respDoJogador == alternativa[3]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 30 pontos!");
       pontos = xp1 += 10; 
       TotalDePontos = pontos; 
    }
    else{
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima");
    }
    
  //codigo para o ranking     
    ranking = xp1;
  //Codigo Renan / Fim ↑↑↑
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    Thread.sleep(300);
    System.out.println("\n███▒▒▒▒▒▒▒\n40%");
  // codigo para contunuar o quiz.
    
    continuar = Quiz.nextLine();
    
  //Lele Inicio ↓↓↓  

  //↓↓↓  Enunciado pergunta 5 ↓↓↓
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("===============");
    System.out.println("Questão 5:");
    System.out.println("\nInforme qual alternativa contém uma expressão lógica com resultado VERDADE. X = 7 e Y = 4.\n"); 
    
  //↓↓↓Resposta 5↓↓↓
    System.out.println("1) (X > 5) & !(Y < 3)\n2) (X = 5) || (Y > 8)\n3) (Y > 10) & (X = 7)\n4) !(X = 7)\n");
    System.out.print("Digite sua resposta: ");

    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }     
    Thread.sleep(800);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if(respDoJogador == alternativa[1]) {
      System.out.println("\nCerta Resposta\nVocê adquiriu 15 pontos!\n");
      pontos = xp += 15; TotalDePontos = pontos; 
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima\n");
    }
    
  //codigo para ranking
    rankingDois = xp;
  
  //↓↓↓  Enunciado pergunta 6 ↓↓↓ 
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("===============");
    System.out.println("Questão 6:");
    System.out.println("\nAssinale a alternativa que contenha o valor final da variavel X após a execução do trecho");
    System.out.println("do programa estruturado abaixo. Considere os valores iniciais:\nA = 6 \nB = 2 \nC = 4 \nD = 3"); 
    System.out.println("\nif(A>6) & !(B<3){\n \n\nX = A/D}\n \nelse:\nX = C*A\n \nQual será o valor de X?\n");
    
  //↓↓↓Resposta 6↓↓↓  
    System.out.println("1) 2\n2) 12\n3) 24\n4) 48\n");
    System.out.print("Digite sua resposta: ");

    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }      
    Thread.sleep(800);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if (respDoJogador == alternativa[3]) {
      System.out.println("\nCerta Resposta\nVocê adquiriu 15 pontos!");
      pontos = xp += 15; TotalDePontos = pontos; 
      System.out.printf("Pontuação: %d\n", pontos);
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima");
    }

  //codigo para o ranking     
  rankingDois = xp;
  
  //Codigo Lele / Fim ↑↑↑
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    Thread.sleep(300);
    System.out.println("\n██████▒▒▒▒\n60%");
  // codigo para contunuar o quiz.
    
    continuar = Quiz.nextLine();
    
  // Codigo Gabriel / Inicio ↓↓↓
    Thread.sleep(300);
    System.out.println("\nIniciando");
    System.out.println("\nSegunda fase");
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    
    
  //↓↓↓ Enunciado pergunta 7↓↓↓
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 7:");
    System.out.println("\nOque Significa a sigla JDK?\n");

  //↓↓↓ Resposta 7↓↓↓
    System.out.println("1)Java Desenvolvimento Kit");
    System.out.println("2)Java Development Kit");
    System.out.println("3)Java Kit Development");
    System.out.println("4)Java Direct Kit\n");
    System.out.print("\nDigite sua resposta: ");
    
    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }     
    Thread.sleep(800);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if(respDoJogador == alternativa[1]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 10 pontos!");
      pontos = xp += 10; TotalDePontos = pontos; 
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima!");
    }
    
  //codigo para ranking
    rankingDois = xp;
    
  //↓↓↓ Enunciado pergunta 8 ↓↓↓
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 8:");
    System.out.println("\nOque Significa a sigla JRE?\n");
    
  //↓↓↓ Resposta 8 ↓↓↓
    System.out.println("1)Java Environment Runtime");
    System.out.println("2)Java Runtime Environment");
    System.out.println("3)Java Kit Development");
    System.out.println("4)Java Run Time\n");
    System.out.print("\nDigite sua resposta: ");

   
    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }     
    Thread.sleep(800);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if(respDoJogador == alternativa[2]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 10 pontos!");
      pontos = xp += 10; TotalDePontos = pontos; 
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima!\n");
    }
    
  //codigo para ranking
    rankingDois = xp;
    
  //Codigo Gabriel / Fim ↑↑↑
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    Thread.sleep(300);
    System.out.println("\n███████▒▒\n80%");
  // codigo para contunuar o quiz.
    
    continuar = Quiz.nextLine();   
   
  //Codigo Patrick / Inicio ↓↓↓

  //↓↓↓ Enunciado pergunta 9 ↓↓↓
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 9:");
    Thread.sleep(300);
    System.out.println("\nQual é a linguagens de programação mais ultilizada nas empresas? ");
    Thread.sleep(1500);
    
  //↓↓↓ Resposta 9 ↓↓↓
    
    System.out.println(" \n1)Html \n2)Java \n3)JavaScript \n4)python\n "); 
    System.out.print("\nDigite sua resposta: ");

    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }     
    Thread.sleep(800);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if (respDoJogador == alternativa[2]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 60 pontos!");
       pontos = pontosBonus += 60; TotalDePontos = pontos; 
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima");
      perda = penalidade - 20; 
    } 

  //codigo para ranking
    bonus = pontosBonus;
    
  //↓↓↓ Enunciado pergunta 10 ↓↓↓
  do{
    cont --;
    Thread.sleep(300);
    System.out.println("\n===============");
    System.out.println("Questão 10:");
    Thread.sleep(300);
    System.out.println("\nQual o nome do primeiro pc criado no mundo? ");
    Thread.sleep(1500);
 
  //↓↓↓ Resposta 10 ↓↓↓
    System.out.println("\n1)Maskrav \n2)buster \n3)velder \n4)Eniac\n"); 
    System.out.print("\nDigite sua resposta: ");

    
    try{
       respDoJogador = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }      
    Thread.sleep(800);
    if (respDoJogador > 4 || respDoJogador < 1) {
      System.out.println("\nResposta invalida digite novamente!");
      Thread.sleep(800);
      cont = 2;
    }
  }while (cont >1);
    if (respDoJogador == alternativa[4]){
      System.out.println("\nCerta Resposta\nVocê adquiriu 60 pontos!");
      pontos = pontosBonus += 60;
      TotalDePontos = pontos; 
    }else {
      System.out.println("\nVocê errou \nE não adquiriu pontos\nBoa sorte na próxima!");
      perda = penalidade  - 20; 
    }
    
  //pontuação final ranking ↑↑↑
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");
    Thread.sleep(300);
    System.out.println("\n█████████\n100%");
    
  //Codigo para ficar bonitinho o Quiz. Parte 2
    System.out.print("\nSalvando pontos");
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".");
    Thread.sleep(300);
    System.out.print(".\n");

  //codigo para ranking
    bonus = pontosBonus;

  //Codigo Patrick / Fim ↑↑↑

  //codigo ranking
    
    continuar = Quiz.nextLine();
    Thread.sleep(300);

  
    System.out.println("Fim do Game!\n");
    Thread.sleep(300);

    System.out.println("\n                                ");
    System.out.println("◢================================◣");
    System.out.println("                                  ");
    System.out.println("              Ranking             ");
    System.out.println("                                  ");
    System.out.println("       Pontuações/Penalidades     ");
    System.out.println("                                  ");
    System.out.println("          Total de pontos         ");
    System.out.println("                                  ");
    System.out.printf("          1- fase:%d\n",ranking     );
    System.out.println("                                  ");
    System.out.printf("          2- fase:%d\n",rankingDois );
    System.out.println("                                  ");
    System.out.printf("           Fase Bonus:%d\n",bonus   );
    System.out.println("                                  ");
    System.out.println("            Penalidade            ");
    System.out.println("                                  ");
    System.out.println("            Fase Bonus            ");
    System.out.println("                                  ");
    System.out.printf("                %d\n",  perda       );
    System.out.println("                                  ");
    System.out.println("                                  ");
    System.out.println("     Pontuação Máxima             ");
    System.out.println("                                  ");
    System.out.println("        220 Pontos                ");
    System.out.println("                                  ");
    System.out.printf("   Obrigado por jogar %s\n", nome   );
    System.out.println("◥================================◤");
    Thread.sleep(2000);

  //Codigo para o fim do game.
    System.out.println("\nCreditos\n");
    System.out.println("Os Criadores do Jogo Quiz Das Estrelas ⭐\n\nAlexandre Romão\nGabriel Barbosa \nPatrick Pereira \nRenan Marcelino \nWesley Pina\n");
      
      
  do{
    cont --;
    System.out.println("Se quiser recomeçar digite: 1");
    System.out.println("Se deseja sair digite: 0");
    System.out.print("\nDigite sua resposta: ");
  
    try{
       sairDoJogo = Quiz.nextInt();  
    }catch(InputMismatchException e){
       Quiz.nextLine(); 
       System.out.println("\nResposta invalida digite novamente!");
       Thread.sleep(800);    
       cont = 2;
       for(int i = 0; i < 1*30; i++) {
         System.out.print("\n");}
    }     
    Thread.sleep(800);
  }while (cont >1);
  }while(respDoJogador == 1);
 }
}