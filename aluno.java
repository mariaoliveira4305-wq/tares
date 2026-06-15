class Aluno extends Pessoa {
    private String curso;
    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void saudacao() {
        javax.swing.JOptionPane.showMessageDialog(null, 
            "Olá, eu sou " + getNome() + " e sou aluno do curso de " + curso);
    }
} 

    

 