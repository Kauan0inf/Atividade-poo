public class Pessoas {
    
    private int idade;
    private String nome;
    private String corOlhos;
    private String corCabelos;
    private String sexo;
    private double altura;
    private double peso;

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getCorOlhos() {
        return corOlhos;
    }
    public String getCorCabelos() {
        return corCabelos;
    }
    public String getSexo() {
        return sexo;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
    public void setCorCabelos(String corCabelos) {
        this.corCabelos = corCabelos;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Pessoas(int idade, String nome, String corOlhos, String corCabelos, String sexo, double altura,double peso) {
        this.idade = idade;
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.corCabelos = corCabelos;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    public Pessoas(String nome) {
        this.nome = nome;
    }
    public Pessoas() {
    }
    
    
    

}
