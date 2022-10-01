public class Checker {
    public void CheckerTriangulo(Triangulo triangulo){
        if (triangulo.getL1() == triangulo.getL2()){
            if(triangulo.getL1() == triangulo.getL3()){
                System.out.println("O triangulo eh Equilatero!");
            }else{
                System.out.println("O triangulo eh Escaleno!");
            }
        }else{
            if(triangulo.getL2() == triangulo.getL3()){
                System.out.println("O triangulo eh Escaleno!");
            }else{
                System.out.println("O triangulo eh Isosceles!");
            }
        }
    }
}
