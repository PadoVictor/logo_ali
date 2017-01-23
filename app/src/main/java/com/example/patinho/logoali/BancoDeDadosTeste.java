package com.example.patinho.logoali;

import java.util.ArrayList;

class BancoDeDadosTeste {

    private static Estabelecimento[] estabelecimentos = new Estabelecimento[]{
            new Estabelecimento(0, "Corte Rápido", "Rua México", "523", "Vista Verde", "São José dos Campos", "38655545"
                    , new Administrador("João", "Paulo", "25864592514", "jaopaulo@gmail.com", "minha15senha")),
            new Estabelecimento(1, "Corte Bom", "Rua Tubarão", "88", "Aquários", "São José dos Campos", "39900258"
                    , new Administrador("Pedro", "Ramos", "25419988800", "pramos@gmail.com", "msdha")),
            new Estabelecimento(2, "Corte Lindo", "Rua Parafuso", "994", "Jardim das industrias", "São José dos Campos", "33590663"
                    , new Administrador("Victor", "Coelho", "37058869590", "vicoelho@gmail.com", "suecas449")),
            new Estabelecimento(3, "Corte Prático", "Rua dos Macacos", "110", "Vila Madrid", "Caçapava", "33255222"
                    , new Administrador("Felipe", "Vasconcellos", "45512165890", "fefaoao@gmail.com", "pal55meiras")),
            new Estabelecimento(4, "Corte Limpo", "Avenida dos Limões", "2056", "Vale das Frutas", "Caçapava", "35459900"
                    , new Administrador("Renata", "Guimarães", "35500026556", "renatinha_lolo@gmail.com", "meninassuperpoderosas")),
            new Estabelecimento(5, "Cabelo Bom", "Avenida São José", "415", "Marlene Miranda", "Pindamonhangaba", "42218988"
                    , new Administrador("Tomas", "Turbando", "15122237840", "tomastur@gmail.com", "tomesmo")),
            new Estabelecimento(6, "Cabelo Pronto", "Praça das bolhas", "80", "Centro", "Pindamonhangaba", "33212122"
                    , new Administrador("Bianca", "Preto", "15199222306", "biamar@gmail.com", "6738894")),
            new Estabelecimento(7, "Cabelo Colorido", "Rua da Petunia", "784", "Jardim das Flores", "Pindamonhangaba", "34445496"
                    , new Administrador("Fernanda", "Rubião", "27789669500", "fea055@gmail.com", "458448748as")),
            new Estabelecimento(8, "Cabelo no Chão", "Rua do sogro", "69", "Cunha", "Jacareí", "32246996"
                    , new Administrador("Dener", "Desmond", "16497585420", "dede@gmail.com", "acS269")),
    };

    public static ArrayList<Estabelecimento> selectEstabelecimentoByCidade(String cidade) {
        ArrayList<Estabelecimento> arrayListEstabelecimento = new ArrayList<>();
        if (cidade.isEmpty()) {
            return arrayListEstabelecimento;
        }
        for (Estabelecimento e : estabelecimentos) {
            //Gambiarra para ignorar maiúsculas
            if (e.getmCidadeDoEstabelecimento().toUpperCase().contains(cidade.toUpperCase())) {
                arrayListEstabelecimento.add(e);
            }
        }
        return arrayListEstabelecimento;
    }

    public static Estabelecimento selectEstabelecimento(int id) {
        for (Estabelecimento e : estabelecimentos) {
            if (e.getmId() == id) {
                return e;
            }
        }
        return null;
    }
}
