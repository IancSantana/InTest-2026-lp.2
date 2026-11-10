package br.ufpb.chatbot;

public class Cliente {
    private String id;
    private String nome;
    private String telefone;
    private String status;

    public Cliente(String id, String nome, String telefone, String status) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.status = status;
    }

    public Cliente() {
        this("", "", "", "INATIVO");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nome=" + nome + ", Telefone=" + telefone + ", Status=" + status + "]";
    }
}