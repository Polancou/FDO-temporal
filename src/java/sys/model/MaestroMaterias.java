package sys.model;
// Generated 14/10/2017 07:17:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import sys.dao.daoMaestro;
import sys.imp.MaestroImp;

/**
 * MaestroMaterias generated by hbm2java
 */
public class MaestroMaterias  implements java.io.Serializable {

  private String clave;
     private Maestro maestro;
     private Materias materias;
     private String grupo;
     private String año;
     private Set<ListaAlumnos> listaAlumnoses = new HashSet<ListaAlumnos>(0);
     private Set<BitacoraRecibos> bitacoraReciboses = new HashSet<BitacoraRecibos>(0);

    public MaestroMaterias() {
       maestro = new Maestro();
       materias = new Materias();
    }

	
    public MaestroMaterias(String clave) {
        this.clave = clave;
    }
    public MaestroMaterias(String clave, Maestro maestro, Materias materias, String grupo, String año, Set<ListaAlumnos> listaAlumnoses, Set<BitacoraRecibos> bitacoraReciboses) {
       this.clave = clave;
       this.maestro = maestro;
       this.materias = materias;
       this.grupo = grupo;
       this.año = año;
       this.listaAlumnoses = listaAlumnoses;
       this.bitacoraReciboses = bitacoraReciboses;
    }
   
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    public Maestro getMaestro() {
        return this.maestro;
    }
    
    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }
    public Materias getMaterias() {
        return this.materias;
    }
    
    public void setMaterias(Materias materias) {
        this.materias = materias;
    }
    public String getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getAño() {
        return this.año;
    }
    
    public void setAño(String año) {
        this.año = año;
    }
    public Set<ListaAlumnos> getListaAlumnoses() {
        return this.listaAlumnoses;
    }
    
    public void setListaAlumnoses(Set<ListaAlumnos> listaAlumnoses) {
        this.listaAlumnoses = listaAlumnoses;
    }
    public Set<BitacoraRecibos> getBitacoraReciboses() {
        return this.bitacoraReciboses;
    }
    
    public void setBitacoraReciboses(Set<BitacoraRecibos> bitacoraReciboses) {
        this.bitacoraReciboses = bitacoraReciboses;
    }


}


