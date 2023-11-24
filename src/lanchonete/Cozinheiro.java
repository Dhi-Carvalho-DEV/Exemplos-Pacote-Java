package lanchonete;

public class Cozinheiro {

  // pode ser default
  public void adicionarLancheNoBalcao() {
    System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGER NO BALCÃO");
  }

  // pode ser default
  public void adicionarSucoNoBalcao() {
    System.out.println("ADICIONANDO SUCO NO BALCÃO");
  }

  // pode ser default
  public void adicionarComboNoBalcao() {
    adicionarLancheNoBalcao();
    adicionarSucoNoBalcao();
  }

  public void prepararLanche() {
    System.out.println("PREPARANDO LANCHE TIPO HAMBURGER");
  }

  public void prepararVitamina() {
    System.out.println("PREPARANDO SUCO");
  }

  public void prepararCombo() {
    prepararLanche();
    prepararVitamina();
  }

  public void selecionarIngredientesLanche() {
    System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
  }

  public void selecionarIngredientesVitamina() {
    System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
  }

  public void lavarIngredientes() {
    System.out.println("LAVANDO INGREDIENTES");
  }

  public void baterVitaminaLiquidificador() {
    System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
  }

  public void fritarIngredientesLanche() {
    System.out.println("FRITANDO A CARBE E OVO PARA O HAMBURGER");
  }

  public void pedirParaTrocarGas(Atendente meuAmigo) {
    meuAmigo.trocarGas();
  }

  public void pedirParaTrocarGas(Almoxarife meuAmigo) {
    meuAmigo.trocarGas();
  }

  public void pedirIngredientes(Almoxarife almoxarife) {
    almoxarife.entregarIngredientes();
  }
}