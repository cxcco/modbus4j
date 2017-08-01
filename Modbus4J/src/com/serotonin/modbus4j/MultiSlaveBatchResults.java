package com.serotonin.modbus4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class MultiSlaveBatchResults {
	
	private final Map<String,BatchResults> data = new ConcurrentHashMap<>();
	
	public void addBatchResults(String slaveIdBatch,BatchResults value){
		data.put(slaveIdBatch, value);
	}
	
	public BatchResults getBatchResults(String slaveIdBatch){
		return data.get(slaveIdBatch);
	}

	public Map<String, BatchResults> getData() {
		return data;
	}
	
	
}
