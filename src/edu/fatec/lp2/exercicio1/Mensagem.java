package edu.fatec.lp2.exercicio1;

abstract class Mensagem {
    private  Contatinho destinatario;
    private  String horaEnvio;
    private  String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public abstract String toString();

    public abstract Mensagem sendMessage(String conteudo);
}
