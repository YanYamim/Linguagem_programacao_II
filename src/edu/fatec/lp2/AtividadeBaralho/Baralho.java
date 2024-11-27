package edu.fatec.lp2.AtividadeBaralho;

public class Baralho {
    private Carta[] cartas;
    private int cartasRestantes;

    public Baralho() {
        cartas = new Carta[52];
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String[] naipes = {"Espadas", "Copas", "Paus", "Ouros"};

        int posicao = 0;
        for(String naipe : naipes) {
            for(String nome : nomes){
                if(posicao < 48) {
                    cartas[posicao++] = new Carta(nome, naipe);
                } else {
                    cartas[posicao++] = new Carta("Coringa", "Coringa");
                }
            }
        }
    cartasRestantes = 52;
    }

    public void embaralhar() {
        for(int i = 0; i < cartasRestantes; i++) {
            int j = (int)(Math.random() * cartas.length);
            int k = (int)(Math.random() * cartas.length);

            Carta temp = cartas[j];
            cartas[j] = cartas[k];
            cartas[k] = temp;
        }
    }

    public boolean hasCarta() {
        return cartasRestantes > 0;
    }

    public Carta distribuirCarta() {
        if(hasCarta()) {
            return cartas[--cartasRestantes];
        } else {
           return null;
        }
    }

    public void imprimirBaralho() {
        for(int i = 0; i < cartasRestantes; i++){
            System.out.println(cartas[i].getNome() + "de " + cartas[i].getNaipe());
        }
    }
}
