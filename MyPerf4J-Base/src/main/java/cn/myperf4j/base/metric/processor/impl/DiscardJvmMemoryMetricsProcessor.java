package cn.myperf4j.base.metric.processor.impl;

import cn.myperf4j.base.metric.JvmMemoryMetrics;

/**
 * Created by LinShunkang on 2018/8/21
 */
public class DiscardJvmMemoryMetricsProcessor extends AbstractJvmMemoryMetricsProcessor {

    @Override
    public void process(JvmMemoryMetrics metrics, long processId, long startMillis, long stopMillis) {
        //empty
    }

}
