
package quiz_abstrab;


public class calbadista extends EquipoNatacion{
    
    private int peso;
    private int estatuta;

    public calbadista() {
    }

    public calbadista(int peso, int estatuta) {
        this.peso = peso;
        this.estatuta = estatuta;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEstatuta() {
        return estatuta;
    }

    public void setEstatuta(int estatuta) {
        this.estatuta = estatuta;
    }
    
    public void ariesgado(){
        
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
        return super.toString()+"calbadista{" + "peso=" + peso + ", estatuta=" + estatuta + '}';
    }
    
}
