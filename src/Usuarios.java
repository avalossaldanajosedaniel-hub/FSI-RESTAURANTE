import java.sql.*;

public class Usuarios {
    public static final String todos = "SELECT id_usuario, usuario, nombre, rol, estado FROM usuarios ORDER BY nombre";
    public int id;
    public String usuario, nombre, clave, rol, estado;

    public Usuarios() {}
    public Usuarios(int id, String usuario, String nombre, String clave, String rol, String estado) {
        this.id=id; this.usuario=usuario; this.nombre=nombre; this.clave=clave;
        this.rol=rol; this.estado=estado;
    }
    public int insertar(Connection con) throws SQLException {
        String sql="INSERT INTO usuarios (usuario,nombre,clave_hash,rol,estado) VALUES (?,?,SHA2(?,256),?,?)";
        try (PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1,usuario); ps.setString(2,nombre); ps.setString(3,clave);
            ps.setString(4,rol); ps.setString(5,estado); return ps.executeUpdate();
        }
    }
    public int actualiza(Connection con) throws SQLException {
        String sql = (clave==null || clave.isEmpty())
          ? "UPDATE usuarios SET usuario=?,nombre=?,rol=?,estado=? WHERE id_usuario=?"
          : "UPDATE usuarios SET usuario=?,nombre=?,rol=?,estado=?,clave_hash=SHA2(?,256) WHERE id_usuario=?";
        try (PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1,usuario); ps.setString(2,nombre); ps.setString(3,rol); ps.setString(4,estado);
            if (clave==null || clave.isEmpty()) ps.setInt(5,id);
            else {ps.setString(5,clave); ps.setInt(6,id);}
            return ps.executeUpdate();
        }
    }
    public int borrar(Connection con) throws SQLException {
        try (PreparedStatement ps=con.prepareStatement("DELETE FROM usuarios WHERE id_usuario=?")) {
            ps.setInt(1,id); return ps.executeUpdate();
        }
    }
    public static boolean existe(Connection con, String usuario) throws SQLException {
        try (PreparedStatement ps=con.prepareStatement("SELECT 1 FROM usuarios WHERE usuario=?")) {
            ps.setString(1,usuario); try(ResultSet rs=ps.executeQuery()){return rs.next();}
        }
    }
}
