public class Aluno {
    private String nome;
    private int idade;
    private String documento;

    /**
     *  Cria um objeto de um aluno
     * @param nome espera o nome do aluno
     * @param idade espera a idade do aluno
     * @param documento espera o documento do aluno
     */
    public Aluno(String nome, int idade, String documento) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setDocumento(documento);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()){
            this.nome = nome;
        } else {
            System.out.println(this.retornaErro("nome"));
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade>10 && idade<=18){
            this.idade = idade;
        } else {
            System.out.println(this.retornaErro("idade"));
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento.length() >= 10){
            this.documento = documento;
        } else {
            System.out.println(this.retornaErro("documento"));
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + this.getNome() + '\'' +
                ", idade=" + this.getIdade() +
                ", documento='" + this.getDocumento() + '\'' +
                '}';
    }

    /**
     * Retorna uma string de erro, para caso as condições dos sets não sejam respeitadas
     * @param String tipo de erro que será retornado
     * @return String contendo o texto do erro a ser exibido na view
     */
    private String retornaErro(String tipo){
        String erro = "";
        switch (tipo){
            case "nome":
                erro ="Nome não pode ser nulo\n";
                break;
            case "idade":
                erro = "Idade tem que estar entre 10 e 18 anos\n";
                break;
            case "documento":
                erro = "Documento não pode ser nulo e deve conter 10 caracteres\n";
                break;
        }
        return erro;
    }
}
