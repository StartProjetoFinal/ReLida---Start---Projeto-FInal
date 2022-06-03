Algoritmo "ReLida_Login_Cadastro."
// Disciplina   : [Lógica de Programação]
// Descrição   : Protótipo para as telas de login e cadastro.
// Autor(a)    : Grupo Start
// Data atual  : 02/06/2022

// Nos 'se' que continham 'email = ""' como condição, substituí utilizando
// essa função, que RETORNA -1 caso o email seja vazio ou não tenha um @.
// Podemos dar outras restrições para nome e senha e criar outras funções
// de teste, ou até mesmo fazer tudo numa única função de teste. Sugestões?
função testemail: inteiro
       var aux: inteiro
       
       inicio
       aux <- 1
       se (email = "") ou (Pos("@", email) = 0) entao
          aux <- -1
       fimse
          
       retorne aux
fimfuncao

       

Var
   resposta,perguntaSeguranca,respostaSeguranca:inteiro
   email,nome,senha,confSenha,c :caractere


Inicio
c<- "n"
   escreval("Bem-vindo a ReLida.Sua plataforma de venda,troca e doação de livros!")
   escreval("----------------------------------------------------------------")
   escreval("Você já possui conta na nossa plataforma?")
   escreval("Digite 1-Sim e 2-Não:")
   leia(resposta)
   limpatela
   escolha resposta
   caso 1
   enquanto c = "n" faca
         escreval("Digite seu email:")
         leia(email)
         limpatela
         // Utiliza função:
         se testemail = -1 entao
            escreval("Digite um email valido")
            //limpatela   -coloquei limpatela logo depois de ter lido o nome,
            // porque a mensagem "Digite um email valido" é apagada muito rápido.
            senao
                 c <- "v"
            fimse
         fimenquanto
         c<-"n"
         enquanto c = "n" faca
           escreval("Digite sua senha: ")
         leia(senha)
         limpatela
         se senha = "" entao
            escreval("Digite uma senha valida")
            //limpatela
            senao
                 c <- "v"
            fimse
         fimenquanto
      escreval("Você entrou na ReLida!Fique a vontade para conhecer o nosso catalogo!")
   caso 2
      escreval("Deseja fazer cadastro? Digite 1-Sim e 2-Não:")
      leia(resposta)
      limpatela
      se resposta = 1 entao
      //c<-"n"    Quando a execução se encontra nessa linha,
                  //a variável já possui esse valor, e nunca voltará a
                  // executar essa linha, pois não está dentro de nenhuma
                  //estrutura de repetição.  Caso seja encontrado alguma
                  // situação que atribuir ou não essa variável (aqui) afete
                  // os resultados, favor entrar em contato.
                  // Isso não é uma falta grave e não atrapalha o funcionamento do código.
           enquanto c = "n" faca
           escreval("Digite seu nome: ")
         leia(nome)
         limpatela
         se nome = "" entao
            escreval("Digite um nome valido")
            //limpatela
            senao
                 c <- "v"
            fimse
         fimenquanto
         c<- "n"
         enquanto c = "n" faca
           escreval("Digite seu email: ")
         leia(email)
         limpatela
         // Utiliza função:
         se testemail = -1 entao
            escreval("Digite um email valido")
            //limpatela   -coloquei limpatela logo depois de ter lido o nome,
            // porque a mensagem "Digite um email valido" é apagada muito rápido.
            senao
                 c <- "v"
            fimse
         fimenquanto
         c<-"n"
         enquanto c = "n" faca
           escreval("Digite sua senha: ")
         leia(senha)
         limpatela
         se senha = "" entao
            escreval("Digite uma senha valida")
            //limpatela
            senao
                 c <- "v"
            fimse
         fimenquanto
         escreval("Confirme sua senha:")
         leia(confSenha)
         enquanto senha <> confSenha faca
            escreval("As senhas não sao correspondentes.Confirme sua senha novamente!")
            leia (confSenha)
         fimenquanto
         limpatela
         
         // Pergunta de segurança:
         escreval("Escolha uma pergunta de segurança, para ser utilizada caso algum dia você esqueça sua senha.")
         
         // Aqui, utilizo o enquanto para garantir que o usuário digite 1, 2 ou 3.
         c <- "n"
         enquanto c = "n" faca
                  escreval("Escolha uma opção válida:")
                  escreval("1- Animal de estimação de infancia.")
                  escreval("2- Melhor amigo da infancia.")
                  escreval("3- Livro preferido.")
                  leia(perguntaSeguranca)
                  limpatela
                  escolha perguntaSeguranca
                          caso 1,2,3
                               c <- "v"
                          outrocaso
                               escreva("Opção inválida.")

                  fimescolha
         fimenquanto
            
         escolha perguntaSeguranca
         caso 1
            escreval("Escreva o nome do seu animal de estimação da infancia:")
            leia(respostaSeguranca)
         caso 2
            escreval("Escreva o nome do seu melhor amigo da infancia:")
            leia(respostaSeguranca)
         caso 3
            escreval("Escreva seu livro preferido:")
            leia(respostaSeguranca)
            limpatela
         outrocaso
            escreval("Opção invalida.")
         fimescolha
         escreval("Seu cadastro foi finalizado com sucesso!")
      senao
         escreval("Continue navegando na nossa plataforma e volte sempre!")
      fimse  // Ver próximo comentário.
      outrocaso
         escreval("Continue navegando na nossa plataforma e volte sempre!")
      fimescolha
   //fimse        Aparentemente o visualg perminte colocar o 'fimse' aqui ou
                  // logo após o senão. Coloquei em cima porque o "se" está
                  //dentro do 'escolha', e por isso, por convenção se coloca antes
                  // do 'fimescolha'.
                  // Isso não é uma falta grave e não atrapalha o funcionamento do código.
fimescolha



Fimalgoritmo
