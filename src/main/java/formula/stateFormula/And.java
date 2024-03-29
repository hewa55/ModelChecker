package formula.stateFormula;

public class And extends StateFormula {
    public final StateFormula left;
    public final StateFormula right;
    private String formulaType = "And";

    public And(StateFormula left, StateFormula right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void writeToBuffer(StringBuilder buffer) {
        buffer.append("(");
        left.writeToBuffer(buffer);
        buffer.append(" && ");
        right.writeToBuffer(buffer);
        buffer.append(")");
    }

    @Override
    public String getFormulaType() {
        return formulaType;
    }

}