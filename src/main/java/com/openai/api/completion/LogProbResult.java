
package com.openai.api.completion;
import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class LogProbResult {
    List<String> tokens;
    List<Double> tokenLogprobs;
    List<Map<String, Double>> topLogprobs;
    List<Integer> textOffset;
}
