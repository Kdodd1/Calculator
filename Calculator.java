public class Calculator implements java.io.Serializable {
    private double operandOne;
    private String operation;
    private double operandTwo;
    private double results;

    public Calculator(){
    }

    public void performOperation(){
        if (this.getOperation() == "+"){
            setResults(this.getOperandOne() + this.getOperandTwo());
        } else if ( this.operation == "-"){
           setResults(this.getOperandOne() - this.getOperandTwo());
        }
    }

    public double getOperandOne() {
        return this.operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getOperandTwo() {
        return this.operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }
    
    public double getResults() {
        return this.results;
    }

    public void setResults(double results) {
        this.results = results;
    }

}