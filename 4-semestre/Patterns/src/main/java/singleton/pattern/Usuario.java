package singleton.pattern;

public class Usuario {
    public static Usuario usuario;

    private Usuario() {

    }

    public static Usuario getInstance(){
        if(usuario == null){
            usuario = new Usuario();
        }
        return usuario;
    }
}
