package edu.fatec.lp2.Conversor;

import java.util.ArrayList;
import java.util.List;

public class InstructionBatchConverter {
        public List<Double> executeBatchConversion(List<Convertible> instructions, List<Double> values) {
        List<Double> results = new ArrayList<>();
        for (int i = 0; i < instructions.size(); i++) {
            results.add(instructions.get(i).execute(values.get(i)));
        }
        return results;
    }
}

