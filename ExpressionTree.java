public class ExpressionTree{
  public String toString(){
    if(isValue()){
      return getValue() + "";}
    return "(" + getLeft().toString() + " " + getOp() + " " + getRight().toString() + ")";}

  public String toStringPrefix(){
    if(isValue()){
      return getValue() + "";}
    return getOp() + " " + getLeft().toStringPrefix() + " " + getRight().toStringPrefix();}

  public String toStringPostFix(){
    if(isValue()){
      return getValue() + "";}
    return getLeft().toStringPrefix() + " " + getRight().toStringPrefix() + " " + getOp();}

  public double evaluate(){
    if(isValue()){
      return getValue();}
    return apply(getOp(), getLeft().evaluate(), getRight().evaluate())}

  public double apply(char op, double first, double second){
    if(op == '+'){
      return first + second;}
    if(op == '-'){
      return first - second;}
    if(op == '*'){
      return first * second;}
    if(op == '%'){
      return first % second;}
    return first / second;}

}
