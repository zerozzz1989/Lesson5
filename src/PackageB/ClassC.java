package PackageB;

public class ClassC {
        double firstValue = 1.0;
        double secondValue = 1.0;
        String operation = "*";

        public ClassC() {
            System.out.println("You create StaticCalculator without params, set default values of fields:\n" +
                    "firstValue = 1.0, secondValue = 1.0, operation = \"*\"\n");
        }

        public ClassC(double firstValue, double secondValue, String operation) {
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.operation = operation;
        }
        public double calculate() {
            switch (operation) {
                case "*":
                    return firstValue * secondValue;

            }
            System.out.println("Your operation is inappropriate! Please enter one of: +, -, *, /");
            return 0;
        }
    }

