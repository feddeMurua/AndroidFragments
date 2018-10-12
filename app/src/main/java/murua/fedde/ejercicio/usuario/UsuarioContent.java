package murua.fedde.ejercicio.usuario;

import java.util.ArrayList;

public class UsuarioContent {

    private static ArrayList<Usuario> usuarioList=new ArrayList();
    public static ArrayList getUsuarionList(){
        return usuarioList;
    }

    public static void loadUsuarioList(){
        Usuario usuario;
        usuario = new Usuario(0,"Federico","Murua","fedde.murua@gmail.com","M");
        usuarioList.add(usuario);
    }

}
