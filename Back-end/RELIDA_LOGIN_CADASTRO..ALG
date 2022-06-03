Algoritmo "ReLida_Login_Cadastro."
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 02/06/2022
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
         se email = "" entao
            escreval("Digite um email valido")
            limpatela
            senao
                 c <- "v"
            fimse
         fimenquanto
         c<-"n"
         enquanto c = "n" faca
           escreval("Digite sua senha: ")
         leia(senha)
         se senha = "" entao
            escreval("Digite uma senha valida")
            limpatela
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
      c<-"n"
           enquanto c = "n" faca
           escreval("Digite seu nome: ")
         leia(nome)
         se nome = "" entao
            escreval("Digite um nome valido")
            limpatela
            senao
                 c <- "v"
            fimse
         fimenquanto
         c<- "n"
         enquanto c = "n" faca
           escreval("Digite seu email: ")
         leia(email)
         se email = "" entao
            escreval("Digite um email valido")
            limpatela
            senao
                 c <- "v"
            fimse
         fimenquanto
         c<-"n"
         enquanto c = "n" faca
           escreval("Digite sua senha: ")
         leia(senha)
         se senha = "" entao
            escreval("Digite uma senha valida")
            limpatela
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
         escreval("Escolha uma pergunta de segurança, para ser utilizada caso algum dia você esqueça sua senha.")
         escreval("1- Animal de estimação de infancia.")
         escreval("2- Melhor amigo da infancia.")
         escreval("3- Livro preferido.")
         leia(perguntaSeguranca)
         limpatela
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
      outrocaso
         escreval("Continue navegando na nossa plataforma e volte sempre!")
      fimescolha
   fimse
fimescolha




Fimalgoritmo