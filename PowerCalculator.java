
public class PowerCalculator implements iCalculable {
        /** Поле — значения первичного аргумента */
        private Double primaryArg;

        /**
         * Конструктор - создание нового объекта (Калькулятор)
         * @param primaryArg - значения первичного аргумента
         */
        public PowerCalculator(Double primaryArg) {
            this.primaryArg = primaryArg;
        }
    
        @Override
        public iCalculable sum(Double arg) {
            if (arg > Double.MAX_VALUE - primaryArg) throw new ArithmeticException("Maximum value exceeded");
            primaryArg += arg;
            return this;
        }
    
        @Override
        public iCalculable diff(Double arg) {
            primaryArg -= arg;
            return this;
        }
    
        @Override
        public iCalculable multi(Double arg) {
            if (arg > Double.MAX_VALUE / primaryArg) throw new ArithmeticException("Maximum value exceeded");
            primaryArg *= arg;
            return this;
        }
    
        @Override
        public iCalculable divis(Double arg) {
            if (arg == 0) throw new ArithmeticException("Devision by zero");
            primaryArg /= arg;
            return this;
        }

        public iCalculable calculatePower(Double arg) throws InvalidInputException {
            if (primaryArg == 0 & arg < 0) throw new InvalidInputException("Devision by zero");
            if (arg == 0) primaryArg = 1.0;
            Double factor = primaryArg;
            if (arg > 0) {
                while (--arg > 0){
                    primaryArg *= factor;
                } 
            }
            if (arg < 0) {
                while (++arg < 0){
                    primaryArg *= factor;
                }
                primaryArg = 1 / primaryArg;
            }
            return this;
        }
    
        
        public Double getResult() {
            return primaryArg;
        }
    
}
