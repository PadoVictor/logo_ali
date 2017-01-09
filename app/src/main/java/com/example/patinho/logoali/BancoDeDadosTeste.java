package com.example.patinho.logoali;

public class BancoDeDadosTeste {

    Estabelecimento estabelecimento0 = new Estabelecimento("Corte Rápido", "São José dos Campos", "Vista Verde");
    Estabelecimento estabelecimento1 = new Estabelecimento("Corte Bom", "São José dos Campos", "Aquários");
    Estabelecimento estabelecimento2 = new Estabelecimento("Corte Lindo", "São José dos Campos", "Jardim das Industrias");
    Estabelecimento estabelecimento3 = new Estabelecimento("Corte Prático", "Caçapava", "Centro");
    Estabelecimento estabelecimento4 = new Estabelecimento("Corte Limpo", "Caçapava", "Vila Nova");
    Estabelecimento estabelecimento5 = new Estabelecimento("Cabelo Bom", "Pindamonhangaba", "Marlene Miranda");
    Estabelecimento estabelecimento6 = new Estabelecimento("Cabelo Pronto", "Pindamonhangaba", "Centro");
    Estabelecimento estabelecimento7 = new Estabelecimento("Cabelo Colorido", "Pindamonhangaba", "Jardim das Flores");
    Estabelecimento estabelecimento8 = new Estabelecimento("Cabelo no Chão", "Jacarei", "Cunha");

    Estabelecimento[] estabelecimentos = new Estabelecimento[9];

    private void atribuir() {
        estabelecimentos[0] = estabelecimento0;
        estabelecimentos[1] = estabelecimento1;
        estabelecimentos[2] = estabelecimento2;
        estabelecimentos[3] = estabelecimento3;
        estabelecimentos[4] = estabelecimento4;
        estabelecimentos[5] = estabelecimento5;
        estabelecimentos[6] = estabelecimento6;
        estabelecimentos[7] = estabelecimento7;
        estabelecimentos[8] = estabelecimento8;
    }

    public Estabelecimento[] getEstabelecimento(){
        atribuir();
        return estabelecimentos;
    }
}
