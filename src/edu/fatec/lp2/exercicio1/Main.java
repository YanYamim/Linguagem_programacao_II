package edu.fatec.lp2.exercicio1;

public class Main {
    public static void main(String[] args) {
        Contatinho[] contatos = new Contatinho[3];
        Mensagem[] mensagens = new Mensagem[3];

        Whatsapp whatsapp = new Whatsapp(contatos, mensagens);

        Contatinho contato1 = new Contatinho("Alice", "12345-6789");
        Contatinho contato2 = new Contatinho("Bob", "98765-4321");

        whatsapp.getContatos()[0] = contato1;
        whatsapp.getContatos()[1] = contato2;

        Mensagem mensagemTexto = new MsgTexto(contato1, "10:00", "Olá, Alice!", 15);
        Mensagem mensagemAudio = new MsgAudio(contato2, "10:05", "Mensagem de áudio", 30);
        Mensagem mensagemFoto = new MsgFoto(contato1, "10:10", "Foto da festa", 500);

        whatsapp.getMensagens()[0] = mensagemTexto;
        whatsapp.getMensagens()[1] = mensagemAudio;
        whatsapp.getMensagens()[2] = mensagemFoto;

        System.out.println("Contatos: ");
        whatsapp.listarContatos();

        System.out.println("Mensagens: ");
        whatsapp.listarMensagens();
    }
}

