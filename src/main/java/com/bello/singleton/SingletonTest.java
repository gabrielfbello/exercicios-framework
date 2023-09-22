package com.bello.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Gabriel F. Bello");

        UsuarioLogado usuarioLogado = UsuarioLogado.getInstancia();
        usuarioLogado.setUsuario(usuario);

        UsuarioLogado usuarioLogado2 = UsuarioLogado.getInstancia();
        System.out.println(usuarioLogado2.getUsuario());
    }
}
