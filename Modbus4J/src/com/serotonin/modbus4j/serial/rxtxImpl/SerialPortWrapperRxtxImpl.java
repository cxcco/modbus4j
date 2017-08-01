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
package com.serotonin.modbus4j.serial.rxtxImpl;

import gnu.io.SerialPort;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.serotonin.modbus4j.serial.SerialPortWrapper;

public class SerialPortWrapperRxtxImpl implements SerialPortWrapper {
	private final SerialParameters serialParameters;

	// Runtime fields.
	protected SerialPort serialPort;

	public SerialPortWrapperRxtxImpl(SerialParameters params) {
		serialParameters = params;
	}

	@Override
	public void open() throws Exception {
		serialPort = SerialUtils.openSerialPort(serialParameters);

	}

	@Override
	public void close() {
		SerialUtils.close(serialPort);
	}

	@Override
	public InputStream getInputStream() {
		try {
			return serialPort.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public OutputStream getOutputStream() {
		try {
			return serialPort.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int getBaudRate() {
		return this.serialParameters.getBaudRate();
	}

	@Override
	public int getFlowControlIn() {
		return this.serialParameters.getFlowControlIn();
	}

	@Override
	public int getFlowControlOut() {
		return this.serialParameters.getFlowControlOut();
	}

	@Override
	public int getDataBits() {
		return this.serialParameters.getDataBits();
	}

	@Override
	public int getStopBits() {
		return this.serialParameters.getStopBits();
	}

	@Override
	public int getParity() {
		return this.getParity();
	}

}
