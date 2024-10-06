package edu.fatec.lp2.exercicio1;

public class Main {
    public static void main(String[] args) {
                Whatsapp whatsapp = new Whatsapp();

                Contatinho contato1 = new Contatinho("Alice", "12345-6789");
                Contatinho contato2 = new Contatinho("Bob", "98765-4321");

                whatsapp.getContatos().add(contato1);
                whatsapp.getContatos().add(contato2);

                Mensagem mensagemTexto = new MsgTexto(contato1, "10:00", "Olá, Alice!", 15);
                Mensagem mensagemAudio = new MsgAudio(contato2, "10:05", "Mensagem de áudio", 30);
                Mensagem mensagemFoto = new MsgFoto(contato1, "10:10", "Foto da festa", 500);

                whatsapp.getMensagens().add(mensagemTexto);
                whatsapp.getMensagens().add(mensagemAudio);
                whatsapp.getMensagens().add(mensagemFoto);

                System.out.println("Contatos:");
                whatsapp.listarContatos();

                System.out.println("\nMensagens:");
                whatsapp.listarMensagens();
    }
}

