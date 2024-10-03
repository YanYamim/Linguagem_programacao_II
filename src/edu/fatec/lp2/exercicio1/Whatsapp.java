package edu.fatec.lp2.exercicio1;

import java.util.ArrayList;

public class Whatsapp {
    private ArrayList<Contatinho> contatos;
    private ArrayList<Mensagem> mensagens;

    public Whatsapp() {
        contatos = new ArrayList<>();
        mensagens = new ArrayList<>();
    }

    public ArrayList<Contatinho> getContatos() {
        return contatos;
    }

    public void adicionarContato(Contatinho contatinho) {
        contatos.add(contatinho);
    }

    public void adicionarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void listarContatos() {
        for(Contatinho contato : contatos) {
            if(contato != null) {
                System.out.println(contato);
            }
        }
    }

    public void listarMensagens() {
        for(Mensagem mensagen : mensagens) {
            if(mensagen != null) {
                System.out.println(mensagen);
            }
        }
    }
}
