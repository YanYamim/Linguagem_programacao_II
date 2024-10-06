package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinantario, String horaEnvio, String conteudo, int tamanho) {
		super(destinantario, horaEnvio, conteudo );
        this.tamanho = tamanho;
	}

    @Override
    public String toString() {
        return "Foto: " + getConteudo() + " (Tamanho: " + tamanho + " KB) enviada a " + getDestinatario().getNome() +
                " às " + getHoraEnvio();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        return new MsgFoto(getDestinatario(),getHoraEnvio(),getConteudo(), tamanho);
    }
}
