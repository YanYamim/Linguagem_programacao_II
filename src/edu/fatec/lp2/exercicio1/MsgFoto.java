package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho ) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Foto: " + getConteudo() + " (Tamanho: " + tamanho + " KB) enviado a " + getDestinatario() +
                " às " + getHoraEnvio();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgAudio(getDestinatario(), getHoraEnvio(), conteudo, tamanho);
    }
}
