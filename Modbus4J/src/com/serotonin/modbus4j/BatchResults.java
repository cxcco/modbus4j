/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2006-2011 Serotonin Software Technologies Inc. http://serotoninsoftware.com
 * @author Matthew Lohbihler
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.serotonin.modbus4j;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class BatchResults {
    private final Map<String, Object> data = new HashMap<>();

    public Map<String, Object> getData() {
		return data;
	}

	public void addResult(String key, Object value) {
        data.put(key, value);
    }

    public Object getValue(String key) {
        return data.get(key);
    }

    public Integer getIntValue(String key) {
        return (Integer) getValue(key);
    }

    public Long getLongValue(String key) {
        return (Long) getValue(key);
    }

    public Double getDoubleValue(String key) {
        return (Double) getValue(key);
    }

    public Float getFloatValue(String key) {
        return (Float) getValue(key);
    }
}
