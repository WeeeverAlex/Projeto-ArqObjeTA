package br.com.conta.api.mensagem;

import br.com.conta.api.Usuario.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mensagem_arquivo")
@NoArgsConstructor
public class MensagemArquivo  {

    @Column(name = "nome_arquivo")
    private String nome_do_arquivo;

    @Column(name = "caminho_arquivo")
    private String caminho_do_arquivo;

    @Column(name = "sender")
    private Usuario sender;

    @Column(name = "receiver")
    private Usuario receiver;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "identifier", nullable = false, unique = true)
    private String identifier;
    
}
