package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinantario, String horaEnvio, String conteudo, int duracao) {
        super(destinantario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Mensagem para: " + getDestinatario() + getHoraEnvio() + getConteudo();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgAudio(getDestinatario(), getHoraEnvio(), getConteudo(), duracao);
    }
}
