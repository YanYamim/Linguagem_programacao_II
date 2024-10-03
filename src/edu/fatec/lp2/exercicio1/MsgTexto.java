package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem{
    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo, int numChar ) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = numChar;
    }

    @Override
    public String toString() {
        return "Texto: " + getConteudo() + " (numChar: " + numChar + " Caracteres) enviado a " + getDestinatario() +
                " às " + getHoraEnvio();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgTexto(getDestinatario(), getHoraEnvio(), conteudo, numChar);
    }
}
