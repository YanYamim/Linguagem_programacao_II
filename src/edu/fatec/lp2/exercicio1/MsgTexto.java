package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem{
    private int numChar;

    public MsgTexto(Contatinho destinantario, String horaEnvio, String conteudo, int numChar) {
        super(destinantario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    @Override
    public String toString() {
        return "Texto: " + getConteudo() + " (Caracteres: " + numChar + ") enviado a " + getDestinatario().getNome() +
                " às " + getHoraEnvio();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgFoto(getDestinatario(),getHoraEnvio(),getConteudo(), numChar);
    }
}
