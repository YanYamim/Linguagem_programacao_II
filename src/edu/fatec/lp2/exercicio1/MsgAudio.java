package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinantario, String horaEnvio, String conteudo,  int duracao) {
        super(destinantario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return  "Audio: " + getConteudo() + " (Duração: " + duracao + " segundos) enviado a " + getDestinatario() +
                " às " + getHoraEnvio();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgAudio(getDestinatario(), getHoraEnvio(), conteudo, duracao);
    }
}
