<h3>Cenários de testes:</h3>
https://bugbank.netlify.app/
   <p><br /></p>

1) - [ ] Registrar conta com saldo inicial:
   - Dado: que o usuário não possui conta no banco
   - Quando: criar uma conta, marcar a opção "Criar conta com saldo ?"
   - Então: a conta é criada com um saldo inicial
   <p><br /></p>
2) - [ ] Registrar conta sem saldo inicial
   - Dado: que o usuário não possui conta no banco
   - Quando: criar uma conta, não marcar a opção "Criar conta com saldo ?"
   - Então: a conta é criada sem saldo inicial
    <p><br /></p>
3) - [ ] Fazer login com e-mail incorreto
   - Dado: que o usuário vai fazer login
   - Quando: digitar um e-mail incorreto
   - Então: o sistema não permite o login
     <p><br /></p>
4) - [ ] Fazer login com senha incorreta
   - Dado: que o usuário vai fazer login
   - Quando: digitar uma senha incorreta
   - Então: o sistema não permite o login
     <p><br /></p>
5) - [ ] Fazer login com e-mail e senha corretos
   - Dado: que o usuário vai fazer login
   - Quando: digitar um e-mail e senha corretos
   - Então: o sistema permite o login
     <p><br /></p>
6) - [ ] Fazer transferência para conta inexistente
   - Dado: que o usuário vai fazer uma transferência
   - Quando: digitar um número de conta e/ou dígito inexistente
   - Então: o sistema não permite a transferência
     <p><br /></p>
7) - [ ] Fazer transferência com saldo insuficiente
   - Dado: que o usuário vai fazer uma transferência
   - Quando: digitar um valor maior que o saldo da conta
   - Então: o sistema não permite a transferência
     <p><br /></p>
8) - [ ] Fazer transferência para conta existente com saldo suficiente
   - Dado: que o usuário vai fazer uma transferência
   - Quando: digitar um número de conta e dígito existentes e um valor menor que o saldo da conta
   - Então: o sistema permite a transferência
     <p><br /></p>
9) - [ ] Consultar "Pagamentos"
   - Dado: que o usuário vai consultar os pagamentos
   - Quando: clicar no botão "Pagamentos"
   - Então: o sistema exibe os pagamentos
     <p><br /></p>
10) - [ ] Consultar "Extrato"
    - Dado: que o usuário vai consultar o extrato
    - Quando: clicar no botão "Extrato"
    - Então: o sistema exibe o extrato
      <p><br /></p>
11) - [ ] Consultar "Saque"
    - Dado: que o usuário vai consultar o saque
    - Quando: clicar no botão "Saque"
    - Então: o sistema exibe a tela de saque
      <p><br /></p>
12) - [ ] Sair do sistema
    - Dado: que o usuário vai sair do sistema
    - Quando: clicar no botão "Sair"
    - Então: o sistema encerra a sessão