public class calculadoraIMC {

IndiceMassaCorporal calcularIMC(Paciente aluno){
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.resultado = aluno.peso / (aluno.altura * aluno.altura);
    return imc;


}

}
