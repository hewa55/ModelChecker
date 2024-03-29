package formula.stateFormula;

import formula.FormulaParser;

public class Not extends StateFormula {
    public final StateFormula stateFormula;
    private String formulaType = "Not";


    public Not(StateFormula stateFormula) {
        this.stateFormula = stateFormula;
    }

    @Override
    public void writeToBuffer(StringBuilder buffer) {
        buffer.append(FormulaParser.NOT_TOKEN);
        buffer.append("(");
        stateFormula.writeToBuffer(buffer);
        buffer.append(")");
    }

    @Override
    public String getFormulaType() {
        return formulaType;
    }

}