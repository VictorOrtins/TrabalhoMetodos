package MealMingle.Models;

public interface UsuarioIF {
    // Métodos que todos os usuários devem implementar
    void adicionar();
    void atualizar();
    void remover();
}

public abstract class UsuarioAbstrato implements UsuarioIF {
    // Campos comuns a todos os usuários
    protected String id;
    protected String nome;

    // Implementação de métodos comuns, se houver
    // Os métodos abstratos serão implementados pelas subclasses
    public abstract void adicionar();
    public abstract void atualizar();
    public abstract void remover();
}

