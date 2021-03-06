package sys.model.pacientes;
// Generated 11/04/2018 12:39:53 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author EduardoArcos
 */

@Entity
@Table(name = "preguntas_paciente")
public class PreguntasPaciente  implements java.io.Serializable {


     private Integer id;
     private AlergiasMedicamentos alergiasMedicamentos;
     private Paciente paciente;
     private Padecimientos padecimientos;
     private String p1;
     private String p2;
     private String p3;
     private String p4;
     private String p5;
     private String p6;
     private String p7;
     private String p8;
     private String p9;
     private String p10;
     private String p11;
     private String p12;
     private String p13;
     private String p14;
     private String p15;
     private String p16;
     private String p17;
     private String p18;
     private String p19;
     private String p20;
     private String p21;
     private String p22;
     private String p23;
     private String p24;
     private String p25;
     private String p26;
     private String p27;
     private String p28;
     private String p29;
     private String p30;
     private String p31;
     private String p32;
     private String p33;
     private String otros;

    public PreguntasPaciente() {
    }

    public PreguntasPaciente(AlergiasMedicamentos alergiasMedicamentos, Paciente paciente, Padecimientos padecimientos, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, String p27, String p28, String p29, String p30, String p31, String p32, String p33, String otros) {
       this.alergiasMedicamentos = alergiasMedicamentos;
       this.paciente = paciente;
       this.padecimientos = padecimientos;
       this.p1 = p1;
       this.p2 = p2;
       this.p3 = p3;
       this.p4 = p4;
       this.p5 = p5;
       this.p6 = p6;
       this.p7 = p7;
       this.p8 = p8;
       this.p9 = p9;
       this.p10 = p10;
       this.p11 = p11;
       this.p12 = p12;
       this.p13 = p13;
       this.p14 = p14;
       this.p15 = p15;
       this.p16 = p16;
       this.p17 = p17;
       this.p18 = p18;
       this.p19 = p19;
       this.p20 = p20;
       this.p21 = p21;
       this.p22 = p22;
       this.p23 = p23;
       this.p24 = p24;
       this.p25 = p25;
       this.p26 = p26;
       this.p27 = p27;
       this.p28 = p28;
       this.p29 = p29;
       this.p30 = p30;
       this.p31 = p31;
       this.p32 = p32;
       this.p33 = p33;
       this.otros = otros;
    }
   
