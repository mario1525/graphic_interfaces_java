
package quiz_abstrab;


public class NadoSincronizado extends EquipoNatacion{
    private int anios_esperiencia;

    public NadoSincronizado() {
    }
    
    

    public NadoSincronizado(int anios_esperiencia) {
        this.anios_esperiencia = anios_esperiencia;
    }

    public int getAnios_esperiencia() {
        return anios_esperiencia;
    }

    public void setAnios_esperiencia(int anios_esperiencia) {
        this.anios_esperiencia = anios_esperiencia;
    }
    
    public void perfeccionistas(){
        
    }

    @Override
    public void divertise() {
        System.out.println("es muy divertida la natyacion");
    }

    @Override
    public void viajar() {
        System.out.println("viajamos mucho por diferentes ciudades");
    }

    @Override
    public void competir() {
        System.out.println("las competencias son exigentes");
    }

    @Override
    public String toString() {
        return super.toString()+"NadoSincronizado{" + "anios_esperiencia=" + anios_esperiencia + '}';
    }
    
    
}
