package autenticacao;

import java.util.Scanner;

public class AutenticacaoPorSwipe implements IMetodoAutenticacao {
    
    @Override
    public UsuarioAutenticado autenticar() throws UsuarioNaoAutenticadoException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo:");
        int codTeste = sc.nextInt();

        System.out.println("Digite o nome:");
        String nomeTeste = sc.nextLine();
        sc.nextLine();

        imprimeSwipe();

        System.out.println("Digite a sequencia de swipe (xy)");
        int seq = sc.nextInt();
        
        if (seq == 112233) {
            return new UsuarioAutenticado(codTeste, nomeTeste);
        } else {
            throw new UsuarioNaoAutenticadoException();
        }
    }

    private void imprimeSwipe() {
        System.out.println("   1   2   3\n\n1  o   o   o\n\n2  o   o   o\n\n3  o   o   o");
    }

}