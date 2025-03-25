package br.com.fiap.checkpoint1.service;


import br.com.fiap.checkpoint1.model.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.checkpoint1.repository.PedidoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido salvar(Pedido pedido) {
        if (pedido.getValorTotal() < 0) {
            throw new IllegalArgumentException("O valor total do pedido não pode ser negativo.");
        }
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setClienteNome(pedidoAtualizado.getClienteNome());
            pedido.setValorTotal(pedidoAtualizado.getValorTotal());
            return pedidoRepository.save(pedido);
        }).orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado."));
    }

    public void deletar(Long id) {
        if (!pedidoRepository.existsById(id)) {
            throw new IllegalArgumentException("Pedido não encontrado.");
        }
        pedidoRepository.deleteById(id);
    }
}