    @Id
    @Column(name = "id")
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "alergias_medicamentos")
    public AlergiasMedicamentos getAlergiasMedicamentos() {
        return this.alergiasMedicamentos;
    }
    
    public void setAlergiasMedicamentos(AlergiasMedicamentos alergiasMedicamentos) {
        this.alergiasMedicamentos = alergiasMedicamentos;
    }
    
    @Column(name = "paciente")
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    @Column(name = "padecimientos")
    public Padecimientos getPadecimientos() {
        return this.padecimientos;
    }
    
    public void setPadecimientos(Padecimientos padecimientos) {
        this.padecimientos = padecimientos;
    }
    
    @Column(name = "p1")
    public String getP1() {
        return this.p1;
    }
    
    public void setP1(String p1) {
        this.p1 = p1;
    }
    
    @Column(name = "p2")
    public String getP2() {
        return this.p2;
    }
    
    public void setP2(String p2) {
        this.p2 = p2;
    }
    
    @Column(name = "p3")
    public String getP3() {
        return this.p3;
    }
    
    public void setP3(String p3) {
        this.p3 = p3;
    }
    
    @Column(name = "p4")
    public String getP4() {
        return this.p4;
    }
    
    public void setP4(String p4) {
        this.p4 = p4;
    }
    
    @Column(name = "p5")
    public String getP5() {
        return this.p5;
    }
    
    public void setP5(String p5) {
        this.p5 = p5;
    }
    
    @Column(name = "p6")
    public String getP6() {
        return this.p6;
    }
    
    public void setP6(String p6) {
        this.p6 = p6;
    }
    
    @Column(name = "p7")
    public String getP7() {
        return this.p7;
    }
    
    public void setP7(String p7) {
        this.p7 = p7;
    }
    
    @Column(name = "p8")
    public String getP8() {
        return this.p8;
    }
    
    public void setP8(String p8) {
        this.p8 = p8;
    }
    
    @Column(name = "p9")
    public String getP9() {
        return this.p9;
    }
    
    public void setP9(String p9) {
        this.p9 = p9;
    }
    
    @Column(name = "p10")
    public String getP10() {
        return this.p10;
    }
    
    public void setP10(String p10) {
        this.p10 = p10;
    }
    
    @Column(name = "p11")
    public String getP11() {
        return this.p11;
    }
    
    public void setP11(String p11) {
        this.p11 = p11;
    }
    
    @Column(name = "p12")
    public String getP12() {
        return this.p12;
    }
    
    public void setP12(String p12) {
        this.p12 = p12;
    }
    
    @Column(name = "p13")
    public String getP13() {
        return this.p13;
    }
    
    public void setP13(String p13) {
        this.p13 = p13;
    }
    
    @Column(name = "p14")
    public String getP14() {
        return this.p14;
    }
    
    public void setP14(String p14) {
        this.p14 = p14;
    }
    
    @Column(name = "p15")
    public String getP15() {
        return this.p15;
    }
    
    public void setP15(String p15) {
        this.p15 = p15;
    }
    
    @Column(name = "p16")
    public String getP16() {
        return this.p16;
    }
    
    public void setP16(String p16) {
        this.p16 = p16;
    }
    
    @Column(name = "p17")
    public String getP17() {
        return this.p17;
    }
    
    public void setP17(String p17) {
        this.p17 = p17;
    }
    
    @Column(name = "p18")
    public String getP18() {
        return this.p18;
    }
    
    public void setP18(String p18) {
        this.p18 = p18;
    }
    
    @Column(name = "p19")
    public String getP19() {
        return this.p19;
    }
    
    public void setP19(String p19) {
        this.p19 = p19;
    }
    
    @Column(name = "p20")
    public String getP20() {
        return this.p20;
    }
    
    public void setP20(String p20) {
        this.p20 = p20;
    }
    
    @Column(name = "p21")
    public String getP21() {
        return this.p21;
    }
    
    public void setP21(String p21) {
        this.p21 = p21;
    }
    
    @Column(name = "p22")
    public String getP22() {
        return this.p22;
    }
    
    public void setP22(String p22) {
        this.p22 = p22;
    }
    
    @Column(name = "p23")
    public String getP23() {
        return this.p23;
    }
    
    public void setP23(String p23) {
        this.p23 = p23;
    }
    
    @Column(name = "p24")
    public String getP24() {
        return this.p24;
    }
    
    public void setP24(String p24) {
        this.p24 = p24;
    }
    
    @Column(name = "p25")
    public String getP25() {
        return this.p25;
    }
    
    public void setP25(String p25) {
        this.p25 = p25;
    }
    
    @Column(name = "p26")
    public String getP26() {
        return this.p26;
    }
    
    public void setP26(String p26) {
        this.p26 = p26;
    }
    
    @Column(name = "p27")
    public String getP27() {
        return this.p27;
    }
    
    public void setP27(String p27) {
        this.p27 = p27;
    }
    
    @Column(name = "p28")
    public String getP28() {
        return this.p28;
    }
    
    public void setP28(String p28) {
        this.p28 = p28;
    }
    
    @Column(name = "p29")
    public String getP29() {
        return this.p29;
    }
    
    public void setP29(String p29) {
        this.p29 = p29;
    }
    
    @Column(name = "p30")
    public String getP30() {
        return this.p30;
    }
    
    public void setP30(String p30) {
        this.p30 = p30;
    }
    
    @Column(name = "p31")
    public String getP31() {
        return this.p31;
    }
    
    public void setP31(String p31) {
        this.p31 = p31;
    }
    
    @Column(name = "p32")
    public String getP32() {
        return this.p32;
    }
    
    public void setP32(String p32) {
        this.p32 = p32;
    }
    
    @Column(name = "p33")
    public String getP33() {
        return this.p33;
    }
    
    public void setP33(String p33) {
        this.p33 = p33;
    }
    
    @Column(name = "otros")
    public String getOtros() {
        return this.otros;
    }
    
    public void setOtros(String otros) {
        this.otros = otros;
    }
}


