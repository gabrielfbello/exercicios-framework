package com.bello.singleton;

public class UsuarioLogado {
    private static UsuarioLogado instancia;
    private Usuario usuario;

    private UsuarioLogado() {}  // Construtor privado para evitar instancias fora da classe

    public static UsuarioLogado getInstancia() {
        if (instancia == null) {
            synchronized (UsuarioLogado.class) {
                if (instancia == null) {
                    instancia = new UsuarioLogado();
                }
            }
        }
        return instancia;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}

