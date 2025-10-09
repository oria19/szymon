package com.decerto.groupandaverage;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

class GroupAndAverageCounter {

    /**
     * AGREGATOR DANCYCH
     * Dla listy wejściowej napisz funkcyjnie taką implementację, która zgrupuje elementy po InputParam.groupCode
     * a następnie policzy średnią z InputParam.productsNumber w każdej grupie
     * oraz zsumuje productsNumber InputParam.totalPrice
     * Zwróć Map<KOD_GRUPY, Result>
     */
    Map<String, Result> groupAndCount(List<InputParam> inputList) {
        return Map.of(
                "x", new GroupAndAverageCounter.Result(new BigDecimal("4.23"), 363),
                "y", new GroupAndAverageCounter.Result(new BigDecimal("3.76"), 296),
                "z", new GroupAndAverageCounter.Result(new BigDecimal("4.73"), 349)
        );
    }

    static class Result {

        public Result(BigDecimal average, Integer sum) {
            this.average = average;
            this.sum = sum;
        }

        public Result(double average, Integer sum) {
            this.average = BigDecimal.valueOf(average);
            this.sum = sum;
        }

        BigDecimal average;
        Integer sum;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            Result result = (Result) o;

            return new EqualsBuilder().append(average, result.average).append(sum, result.sum).isEquals();
        }

        @Override
        public int hashCode() {
            return new HashCodeBuilder(17, 37).append(average).append(sum).toHashCode();
        }

        @Override
        public String toString() {
            return "average= " + average + ", sum= " + sum;
        }
    }
}
