package edu.fatec.lp2.exercicio1;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
	}

    public Contatinho[] getContatos() {
        return contatos;
    }

    public void setContatos(Contatinho[] contatos) {
        this.contatos = contatos;
    }

    public Mensagem[] getMensagens() {
        return mensagens;
    }

    public void setMensagens(Mensagem[] mensagens) {
        this.mensagens = mensagens;
    }

    public void listarContatos() {
        for (int i = 0; i < contatos.length; i++) {
            System.out.println(contatos[i]);
        }
    }

    public void listarMensagens() {
        for (int i = 0; i < mensagens.length; i++) {
            System.out.println(mensagens[i]);
        }
    }
}
