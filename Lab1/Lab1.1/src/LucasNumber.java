    /**
     * Клас, який представляє число Люка за вказаним індексом.
     * Виконує обчислення числа Люка та перевірку нерівності n*L(n+1) > (n+1)*L(n).
     */
    public class LucasNumber {
        /** Індекс числа Люка */
        private int index;

        /** Значення числа Люка */
        private long value;

        /**
         * Конструктор класу LucasNumber
         * @param index номер числа Люка
         */
        public LucasNumber(int index) {
            this.index = index;
            this.value = calculateLucas(index);
        }

        /**
         * Обчислює число Люка за заданим індексом
         * @param n індекс числа
         * @return значення числа Люка
         */
        private long calculateLucas(int n) {
            if (n == 0) return 2;
            if (n == 1) return 1;
            long a = 2, b = 1;
            for (int i = 2; i <= n; i++) {
                long c = a + b;
                a = b;
                b = c;
                System.out.println("Число Люка N" + i + " = " + c);
            }
            return b;
        }

        /**
         * Перевіряє нерівність n*L(n+1) > (n+1)*L(n)
         * @return true, якщо нерівність виконується, інакше false
         */
        public boolean checkInequality() {
            System.out.println("Перевірка нерівності:");
            long nextValue = calculateLucas(index + 1);

            long leftSide = index * nextValue;
            long rightSide = (index + 1) * value;

            System.out.println();
            System.out.println(index + " * L(" + (index + 1) + ") = " + leftSide);
            System.out.println("(" + (index + 1) + ") * L(" + index + ") = " + rightSide);

            boolean result = leftSide > rightSide;
            System.out.println("Результат: " + leftSide + (result ? " > " : " < ") + rightSide);

            return result;
        }


        /**
         * Повертає індекс числа Люка
         * @return індекс
         */
        public int getIndex() { return index; }

        /**
         * Повертає значення числа Люка
         * @return значення числа Люка
         */
        public long getValue() { return value; }
    }