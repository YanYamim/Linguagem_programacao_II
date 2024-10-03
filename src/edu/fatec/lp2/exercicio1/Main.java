package edu.fatec.lp2.exercicio1;

public class Main {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();

        whatsapp.adicionarContato(new Contatinho("Alice", "123-456-789"));
        whatsapp.adicionarContato(new Contatinho("Bob", "987-654-321"));

        Mensagem mensagemTexto = new MsgTexto(whatsapp.getContatos().get(0), "10:00", "Olá, Bob!");
        whatsapp.adicionarMensagem(mensagemTexto);

        Mensagem novaMensagemTexto = mensagemTexto.sendMessage("Como você está?");
        whatsapp.adicionarMensagem(novaMensagemTexto);

        Mensagem mensagemFoto = new MsgFoto(whatsapp.getContatos().get(1), "10:05", "Foto de viagem", 300);
        whatsapp.adicionarMensagem(mensagemFoto);
        Mensagem novaMensagemFoto = mensagemFoto.sendMessage("Nova foto!");
        whatsapp.adicionarMensagem(novaMensagemFoto);

        Mensagem mensagemAudio = new MsgAudio(whatsapp.getContatos().get(0), "10:10", "Mensagem de voz", 15);
        whatsapp.adicionarMensagem(mensagemAudio);
        Mensagem novaMensagemAudio = mensagemAudio.sendMessage("Gravação de áudio!");
        whatsapp.adicionarMensagem(novaMensagemAudio);

        whatsapp.listarContatos();
        whatsapp.listarMensagens();
    }
}
