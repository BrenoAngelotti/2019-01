package br.edu.utfpr.negocio;

import java.util.List;

import br.edu.utfpr.dto.ClienteDTO;
import br.edu.utfpr.excecao.NomeClienteMenor5CaracteresException;

public class ClienteNegocio {

    public void incluir(ClienteDTO cliente) throws NomeClienteJaExisteException {

        if (this.listar().stream().anyMatch(c -> c.getNome().equalsIgnoreCase(cliente.getNome())))
            throw new NomeClienteJaExisteException(nome);

        // Chamar ClienteDAO para realizar persistência

    }

    public List<ClienteDTO> listar() {
        throw new UnsupportedOperationException();
        // Usar ClienteDAO para retornar valores no banco
    }
}