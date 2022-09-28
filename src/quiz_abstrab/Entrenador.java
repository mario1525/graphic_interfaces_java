
package quiz_abstrab;


public class Entrenador extends EquipoNatacion{
    private int id_regional;

    public Entrenador(int id_regional) {
        this.id_regional = id_regional;
    }

    public Entrenador() {
    }

    public int getId_regional() {
        return id_regional;
    }

    public void setId_regional(int id_regional) {
        this.id_regional = id_regional;
    }
    
    public void entrenar(){
        
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
        return super.toString()+ "Entrenador{" + "id_regional=" + id_regional + '}';
    }
    
}
