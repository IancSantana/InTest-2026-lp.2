package br.ufpb.agenda;

public class AgendaEnderecos {
    private Contato[] contatos;
    private int maxContatos;
    private int totalContatos;

    public AgendaEnderecos(int maxContatos) {
        this.maxContatos = maxContatos;
        this.contatos = new Contato[maxContatos];
        this.totalContatos = 0;
    }

    public boolean cadastraContato(String nome, Endereco endereco) {
        if (totalContatos < maxContatos) {
            contatos[totalContatos] = new Contato(nome, endereco);
            totalContatos++;
            return true;
        }
        return false;
    }

    public Endereco pesquisaEndereco(String nomeContato) {
        for (int i = 0; i < totalContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nomeContato)) {
                return contatos[i].getEndereco();
            }
        }
        return null;
    }

    public boolean apagaContato(String nomeContato) {
        for (int i = 0; i < totalContatos; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nomeContato)) {
                for (int j = i; j < totalContatos - 1; j++) {
                    this.contatos[j] = this.contatos[j + 1];
                }
                this.contatos[totalContatos - 1] = null;
                totalContatos--;
                return true;
            }
        }
        return false;
    }

    public Contato[] pesquisarContatosPorBairro(String bairro) {
        int count = 0;
        for (int i = 0; i < totalContatos; i++) {
            if (contatos[i].getEndereco() != null && contatos[i].getEndereco().getBairro().equalsIgnoreCase(bairro)) {
                count++;
            }
        }
        Contato[] resultado = new Contato[count];
        int idx = 0;
        for (int i = 0; i < totalContatos; i++) {
            if (contatos[i].getEndereco() != null && contatos[i].getEndereco().getBairro().equalsIgnoreCase(bairro)) {
                resultado[idx++] = contatos[i];
            }
        }
        return resultado;
    }
}