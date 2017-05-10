package com.example.patinho.logoali;

import java.util.ArrayList;

class BancoDeDadosTeste {

    private static Estabelecimento[] estabelecimentos = new Estabelecimento[]{
            new Estabelecimento(0, "Corte Rápido", "Rua México", "523", "Vista Verde", "São José dos Campos", "38655545", 0, 5f),
            new Estabelecimento(1, "Corte Bom", "Rua Tubarão", "88", "Aquários", "São José dos Campos", "39900258", 1, 4.5f),
            new Estabelecimento(2, "Corte Lindo", "Rua Parafuso", "994", "Jardim das industrias", "São José dos Campos", "33590663", 2, 5f),
            new Estabelecimento(3, "Corte Prático", "Rua dos Macacos", "110", "Vila Madrid", "Caçapava", "33255222", 3, 4f),
            new Estabelecimento(4, "Corte Limpo", "Avenida dos Limões", "2056", "Vale das Frutas", "Caçapava", "35459900", 4, 5f),
            new Estabelecimento(5, "Cabelo Bom", "Avenida São José", "415", "Marlene Miranda", "Pindamonhangaba", "42218988", 5, 4.5f),
            new Estabelecimento(6, "Cabelo Pronto", "Praça das bolhas", "80", "Centro", "Pindamonhangaba", "33212122", 6, 3f),
            new Estabelecimento(7, "Cabelo Colorido", "Rua da Petunia", "784", "Jardim das Flores", "Pindamonhangaba", "34445496", 7, 4.74f),
            new Estabelecimento(8, "Cabelo no Chão", "Rua do sogro", "69", "Cunha", "Jacareí", "32246996", 8, 5f),
    };

    private static Usuario[] usuarios = new Usuario[]{
            new Usuario(0, "João", "Paulo", "25864592514", "jaopaulo@gmail.com", "minha15senha", Usuario.Role.ADMIN),
            new Usuario(1, "Pedro", "Ramos", "25419988800", "pramos@gmail.com", "msdha", Usuario.Role.USER),
            new Usuario(2, "Victor", "Coelho", "37058869590", "vicoelho@gmail.com", "suecas449", Usuario.Role.ADMIN),
            new Usuario(3, "Felipe", "Vasconcellos", "45512165890", "fefaoao@gmail.com", "pal55meiras", Usuario.Role.USER),
            new Usuario(4, "Renata", "Guimarães", "35500026556", "renatinha_lolo@gmail.com", "meninassuperpoderosas", Usuario.Role.USER),
            new Usuario(5, "Tomas", "Turbando", "15122237840", "tomastur@gmail.com", "tomesmo", Usuario.Role.USER),
            new Usuario(6, "Bianca", "Preto", "15199222306", "biamar@gmail.com", "6738894", Usuario.Role.USER),
            new Usuario(7, "Fernanda", "Rubião", "27789669500", "fea055@gmail.com", "458448748as", Usuario.Role.USER),
            new Usuario(8, "Dener", "Desmond", "16497585420", "dede@gmail.com", "acS269", Usuario.Role.ADMIN),
            new Usuario(8, "Rodrigo", "Salles", "98908754577", "rsalles@gmail.com", "975791", Usuario.Role.ADMIN),
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

    public static Usuario selectAdministrador(int id){
        for(Usuario a : usuarios){
            if(a.getmIdAdministrador() == id){
                return a;
            }
        }
        return null;
    }

    public static Usuario selectAdministradorByEmail(String email){
        for(Usuario a : usuarios){
            if(a.getmEmail().equalsIgnoreCase(email)){
                return a;
            }
        }
        return null;
    }

    /**
     *
     * @param email
     * @param password
     * @return 1 = sucesso, -1 = senha incorreta, -2 = usuário incorreto
     */
    public static int authenticateUser(String email, String password){
        Usuario user = selectAdministradorByEmail(email);

        if (user == null)
            return -2;

        if (user.getmSenha().equals(password))
            return 1;
        else
            return -1;
    }
}