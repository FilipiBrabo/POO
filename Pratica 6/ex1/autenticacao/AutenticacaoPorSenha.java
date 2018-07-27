package autenticacao;

import java.util.Scanner;

import autenticacao.UsuarioAutenticado;

public class AutenticacaoPorSenha implements IMetodoAutenticacao{
   

    @Override
    public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo:");
        int codTeste = sc.nextInt();

        System.out.println("Digite o nome:");
        String nomeTeste = sc.nextLine();
        sc.nextLine();

        System.out.println("Digite a SENHA");
        int senha = sc.nextInt();

        if (senha == 1234) {
            return new UsuarioAutenticado(codTeste, nomeTeste);
        } else {
            throw new UsuarioNaoAutenticadoException();
        }
    }
}