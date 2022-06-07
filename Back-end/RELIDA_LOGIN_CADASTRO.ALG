Algoritmo "ReLida_Login_Cadastro."
// Disciplina   : [Lógica de Programação]
// Descrição   : Protótipo para as telas de login e cadastro.
// Autor(a)    : Grupo Start
// Data atual  : 02/06/2022

//Função que retornará -1 caso o a variavel email seja vazia,ou não possua "@" ou ".com":
funcao testemail: inteiro
       var aux: inteiro

       inicio
       aux <- 1
       se (email = "") ou (Pos("@", email) = 0)  ou (Pos(".com", email) = 0)  entao
          aux <- -1
       fimse

       retorne aux
fimfuncao



Var
   resposta,perguntaSeguranca,respostaSeguranca:inteiro
   email,nome,senha,confSenha,controle :caractere


Inicio
//Essa variável será usada nas condições das estruturas, ajudando a garantir que o usuário entre com um valor esperado.
controle<- "negativo"

   escreval("Bem-vindo a ReLida.Sua plataforma de venda,troca e doação de livros!")
   escreval("----------------------------------------------------------------")
   escreval("Você já possui conta na nossa plataforma?")
   
   escreval("Digite 1=Sim ou 2=Não:") 
   leia(resposta)
   limpatela
   
   //Esta estrutura irá usar o valor lido e armazenado na variável responta, indo para duas telas diferentes(Login ou Cadastro).
   escolha resposta
   
          //Tela de Login:
          caso 1
                 //Solicita o email válido, previamente cadastrado:
                 enquanto controle = "negativo" faca
                       escreval("Digite seu email:")
                       leia(email)
                       limpatela
                       
                       // Utiliza função:
                       se testemail = -1 entao
                          escreval("Digite um email valido")
                          senao
                               controle <- "valido"
                          fimse
                       fimenquanto
                       
                       // Solicita uma senha válida:
                       controle<-"negativo"
                       enquanto controle = "negativo" faca
                              escreval("Digite sua senha: ")
                              leia(senha)
                              limpatela
                              se senha = "" entao
                                   escreval("Digite uma senha valida")
                              senao
                                   controle <- "valido"
                              fimse
                       fimenquanto
                 
                 escreval("Você entrou na ReLida!Fique a vontade para conhecer o nosso catalogo!")
          
          
          // Tela de Cadastro:
          caso 2
             escreval("Deseja fazer cadastro? Digite 1=Sim ou 2=Não:")
             leia(resposta)
             limpatela
             
             // Se a pessoa desejar fazer o cadastro, será executado:
             se resposta = 1 entao
             
                    //Solicita um nome válido:
                    enquanto controle = "negativo" faca
                              escreval("Digite seu nome: ")
                              leia(nome)
                              limpatela

                              se nome = "" entao
                                   escreval("Digite um nome valido")
                                   enao
                                          controle <- "valido"
                              fimse

                    fimenquanto
                
                //Solicita um email válido:
                controle <- "negativo"
                enquanto controle = "negativo" faca
                       escreval("Digite seu email: ")
                       leia(email)
                       limpatela
                       // Utiliza função:
                       se testemail = -1 entao
                            escreval("Digite um email valido")
                       senao
                            controle <- "valido"
                       fimse
                fimenquanto
                
                //Solicita uma senha válida:
                controle<-"negativo"
                enquanto controle = "negativo" faca
                       escreval("Digite sua senha: ")
                       leia(senha)
                       limpatela
                       se senha = "" entao
                            escreval("Digite uma senha valida")
                       senao
                            controle <- "valido"
                       fimse
                fimenquanto
                
                //Solicita uma confirmação de senha:
                escreval("Confirme sua senha:")
                leia(confSenha)
                enquanto senha <> confSenha faca
                     escreval("As senhas não sao correspondentes.Confirme sua senha novamente!")
                     leia (confSenha)
                fimenquanto
                limpatela

                // Pergunta de segurança:
                escreval("Escolha uma pergunta de segurança, para ser utilizada caso algum dia você esqueça sua senha.")

                // Aqui, utiliza-se o enquanto para garantir que o usuário digite 1, 2 ou 3.
                controle <- "negativo"
                enquanto controle = "negativo" faca
                         escreval("Escolha uma opção válida:")
                         escreval("1- Animal de estimação de infancia.")
                         escreval("2- Melhor amigo da infancia.")
                         escreval("3- Livro preferido.")
                         leia(perguntaSeguranca)
                         limpatela
                         escolha perguntaSeguranca
                                 caso 1,2,3
                                      controle <- "valido"
                                 outrocaso
                                      escreva("Opção inválida.")

                         fimescolha
                fimenquanto
                
                //Finalmente, armazena a responta da pergunta de segurança:
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
                       outrocaso
                            escreval("Opção invalida.")
                fimescolha
                
                limpatela
                escreval("Seu cadastro foi finalizado com sucesso!")
                
             // Caso o usuário não deseje fazer o cadastro:  
             senao
                escreval("Continue navegando na nossa plataforma e volte sempre!")
             fimse
          
          // Caso ele digite algo diferente de 1 ou 2 na resposta da pergunta se já possui um cadastro:
          outrocaso
              escreval("Continue navegando na nossa plataforma e volte sempre!")
          fimescolha
       fimescolha
Fimalgoritmo
