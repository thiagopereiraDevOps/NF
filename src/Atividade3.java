public class Atividade3 {
    public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Joao");
        fisica.setCpf(12345678901L);

        PessoaJuridica juridica = new PessoaJuridica();
        juridica.setNome("SeTecnologia");
        juridica.setCnpj(1000100012345678L);

        Pessoa[] pessoas= new Pessoa[2];
        pessoas[0] = fisica;
        pessoas[1] = juridica;

        for (int i = 0; i < pessoas.length; ++i) {
            System.out.println(pessoas[i].getNome());
        }
    }
}
