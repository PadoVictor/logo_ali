package com.example.patinho.logoali;

class BancoDeDadosTeste {

    private static Estabelecimento[] estabelecimentos = new Estabelecimento[]{
            new Estabelecimento("Corte Rápido", "São José dos Campos", "Vista Verde"),
            new Estabelecimento("Corte Bom", "São José dos Campos", "Aquários"),
            new Estabelecimento("Corte Lindo", "São José dos Campos", "Jardim das Industrias"),
            new Estabelecimento("Corte Prático", "Caçapava", "Centro"),
            new Estabelecimento("Corte Limpo", "Caçapava", "Vila Nova"),
            new Estabelecimento("Cabelo Bom", "Pindamonhangaba", "Marlene Miranda"),
            new Estabelecimento("Cabelo Pronto", "Pindamonhangaba", "Centro"),
            new Estabelecimento("Cabelo Colorido", "Pindamonhangaba", "Jardim das Flores"),
            new Estabelecimento("Cabelo no Chão", "Jacarei", "Cunha")
    };

    static Estabelecimento[] getEstabelecimento() {
        return estabelecimentos;
    }
}
