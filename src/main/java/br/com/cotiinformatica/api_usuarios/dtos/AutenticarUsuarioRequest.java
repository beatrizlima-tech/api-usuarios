package br.com.cotiinformatica.api_usuarios.dtos;

/*
    DTO para entrada de dados do serviço
    de autenticação
 */
public record AutenticarUsuarioRequest(
        String email, //Email do usuário
        String senha //Senha do usuário
) {
}
