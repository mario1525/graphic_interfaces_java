
package quiz_abstrab;


public class main {
    public static void main(String[] args) {
        calbadista clab = new calbadista();
        clab.ariesgado();
        clab.competir();
        clab.divertise();
        clab.viajar();
        clab.setEdad(24);
        clab.setEstatuta(180);
        clab.setApellido("beltran");
        clab.setId(45);
        clab.setNombre("mario");
        clab.setPeso(80);
        System.out.println(clab);
        
        Entrenador ent = new Entrenador();        
        ent.competir();
        ent.divertise();
        ent.viajar();
        ent.setEdad(24);
        ent.setId_regional(8574);
        ent.setApellido("beltran");
        ent.setId(45);
        ent.setNombre("mario");
        
        System.out.println(ent);
        
        NadoSincronizado nado = new NadoSincronizado();        
        nado.competir();
        nado.divertise();
        nado.viajar();
        nado.setEdad(24);
        nado.setAnios_esperiencia(8574);
        nado.setApellido("beltran");
        nado.setId(45);
        nado.setNombre("mario");
        
        System.out.println(nado);
    }
}
