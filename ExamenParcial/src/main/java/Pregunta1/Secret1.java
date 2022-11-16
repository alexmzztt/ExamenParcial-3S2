package Pregunta1;

interface Secret {
    String magic(double d);
}
//class Secret1 implements Secret {
//    public String magic(double d) {
//        return "Poof";
//    }
//}
class Secret2 {
    public static void main (String[] args) {
        Secret str = ( d -> "Poof2");
        System.out.println(str.magic(8));
        //Poof 2 para saber que es de Secret2

    }
}