package bolt_3;

public class consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
//constructor (es publico, ten o nome da clase)
    public consumo(){
    
}
    public consumo(float k, float litros, float vMed, float pG){
//   this(k,l,vM);
//   pGas =pG; otra manera de hacerlo
     this.km = k;
     this.litros =litros;
     this.vMed = vMed;
     this.pGas = pG;
}

    public void amosar(){
        System.out.println("KM : "+km+ " litros : "+litros+ " vMed : "+vMed+ " pGas : "+pGas);
    }
    //métodos de acceso
    public void setKm (float km){
           this.km=km;}       
    public float getKm (){
           return km;}
    public void setLitros (float litros){
           this.litros=litros;}       
    public float getLitros (){
           return litros;}
    public void setVMed (float vMed){
           this.vMed=vMed;}       
    public float getVMed (){
           return vMed;}
    public void setPGas (float pGas){
           this.pGas=pGas;}       
    public float getPGas (){
           return pGas;}
    
    public float consuMedio (){
        float consu = 100*litros/km;
        return consu;
    }




}
