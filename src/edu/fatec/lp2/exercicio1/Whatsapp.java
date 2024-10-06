package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;

public class Whatsapp {
    private ArrayList<Contatinho> contatos;
    private ArrayList<Mensagem> mensagens;

    public Whatsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    public ArrayList<Contatinho> getContatos() {
        return contatos;
    }

    public ArrayList<Mensagem> getMensagens() {
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
