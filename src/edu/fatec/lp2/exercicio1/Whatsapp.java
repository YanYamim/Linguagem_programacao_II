package edu.fatec.lp2.exercicio1;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[]  mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public Contatinho[] getContatos() {
        return contatos;
    }

    public Mensagem[] getMensagens() {
        return mensagens;
    }

    public void listarContatos() {
        for(Contatinho contato : contatos) {
            System.out.println(contato);;
        }
    }

    public void listarMensagens() {
        for(Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }
}
